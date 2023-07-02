Feature: Admin-Add Users
 
Background:
Given User Launch Chrome browser
When User opens URL"http:\\127.0.0.1\\orangehrm-4.8\\symfony\\web\\index.php\\auth\\login"
And User enters valid username "Admin" ans password "Subhash@9596"
And Click on Loing button

@regression
Scenario: Verify Add User functionality 

Then The page title should be "OrangeHRM"
When User click on Admin menu
And Click on Add button 
Then User can view Add Customer page
When User enter customer information
And click on Save button.
#And Close browser

@sanity
Scenario: Search User 

Then The page title should be "OrangeHRM"
When User click on Admin menu
Then User can view System Users page
When User enter Username for search 
And click on Search button.
#And Close browser