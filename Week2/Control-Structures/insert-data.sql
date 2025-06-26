-- Sample Customers
INSERT INTO Customer VALUES (1, 'Ravi Kumar', 65, 8000, 10.5, 'FALSE');
INSERT INTO Customer VALUES (2, 'Anita Sharma', 59, 15000, 9.8, 'FALSE');
INSERT INTO Customer VALUES (3, 'Vikram Sen', 70, 5000, 11.2, 'FALSE');
INSERT INTO Customer VALUES (4, 'Meena Das', 45, 12000, 10.0, 'FALSE');

-- Sample Loans
INSERT INTO Loan VALUES (101, 1, SYSDATE + 10); 
INSERT INTO Loan VALUES (102, 2, SYSDATE + 40); 
INSERT INTO Loan VALUES (103, 3, SYSDATE + 5);  
INSERT INTO Loan VALUES (104, 4, SYSDATE + 25); 

COMMIT;
