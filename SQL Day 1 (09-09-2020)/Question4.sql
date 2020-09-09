UPDATE Programmer SET ProjId = 'NITTS' , Language = 'C++' 
where FirstName like 'Saurav' and LastName like 'Gupta';

select * from Programmer;

UPDATE Books SET ShelfNo = 'S10' 
where Title like 'DBMS';

select * from Books;

DELETE FROM Programmer 
where FirstName like 'Supriyo' and LastName like 'Chaudhury';

select * from Programmer;

ALTER TABLE Weather ADD NatureOfClimate varchar(10);
UPDATE Weather SET NatureOfClimate = 'Rainy' where Low >= 60 and Low <=70;
UPDATE Weather SET NatureOfClimate = 'Snow' where Low >= 71 and Low <=80;
UPDATE Weather SET NatureOfClimate = 'Cloudy' where Low >= 81 and Low <=90;
UPDATE Weather SET NatureOfClimate = 'Sunny' where Low >= 91 and Low <=100;

Select * from Weather;

Drop table Weather;
