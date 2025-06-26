SET SERVEROUTPUT ON;
DECLARE
    v_name Customer.Name%TYPE;
BEGIN
    FOR loan_rec IN (
        SELECT LoanID, CustomerID, DueDate
        FROM Loan
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        SELECT Name INTO v_name
        FROM Customer
        WHERE CustomerID = loan_rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.LoanID || 
                             ' for Customer ' || v_name || 
                             ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/