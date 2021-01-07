Feature: Create account to a Facebook7
As a user u need to open facebook home page and do the validations

Scenario: Validate First Name field71 
Given User need to be on a Facebook Login Page
When User enters user first name 
Then User checks user first name is present 



Scenario: Login with the valid crdntls72 
Given User need to be on a Facebook Login Page
When User enters user first name 
When  User enters password 
And click on the Login
Then Logout from the Account 
