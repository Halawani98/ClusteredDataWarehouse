CREATE DATABASE IF NOT EXISTS `clustereddatawarehouse`;

USE `clustereddatawarehouse`;

USE clustereddatawarehouse;
CREATE TABLE IF NOT EXISTS Transactions(
DEAL_ID INT AUTO_INCREMENT PRIMARY KEY,
FROM_CURRENCY_ISO_CODE VARCHAR(3) NOT NULL,
TO_CURRENCY_ISO_CODE VARCHAR(3) NOT NULL,
DEAL_TIMESTAMP DATE NOT NULL,
DEAL_AMOUNT DECIMAL (10,2) NOT NULL,
CONSTRAINT unique_transaction UNIQUE (FROM_CURRENCY_ISO_CODE, TO_CURRENCY_ISO_CODE, DEAL_TIMESTAMP, DEAL_AMOUNT)
);