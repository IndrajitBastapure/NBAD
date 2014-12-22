DROP DATABASE IF EXISTS cafemathicdb;
CREATE DATABASE cafemathicdb;
USE cafemathicdb;
CREATE TABLE PRODUCT(
productCode int(11) NOT NULL,
productName VARCHAR(50),
catalogCategory VARCHAR(50),
imageURL VARCHAR(50),
description VARCHAR(300),
price decimal,
PRIMARY KEY (productCode)
);

CREATE TABLE USER(
userID int NOT NULL AUTO_INCREMENT,
userName VARCHAR(50),
firstName VARCHAR(50),
lastName VARCHAR(50),
emailAddr VARCHAR(100),
address1Field VARCHAR(80),
address2Field VARCHAR(80),
city VARCHAR(50),
state VARCHAR(50),
zipPostalCode VARCHAR(50),
country VARCHAR(50),
password VARCHAR(50),
PRIMARY KEY (userID)
);


CREATE TABLE ORDERITEM2(
OrderNumber int(50) NOT NULL,
ProductCode int(11) NOT NULL,
Quantity int(11) NOT NULL,
PRIMARY KEY (OrderNumber,ProductCode)
);

CREATE TABLE ORDERTABLE(
OrderNumber int(50) NOT NULL,
Date date NOT NULL,
UserID int(11) NOT NULL,
TaxRate float(11,0) NOT NULL,
TotalCost double(50,0) NOT NULL,
Paid bit(1) NOT NULL,
PRIMARY KEY (OrderNumber)
);

INSERT INTO PRODUCT 
  (productCode, productName, catalogCategory, imageURL, description, price)
VALUES 
(100,'Basic Maths Formula','Maths Reference Books','images/book1.png','This is a third edition of award winning Math-A-Trick. This book provides essential math skills to everyday life with best tricky solutions. Tested and full proof trick for every calculation. With this book in your packet you do not need a calculator in your pocket!!',51.00),
(101,'Advanced Maths Formula','Maths Reference Books','images/book1.png','Written by the famous Mathemeatician - Shekuntala Devi.This book provides the detailed list of all the Math Formulaes to all school levels and additional exercise helps in improving Maths Skills for the student. Grab your copy now!!!',58.00), 
(102,'GRE Maths','Maths Reference Books','images/gre.gif','The 2nd Edition Kumar Publishers by Author Ali  provides the student with greater knowledge in each topic and many practise exercise after every topic helps to achieve the Target of the student',60.50),
(103,'GMAT Maths','Maths Reference Books','images/gmat.gif','GMAT Maths- The Complete Reference, by Wifi Publishers. This book provides the basic understanding of math concepts for Beginners,Intermediate, Advanced Levels. Free Pratice tests provided inside.',51.50),
(104,'Pre Calculus','Maths Reference Books','images/calculus.gif','Calculus by Gold boy 2nd Edition. the famous book sold out in record number is back with more advanced topics and examples for beginners. This book provides essential skills to enhance the calculus knowledge',50.00),
(105,'Elementary Statistics','Maths Reference Books','images/Estatistics.gif','This is a third edition of award winning Math-A-Trick. This book provides essential math skills to everyday life with best tricky solutions. Tested and full proof trick for every calculation. With this book in your packet you do not need a calculator in your pocket!!',20.00),
(106,'Business Statistics','Maths Reference Books','images/Bstatistics.gif','Business Staistics-10th Edition By Arya Bhatta. This book provides the staistical calculations and analysis models required to develop a business data. New Edition include Topics like Business Mathematics , Economic Data  and Staistics Stub',36.00),
(107,'Probability Distribution','Maths Reference Books','images/Bstatistics.gif','Probablity Distribution -8th Edition by MyMath Publications. This book is mostly useful for Engineering students. Includes the general topics with advanced technical implementation for solutions.10 % off on first 100 purchases ',20.00),
(108,'Basic Calculator','Maths Manipulatives, supplies and resources','images/BasicCalc.gif','Basic Calculator by Digi Systems provides the basic calculator for daily use in home, office for students. special offers for school students on purchase of Digi System Tablets.',20.00),
(109,'Advanced Calculator','Maths Manipulatives,supplies and resources','images/AdvCalc.gif','Avanced Calc- I can calculate any thing. This product can solve upto 32 digits of calculation. The latest product is exceptional in performing larger number operations used by Engineers and Researchers',40.00),
(110,'Maths GRE Flash cards','Maths Manipulatives, supplies and resources','images/greflash.gif','Gre Flash-5000 by Sybroski. The Flash cards provide the complete meanings of GRE and GMAT Aspiriants. This cards can help the students to learn more in less time and achieve the target score. ',15.00),
(111,'geometry/trigonometry flash cards','Maths Manipulatives, supplies and resources','images/alge-gemtry.png','Geometry Flash Cards by Silver Collins. This card is essential guide to children to enhance their knowledge in Geometry. Clear description of problem with images help the children to understand in better way makes this book childrrens choice',19.00),
(112,'Algebra Supplies','Maths Manipulatives, supplies and resources','images/alge-supplies.png','Algebra Equipments by Cam Corporations is one of the best suppliers in the town with best quality to the price. Special offers applicable for bulk orders',19.00);

INSERT INTO USER 
  (userName,firstName, lastName, emailAddr, address1Field, address2Field, city, state, zipPostalCode, country, password)
VALUES 
('user2','Rickey', 'Galor', 'rickey@hotmail.com', '1212 canadian dr', 'no.108', 'charlotte', 'NC', '28266', 'United Sates','pass1'),
('user3','Peter', 'Arevalo', 'peter@hotmail.com', '1234 rooster dr', 'no.109', 'charlotte', 'NC', '28267', 'United Sates','pass2'),
('user4','Malini', 'Chavis', 'malini@hotmail.com', '1255 lake ave', 'no.110', 'charlotte', 'NC', '28268', 'United Sates','pass3'),
('user5','Kite', 'Penn', 'kite@hotmail.com', '1111 caramel dr', 'no.111', 'charlotte', 'NC', '28269', 'United Sates','pass4');

CREATE TABLE UserPass (
  Username varchar(15) NOT NULL PRIMARY KEY,
  Password varchar(15) NOT NULL
);
  
INSERT INTO UserPass VALUES ('admin', 'admin'),
                            ('user2', 'sesame'),
                            ('user3', 'sesame');
                          
CREATE TABLE UserRole (   
  Username VARCHAR(15) NOT NULL,
  Rolename VARCHAR(15) NOT NULL,

  PRIMARY KEY (Username, Rolename)
);
  
INSERT INTO UserRole VALUES ('admin', 'admin'),
                            ('user2', 'programmer'),
                            ('user3', 'programmer');
