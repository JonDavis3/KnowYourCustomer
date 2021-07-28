DROP SCHEMA IF EXISTS `know_your_customer`;

CREATE SCHEMA `know_your_customer`;

use `know_your_customer`;

SET FOREIGN_KEY_CHECKS = 0;
CREATE TABLE `account` (
  `accountId` int(11) NOT NULL AUTO_INCREMENT,
  `accountNumber` int(8) NOT NULL,
  
  PRIMARY KEY (`accountId`),
  
  UNIQUE KEY `ACCT_NUMBER_UNIQUE` (`accountNumber`)

) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

CREATE TABLE `customer` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `forename` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  `dateOfBirth` DATE,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE `account_customer` (
  `accountId` int(11) NOT NULL,
  `customerId` int(11) NOT NULL,
  
  PRIMARY KEY (`accountId`,`customerId`),
  
  KEY `FK_ACCOUNT_idx` (`accountId`),
  KEY `FK_CUSTOMER_idx` (`customerId`)
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

SET FOREIGN_KEY_CHECKS = 1;
