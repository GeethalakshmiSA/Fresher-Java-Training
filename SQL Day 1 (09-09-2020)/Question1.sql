create table Programmer (EmpNo numeric(5) unique, ProjId varchar(5), LastName varchar(30), FirstName varchar(30), 
HireDate date, Language varchar(15), TaskNo numeric(2), Privilege varchar(25));

desc Programmer;

insert into Programmer(EmpNo, LastName, FirstName, HireDate, ProjId, Language, TaskNo, Privilege) 
values (201, 'Gupta', 'Saurav', '1995-01-01', 'NPR', 'VB', 52, 'Secret');

insert into Programmer(EmpNo, LastName, FirstName, HireDate, ProjId, Language, TaskNo, Privilege) 
values (390, 'Ghosh', 'Pinky', '1993-05-01', 'KCW', 'Java', 11, 'Top Secret');

insert into Programmer(EmpNo, LastName, FirstName, HireDate, ProjId, Language, TaskNo, Privilege) 
 values (789, 'Agarwal', 'Praveen', '1998-08-31', 'RNC', 'VB', 11, 'Secret');

insert into Programmer(EmpNo, LastName, FirstName, HireDate, ProjId, Language, TaskNo, Privilege) 
values (134, 'Chaudhury', 'Supriyo', '1995-07-15', 'TIPPS', 'C++', 52, 'Secret');

insert into Programmer(EmpNo, LastName, FirstName, HireDate, ProjId, Language, TaskNo, Privilege) 
values (896, 'Jha', 'Ranjit', '1997-06-15', 'KCW', 'Java', 10, 'Top Secret');

insert into Programmer(EmpNo, LastName, FirstName, HireDate, ProjId, Language, TaskNo) 
values (345, 'John', 'Peter', '1999-11-15', 'TIPPS', 'Java', 52);

insert into Programmer(EmpNo, LastName, FirstName, HireDate, ProjId, Language, TaskNo, Privilege) 
values (563, 'Anderson', 'Andy', '1994-08-15', 'NITTS', 'C++', 89, 'Confidential');

select * from Programmer;
