#Author: Subhash Ingale
#Keywords Summary :Verify Forgot Your Passwrod Functionality 

Feature: Forgot Your Password 
 
Scenario: Verify Forgot Your Password functionality .
Given User Launch Chrome browser
When User opens URL"http:\\127.0.0.1\\orangehrm-4.8\\symfony\\web\\index.php\\auth\\login"
And Click on Forgot Passwrod Link
Then User can view the title of page "Forgot Your Password?"
When  User enter Username in text as "Admin"
And Click on Reset Password button
And Close browser