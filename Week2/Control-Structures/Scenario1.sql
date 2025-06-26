SET SERVEROUTPUT ON;

BEGIN
    FOR cust_rec IN (
        SELECT CustomerID, InterestRate
        FROM Customer
        WHERE Age > 60
    ) LOOP
        UPDATE Customer
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust_rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Discount applied to Customer ID: ' || cust_rec.CustomerID);
    END LOOP;
END;
/
