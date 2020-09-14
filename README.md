# Taxcalculator
The application prints out the receipt details for shopping baskets

The application is written in Java 

Problem Statement:

Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. 
Import duty is anadditional sales tax applicable on all imported goods at a rate of 5%,with no exemptions.
When I purchase items I receive a receipt which lists the name of all the items and their price (including tax), 
finishing with the total cost ofthe items, and the total amounts of sales taxes paid. 
The rounding rules for sales tax are that for a tax rate of n%, 
a shelf price of pcontains (np/100 rounded up to the nearest 0.05) amount of sales tax.

To build the project: 

Run [mvn compile] from the project root folder

To run the application:
1. Inputs files should be placed inside the resources folder as: 
   testdata1.txt,testdata2.txt,testdata3.txt for each of the test cases
2. Run [mvn test] from the project root folder
