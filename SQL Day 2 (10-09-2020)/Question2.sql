/* Display the maximum price of the items ordered */
Select ItemId, ItemName, Price as Max_Price from Items where MaxQTY = (Select max(MaxQTY) from Items); 

/* For all of the items that were ordered in the ORDERS table, what is the price of the lowest item ordered? */
Select Price from Items where ItemId = (Select ItemId from Orders where Quantity = (select min(Quantity) from Orders));

Select Orders.OrderId, Items.ItemId, Items.ItemName, Items.Price from Items , Orders where Orders.OrderId in 
(Items.ItemId and Items.ItemId = (select Items.ItemId from Items where Items.Price = (select min(Price) from Items)));


/* How many people are in each unique state in the customer table? Select the state and display the number of people in each */
Select City, count(City) as "Count Of People" from Customer group by City;

/* How many people are in each unique state in the customers table that have more than one person in the state? Select the state and display the number of how many people are in each if it's greater than 1 */
Select City, count(City) as 'Count' from Customer group by City having count(City)>1;

/* From the ORDERS table, select the item, maximum price, and minimum price for each specific item in the table. Only display the results if the maximum price for one of the items is greater than 190.00 */
select * from Items where price = (select max(price) from items where price>190);

