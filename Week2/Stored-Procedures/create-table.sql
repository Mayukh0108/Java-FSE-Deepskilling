CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    AccountType VARCHAR2(20),
    Balance NUMBER
);

CREATE TABLE Employees (
    EmpID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DepartmentID NUMBER,
    Salary NUMBER
);

