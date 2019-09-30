Feature: PMT Add Product List
Description: User will add Application related like vehicle, make & model


@applicationTest
	Scenario: Adding InterchangeName
	Given User will mouse over master and click Interchange Name
	When User will click Add Button and Enter Interchange name
	And User will select checkbox Interchange Type Name and enter Brand AAIA Name
	Then User will click save and accept the alert 
	
	
@applicationTest
	Scenario: Adding Interchange Part#
	Given User will mouse over master and click Interchange Part#
	When User will click Add Button and Select Interchange name
	And User will Enter the Interchange Part# and Select grade level
	And User will select Type code and enter internal & interchange notes
	Then User will click save button and accept the alert