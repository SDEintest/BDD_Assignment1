@ExecuteAll
Feature: Testing for the Cars.com website happy path
Background:
	Given I launch to the Chrome browser             
	

@Validate_Edmundapplication
Scenario: validate homepage of Edmund application
    Given I Enter the  Edmund application name
    Then  I validate login button is displayed or not
    Then  I click on Login button
    Then  I enter email id
    And  I click on continue button
    Then I enter password
    And I click on submit button
    Then I validate the homepage displayed properly 
    Then I close the browser
	
@Validate_
Scenario: Validate if the research button works correctly
   Then  I validate the Research button
   When  I click on the Research button   
   Then  I validate the Research page being displayed correctly
   
@Validate_CarsForSell
Scenario: Validate if the cars for sell button works correctly
   Then  I validate the Cars For Sell button
   When  I click on the Cars For Sell button
   Then  I validate the Cars For Sell page being displayed correctly






	
	
Scenario: Validate if the car buying tools page was displayed correctly
   Given I login to the Cars application
   Then  I validate that the Research button is displayed and enabled succesfully
   When  I click on the Research button
   Then  I validate the Research page being displayed correctly
   Then  I validate the tool button is displayed or not
   When  I click on the Tool button
   Then  I validate the Tool page being displayed correctly
   
Scenario: Validate if the user is able to choose brand (Infinity) of the car
  Given  I login to the Cars application
  Then   I click on the Cars for Sell button
  When   I validate the Cars for Sell page is displayed correctly
  And    I validate the presence of By Category button
  Then   I click on the By category button
  Then   I select sedan
  And    I click on Choose Makes button
  Then   I validate if Infiniti is displayed on the page
