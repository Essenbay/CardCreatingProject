Create Database catalog;
Use catalog;
Create Table debits(id int, balance int, dateOfCreation Date, firstname CHAR(50), lastname CHAR(50), address CHAR(50), phoneNumber CHAR(12), annualMaintenance int, primary key(id));
Create Table credits(id int, balance int, dateOfCreation Date, firstname CHAR(50), lastname CHAR(50), address CHAR(50), phoneNumber CHAR(12), interestRate int, maturityDate Date, primary key(id));
Create Table saves(id int, balance int, dateOfCreation Date, firstname CHAR(50), lastname CHAR(50), address CHAR(50), phoneNumber CHAR(12), interestRate int, storageData Date, primary key(id));

				
SELECT * from debits;
SELECT * from credits;
SELECT * from saves;
SELECT balance, dateOfCreation, firstname, lastname FROM debits, credits, saves;
SELECT * from debits Where lastname = "last";
INSERT INTO debits (id, balance, dateOfCreation, firstname, lastname, address, phoneNumber, annualMaintenance) VALUES (1, 0, '2001.0.0', "first", "last", "add", "8747", 10);
INSERT INTO credits (id, balance, dateOfCreation, firstname, lastname, address, phoneNumber, interestRate, maturityDate) VALUES (1, 0, '2001.1.1', "first", "last", "add", "8747", 10, '2002.1.1');
INSERT INTO saves (id, balance, dateOfCreation, firstname, lastname, address, phoneNumber, interestRate, storageData) VALUES (1, 0, '2001.1.1', "first", "last", "add", "8747", 10, '2002.1.1');
UPDATE debits SET balance = 1000 WHERE id = 1;
truncate table debits;
truncate table credits;
truncate table saves;

Drop table accounts;
Drop table debits;
Drop table saves;
Drop table credits;