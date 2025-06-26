CREATE OR REPLACE PROCEDURE TransferFunds (
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
) IS
    insufficient_balance EXCEPTION;
BEGIN
    -- Check balance
    DECLARE
        current_balance NUMBER;
    BEGIN
        SELECT Balance INTO current_balance
        FROM Accounts
        WHERE AccountID = from_account
        FOR UPDATE;

        IF current_balance < amount THEN
            RAISE insufficient_balance;
        END IF;

        -- Deduct from source
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = from_account;

        -- Add to destination
        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = to_account;

        COMMIT;
    EXCEPTION
        WHEN insufficient_balance THEN
            ROLLBACK;
            DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance.');
        WHEN OTHERS THEN
            ROLLBACK;
            DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
    END;
END;
/
