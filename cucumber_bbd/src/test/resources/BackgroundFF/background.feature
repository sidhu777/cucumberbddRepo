Feature: Create account to a Facebook1
As a user u need to open facebook home page and do the validations

Background: Common steps of Scenarios are  written under background keyword11 
Given User need to be on a Facebook Login Page

Scenario: Validate First Name field12 
When User enters user "sidhu1sidhu@yahoo.co.in" first name 
#Then User checks user first name is present 
Then close browser


Scenario: Login with the valid crdntls13 
When User enters user "sidhu1sidhu@yahoo.co.in" first name 
When  User enters "gurunanak49" password 
And click on the Login
Then Logout from the Account 
Then close browser
