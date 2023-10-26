CREATE TABLE Employee (
  Id INT PRIMARY KEY,
  Name VARCHAR(15),
  Department VARCHAR(10),
  Salary NUMBER(8, 2),
  Gender VARCHAR(10),
  Comm INT,
  City VARCHAR(10)
);

INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1001, 'John', 'IT', 35000, 'Male', 3500, 'London');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1002, 'Smith', 'HR', 45000, 'Female', 4500, 'Mumbai');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1003, 'James', 'Finance', 50000, 'Male', 5000, 'Delhi');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1004, 'Mike', 'Finance', 50000, 'Male', NULL, 'London');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1005, 'Linda', 'HR', 75000, 'Female', NULL, 'Mumbai');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1006, 'Anurag', 'IT', 35000, 'Male', NULL, 'London');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1007, 'Priyanla', 'HR', 45000, 'Female', NULL, 'Mumbai');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1008, 'Sambit', 'IT', 55000, 'Male', 5500, 'London');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1009, 'Pranaya', 'IT', 57000, 'Male', 5700, 'London');
INSERT INTO Employee (Id, Name, Department, Salary, Gender, Comm, City) VALUES (1010, 'Hina', 'HR', 75000, 'Female', 7500, 'Mumbai');


