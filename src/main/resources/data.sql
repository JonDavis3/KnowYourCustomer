CREATE TABLE account (
  accountId INT AUTO_INCREMENT  PRIMARY KEY,
  accountNumber INT(8) NOT NULL UNIQUE
);

CREATE TABLE customer (
  customerId INT AUTO_INCREMENT PRIMARY KEY,
  forename varchar(45) DEFAULT NULL,
  surname varchar(45) DEFAULT NULL,
  dateOfBirth DATE DEFAULT NULL
);

CREATE TABLE account_customer (
  accountId INT NOT NULL,
  customerId INT NOT NULL,
  PRIMARY KEY (accountId,customerId),
  CONSTRAINT FK_ACCOUNT_idx FOREIGN KEY (accountId) REFERENCES account (accountId),
  CONSTRAINT FK_CUSTOMER_idx FOREIGN KEY (customerId) REFERENCES customer (customerId)
);

