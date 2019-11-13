@WeddingRegistry 
Feature:  As an User
  I want to create weddding Registry with my credentails to Amazon application 
  In order to get access of the Registry wedding application features
  
#This is declarative BDD, not line by line description  

Scenario: 
	Given I am on the Amazon page URL
	And I naviagate to Registry for Wedding
	When I click on Create Your Registry  button
	And I Sign In with my credentails
    Then I can build the registry of my dreams
    And I can see a greeting header by our name