Feature: searching products

Scenario Outline: searching products in google 

Given i am on the home page

When I enter the "<Product_name>" in the search bar
And I click on the search button



Then I can see search results successfully

Examples: 
|Product_name|
|Computer|
|Football|
|Flower|