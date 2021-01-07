Feature: Create account to a Facebook2
As a user u need to open facebook home page and do the validations

Scenario Outline: Login with the valid crdntls21 
Given User need to be on a Facebook Login Page
When User enters user "<users>" first name 
When  User enters "<pwd>" password 
And click on the Login
Then Logout from the Account 
Then close browser
Examples:
 |users| pwd|
 |sidhu1sidhu@yahoo.co.in|gurunanak49|
 |gopaiahchillamail.com|1452|
