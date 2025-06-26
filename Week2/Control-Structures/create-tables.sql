CREATE TABLE Customer (
    CustomerID     NUMBER PRIMARY KEY,
    Name           VARCHAR2(100),
    Age            NUMBER,
    Balance        NUMBER(10,2),
    InterestRate   NUMBER(5,2),
    IsVIP          VARCHAR2(5) DEFAULT 'FALSE' CHECK (IsVIP IN ('TRUE', 'FALSE')) 
);

CREATE TABLE Loan (
    LoanID         NUMBER PRIMARY KEY,
    CustomerID     NUMBER,
    DueDate        DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);
