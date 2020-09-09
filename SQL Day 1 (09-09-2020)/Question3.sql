create table Books (BookId numeric(4) primary key, Title varchar(10) not null, TopicId varchar(10), PublisherName 
varchar(30), PlaceOfPublication varchar(20), Price int, PurchaseDate date not null, ShelfNo varchar(5));

insert into Books (BookId, Title, TopicId, PublisherName, PlaceOfPublication, Price, PurchaseDate, ShelfNo) values
(8293, 'DBMS', 'DB1', 'Prentice Hall', 'Mumbai', 255, '1995-01-01', 'S11'),
(5645, 'DBMS', 'DB1', 'Pearson Education', 'Mumbai', 655, '1993-01-05', 'S12'),
(6565, 'C', 'C1', 'TMH', 'Mumbai', 840, '1998-08-31', 'S66'),
(6567, 'C++', 'Cplus1', 'ABC Publishers', 'Delhi', 300, '1995-07-15', 'S77'),
(4576, 'JAVA', 'JAVA1', 'Guru Govind Publications', 'Delhi', 500, '1997-06-15', 'S87'),
(3433, 'OOPS', 'OOPS1', 'Dave Publishers', 'Pune', 600, '1999-11-15', 'S56'),
(4655, 'SAD', 'SAD1', 'Sajan Publications', 'Cochin', 700, '1994-08-15', 'S76');

select * from Books;