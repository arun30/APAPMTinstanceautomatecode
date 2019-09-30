Feature: PMT Add Product List
Description: User will add part#


@productrelated2
Scenario: Adding part# with created product category
Given User will click on parts page and it will redirect to parts page
When User will click on the add buton and choose product category, sub category,part desc, product line
And User will enter the part# and click on save
Then User will see successfull alert and verify the part# thorugh part# search


@Parts
Scenario: Search part# by given dropdown list
Given User will click on parts page and it will redirect to parts page for part# search through dropdown
When User will choose the category, sub category, part description, product line and part# dropdown & search
Then User will see the search part# 
