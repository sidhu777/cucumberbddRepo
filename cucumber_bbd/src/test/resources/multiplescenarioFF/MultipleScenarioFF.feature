Feature: Create account to a Facebook6
As a user u need to open facebook home page and do the validations

Scenario: Validate First Name field61 
Given User need to be on a Facebook Login Page
When User enters user first name 
#Then User checks user first name is present 
Then close browser


Scenario: Login with the valid crdntls62 
Given User need to be on a Facebook Login Page
When User enters user first name 
When  User enters password 
And click on the Login
#Then Logout from the Account 
Then close browser
