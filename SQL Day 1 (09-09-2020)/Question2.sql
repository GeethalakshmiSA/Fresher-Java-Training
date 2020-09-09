create table Weather (City varchar(30) primary key, State varchar(30), High int, Low int);

insert into Weather values ('Calcutta', 'West Bengal', 105, 90);
insert into Weather values ('Trivandrum', 'Kerala', 101, 92);
insert into Weather values ('Mumbai', 'Maharashtra', 88, 69);
insert into Weather values ('Bangalore', 'Karnataka', 77, 60);
insert into Weather (City, High, Low) values ('New Delhi', 80, 72);

select * from Weather;
