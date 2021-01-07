Feature: Create account to a Facebook3
As a user u need to open facebook home page and do the validations

#Scenario: Validate First Name field 
#Given User need to be on a Facebook Login Page
#When User enters user "sidhu1sidhu@yahoo.co.in" first name 
##Then User checks user first name is present 
#Then close browser


Scenario: Login with the valid crdntls31 
Given User need to be on a Facebook Login Page
#When User enters user "sidhu1sidhu@yahoo.co.in" first name 
#When  User enters "gurunanak49" password 
When  Enter following data
     |Username |Passowrd|
     |sidhu1sidhu@yahoo.co.in|gurunanak49|
And click on the Login
Then Logout from the Account 
Then close browser
