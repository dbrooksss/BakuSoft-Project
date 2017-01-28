CREATE DATABASE baku;
USE baku;

CREATE TABLE Employees
(
   EmployeeID INT IDENTITY(1, 1) PRIMARY KEY,
   FirstName  VARCHAR(20) NOT NULL,
   LastName   VARCHAR(20) NOT NULL,
   Username   VARCHAR(20) NOT NULL,
   Password   VARCHAR(20) NOT NULL,
);

CREATE TABLE Customers
(
   CustomerID   INT IDENTITY(1, 1) PRIMARY KEY,
   FirstName    VARCHAR(20) NOT NULL,
   LastName     VARCHAR(20) NOT NULL,
   Address      VARCHAR(50) NOT NULL,
   City         VARCHAR(30) NOT NULL,
   State        CHAR(2) NOT NULL,
   Zip          VARCHAR(9) NOT NULL,
   County       VARCHAR(20) NOT NULL,
   PolicyNumber VARCHAR(15) NOT NULL,
   PhoneNumber  VARCHAR(20) NOT NULL,
   Contacted    VARCHAR(10) NOT NULL CHECK (Contacted IN('T', 'F'))
); 


