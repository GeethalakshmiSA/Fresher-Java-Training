/* Select the fname, city and country from the customers table for 
all of the rows where the city value is either: Chennai, Salem or Madurai. */

Select FName, City, Country from Customer where City in ('Chennai', 'Salem', 'Madurai');


/* Write a query using a join to determine which items were ordered by each of the customers in the customer table. 
Select the custid, fname, lname, datefirstpurchased, item and price for everything each customer purchased 
in the item table. */

Select c.CustId, c.FName, c.LName, c.DateFirstPurchased, i.ItemId, i.ItemName, i.Price 
from Customer c inner join Items i where c.SupplierId = i.SupplierId;



/* Display using a subquery all the orders for “dove soap”. */

Select * from Orders, Items 
where Orders.ItemId = (Select Items.ItemId from Items where Items.ItemName like 'Dove Soap') 
and Items.ItemId = (Select Items.ItemId from Items where Items.ItemName like 'Dove Soap');
