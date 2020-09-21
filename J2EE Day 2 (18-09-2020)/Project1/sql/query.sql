create database PetRegistration;
use PetRegistration;
create table Registration(FirstName varchar(20) not null, LastName varchar(20), 
Address varchar(50) not null, EmailID varchar(40), City varchar(20) not null, State varchar(20) not null, 
PhoneNumber numeric(10) not null, PetName varchar(20), PetType varchar(20) not null, 
PetAge numeric(2));
desc Registration;
select * from Registration;