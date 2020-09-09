create table Supplier(SupplierId int primary key, SName char(30), SCity varchar(30), SPhone numeric(10) not null, 
Email varchar(50) unique);

insert into Supplier values(1, 'Dilip', 'Chennai', 8999900000, 'dilip@abc.co.in');
insert into Supplier values(2, 'Tarun', 'Madurai', 8999911111, 'tarun@xyz.com');
insert into Supplier values(3, 'Naresh', 'Coimbatore', 8999922222, 'g.naresh@xyz.com');
insert into Supplier values(4, 'Ganesan', 'Trichy', 8999933333, 'Ganesan_83@ijk.com');

select * from Supplier;

create table Customer (CustId int primary key, FName varchar(30), LName varchar(30), Address varchar(50), 
PhoneNo numeric(10) not null, City varchar(20), Country varchar(20), DateFirstPurchased date, SupplierId int, 
foreign key(SupplierId) references Supplier(SupplierId));

insert into Customer (CustId, FName, LName, Address, PhoneNo, City, Country, DateFirstPurchased, SupplierId) values
(1001, 'Das', 'Jayaseelan', '119,park Avenue, II street', 9841093428, 'Coimbatore', 'India', '2004-01-10' , 1),
(2001, 'Gopi', 'Govindraj', '241, I floor, Kamaraj street, Madippakkam', 9444124590, 'Chennai', 'India', '2005-03-25' , 4),
(1201, 'Dilip', 'Kishore', '43,II Avenue, Anna Nagar', 9997234534, 'Bangalore', 'India', '2004-08-20', 2),
(1300, 'Anand', 'Chowdhury', '42/1 sector 1, II street', 9841054348, 'Bangalore', 'India', '2005-05-15', 2),
(1220, 'Chandra', 'Nagarajan', '83, lal bagh', 9841067235, 'Bangalore', 'India', '2006-02-12', 4),
(1221, 'Abhishek', 'Kumar', '13, kishori park', 9444762390, 'Chennai' , 'India' , '2004-05-15', 1),
(1320, 'Nikhil', 'Pandit', '218, alwanya street', 9444892309, 'Salem', 'India', '2006-04-21', 3),
(1222, 'Meenu', 'Monica', 'C11, church road', 9841056342, 'Trichy', 'India', '2004-08-30', 1),
(1225, 'Pavan', 'Kumar', '128/A, North Mada Street', 9993478210, 'Madurai', 'India', '2004-08-18',4);

select * from Customer;

create table Items(ItemId int primary key, ItemName varchar(35) not null, SupplierId int,
MinQTY numeric not null, MaxQTY numeric not null, Price numeric(5,2), foreign key (SupplierId) references Supplier(SupplierId));

insert into Items values (20, 'Pears Soap', 4, 7,20,30.00);
insert into Items values (21, 'V.V.D. Coconut oil 200 ml', 2, 8, 15, 79.00);
insert into Items values (22, 'Ponds powder 400g', 3, 6, 25, 106.00);
insert into Items values (23, 'Reynolds pen- blue', 1, 10, 30, 15.00);
insert into Items values (24, 'Reynolds pen- black', 1, 10, 30, 16.00);
insert into Items values (25, 'Mysore sandal soap', 4, 7, 25, 25.00);
insert into Items values (26, 'Fair & lovely cream - 50g', 3, 5, 15, 55.00);
insert into Items values (27, 'Rexono deo spray', 2, 5, 20, 100.00);
insert into Items values (28, 'Dove soap', 4, 7, 15, 85.00);

Select * from Items;

create table Orders(OrderId int primary key, OrderDate date, CustId int, Quantity int Check(Quantity > 0), 
ItemId int, foreign key(ItemId) references Items(ItemId));

insert into Orders values(1, '2004-01-12', 1001, 30, 25);
insert into Orders values(2, '2005-05-06', 1202, 38, 24);
insert into Orders values(3, '2006-12-16', 1220, 10, 22);
insert into Orders values(4, '2004-05-21', 1233, 12, 21);

Select * from Orders;