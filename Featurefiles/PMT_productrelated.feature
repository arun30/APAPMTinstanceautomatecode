Feature: PMT Add Product List
Description: User will add product category,sub category & part description

@productrelated
Scenario: Adding product category
Given User will mouse hover and choose the product category page
When User will click on the add button and add a new category
And User will enter the category name and choose the equivalent PIES category
Then User will successfully added and verify that the record has come

@productrelated
Scenario: Adding product sub category
Given User will go to master and choose product sub category
When User will click on the add button and choose the category drop down list 
And User will enter the sub category name  and choose the equivalent and save button is clicked
Then User will successfully added and verify the record has come in the sub category grid

@productrelated
Scenario: Adding part description 
Given User will go to master and choose part description
When User will click on the add button and choose the category & sub category drop down list 
And User will enter the part description name  and save button is clicked
Then User will see successfully added and verify the record has come in the description grid


Scenario: Adding product Line
Given User will go to master and choose product line
When User will click on add button and enter the line code and line name
Then User will see successfully alert and verify the record has come in the grid