@Important
Feature: Create account to a Facebook10
As a user u need to open facebook home page and do the validations

@Smoke
Scenario: Validate First Name field111 
Given User need to be on a Facebook Login Page
When User enters user "sidhu1sidhu@yahoo.co.in" first name 
#Then User checks user first name is present 
Then close browser


@Smoke @Regression
Scenario: Login with the valid crdntls212 
Given User need to be on a Facebook Login Page
When User enters user "sidhu1sidhu@yahoo.co.in" first name 
When  User enters "gurunanak49" password 
And click on the Login
Then Logout from the Account 
Then close browser


Scenario: Validate First Name field313 
Given User need to be on a Facebook Login Page
When User enters user "sidhu1sidhu@yahoo.co.in" first name 
#Then User checks user first name is present 
Then close browser


@Regression
Scenario: Validate First Name field414 
Given User need to be on a Facebook Login Page
When User enters user "sidhu1sidhu@yahoo.co.in" first name 
#Then User checks user first name is present 
Then close browser


@Smoke
Scenario: Validate First Name field515 
Given User need to be on a Facebook Login Page
When User enters user "sidhu1sidhu@yahoo.co.in" first name 
#Then User checks user first name is present 
Then close browser