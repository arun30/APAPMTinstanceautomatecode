Feature: PMT Add Product List
Description: User will add Application related like vehicle, make & model

@applicationTest1
Scenario: Adding Application Related vehicle type, Make & Model Test Cases
Given User will mouse hover on Master and choose the vehicle type page
When User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save
Then User will successfully added and verify the added record should be shown in vehicle grid

@applicationTest1
Scenario: Adding Application Related Make
Given User will mouse hover on master and choose the make 
When User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save   
Then User will successfully added and verify the added record should be shown in make grid

@applicationTest1
Scenario: Adding Application Related Model
Given  User will mouse hover on master and choose the model 
When User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save
Then User will successfully added and verify that the record has come.