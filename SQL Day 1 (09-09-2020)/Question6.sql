
Select * from Customer where City like 'Chennai';

Select * from Customer where SupplierId = 2;

Select CustId, FName, LName from Customer where DateFirstPurchased >= '2005-01-01';

Select * from Supplier where SCity like 'Coimbatore';

Select * from Supplier where SName like 'G%';

Select * from Customer where LName not like '%e%';

Select * from Customer where DateFirstPurchased >= '2006-01-01' and DateFirstPurchased <= '2006-12-31' 
order by DateFirstPurchased DESC;

Select * from Orders where Quantity <= 35;

Select * from Items where SupplierId = 4;

Select * from Items where SupplierId = 3 and MinQTY > 7 order by ItemId;

