CREATE TABLE Customer
(
  email INT NOT NULL,
  cust_name INT NOT NULL,
  cust_id INT NOT NULL,
  PRIMARY KEY (cust_id)
);

CREATE TABLE Bank
(
  branch_id INT NOT NULL,
  state INT NOT NULL,
  district INT NOT NULL,
  pincode INT NOT NULL,
  name INT NOT NULL,
  PRIMARY KEY (branch_id)
);

CREATE TABLE Loan
(
  loan_no INT NOT NULL,
  amount INT NOT NULL,
  branch_id INT NOT NULL,
  PRIMARY KEY (loan_no),
  FOREIGN KEY (branch_id) REFERENCES Bank(branch_id)
);

CREATE TABLE BORROWS
(
  cust_id INT NOT NULL,
  loan_no INT NOT NULL,
  PRIMARY KEY (cust_id, loan_no),
  FOREIGN KEY (cust_id) REFERENCES Customer(cust_id),
  FOREIGN KEY (loan_no) REFERENCES Loan(loan_no)
);

CREATE TABLE Customer_Contact
(
  Contact INT NOT NULL,
  cust_id INT NOT NULL,
  PRIMARY KEY (Contact, cust_id),
  FOREIGN KEY (cust_id) REFERENCES Customer(cust_id)
);

CREATE TABLE Account
(
  acc_type INT NOT NULL,
  acc_no INT NOT NULL,
  balance INT NOT NULL,
  activation_date INT NOT NULL,
  branch_id INT NOT NULL,
  PRIMARY KEY (acc_no),
  FOREIGN KEY (branch_id) REFERENCES Bank(branch_id)
);

CREATE TABLE HOLDS
(
  cust_id INT NOT NULL,
  acc_no INT NOT NULL,
  PRIMARY KEY (cust_id, acc_no),
  FOREIGN KEY (cust_id) REFERENCES Customer(cust_id),
  FOREIGN KEY (acc_no) REFERENCES Account(acc_no)
);