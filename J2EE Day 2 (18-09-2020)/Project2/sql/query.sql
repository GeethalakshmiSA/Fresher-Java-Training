create database registration;
use registration;
create table User(loginId varchar(20) primary key, password varchar(20) not null);
desc User;

insert into User(loginId, password) values('TAMMY', 'tammy123');
insert into User(loginId, password) values('JOHN', 'john123');
insert into User(loginId, password) values('ARYA', 'arya123');
insert into User(loginId, password) values('VIJAY', 'vijay123');
insert into User(loginId, password) values('VIJAYKUMAR', 'vijaykumar.123');
insert into User(loginId, password) values('SANGEETHA', '1234567890');
insert into User(loginId, password) values('PRABHA', 'AHBARP.');

select * from User;