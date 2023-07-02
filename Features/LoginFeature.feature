#Author: Subhash
#Keywords Summary :To verfy Login Functionalty of HRM Application
#Feature: List of scenarios.

Feature: Login

Background: Steps comman for all scenarios 

Scenario: Successful Admin Login with valid credentials 

Given User Launch Chrome browser
When User opens URL"http:\\127.0.0.1\\orangehrm-4.8\\symfony\\web\\index.php\\auth\\login"
And User enters valid username "Admin" ans password "Subhash@9596"
And Click on Loing button
Then The page title should be "OrangeHRM"
And Close browser

Scenario Outline: Sucessful Login with valid credentials DDT

Given User Launch Chrome browser
When User opens URL"http:\\127.0.0.1\\orangehrm-4.8\\symfony\\web\\index.php\\auth\\login"
And User enters valid username "<username>" ans password "<password>"
And Click on Loing button
Then The page title should be "OrangeHRM"
And Close browser

Examples:
|username|password|
|Admin|Subhash@9596|
|Admin|123456|

