Feature: MyAccount-Login Feature
Description: This feature will test a login feature

#Simple login without parameters
#Scenario: Login with valid username and password
#Given open browser
#When Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username and password
#And Click on login button
#Then User must successfully login to the web page


#Simple login without parameters
#Scenario: Login with valid username and password
#Given open browser
#When Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username "pavanoltraining" and password "Test@selenium123"
#And Click on login button
#Then User must successfully login to the web page


#Simple login without parameters
#Scenario Outline: Login with valid username and password
#Given open browser
#When Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username "<username>" and password "<password>"
#And Click on login button
#Then Verify login

#Examples:
#| username        | password         |
#| pavanoltraining | Test@selenium    |
#| pavanol		  | Test@selenium123 |
#| pavanol		  | Test@selenium    |



#Simple login with Data Table parameters
Scenario: Login with valid username and password
Given open browser
When Enter the url "http://practice.automationtesting.in/"
And Click on My Account Menu
And Enter registered username and password 
| user  | password  |
| pavanoltraining | Test@selenium123 |
| pavanoltraining | Test@selenium123 |
And Click on login button
Then User must successfully login to the web page
#Then Verify login

















