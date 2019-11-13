@SignIn
Feature: Sign In 
	As an User
  I want to Sign In with my credentails to Amazon application 
  In order to get access of the application features
  
#This is imperative BDD, line by line description

Background: User navigates to Application URL 
	Given I am on the Amazon page URL "https://www.amazon.com" 
	Then I should see the title and logo of the Amazon application 
	
	
Scenario: Sign in with valid credential 
	When I hover over on sign in area 
	And I click on signin button 
	And I enter email in input field as "tofael483@gmail.com" 
	And I click in continue button 
	And I enter password in input field as "Nabeeha19" 
	And I click in SignIn button 
	Then I sould see the title of the SignIn page 
	
    