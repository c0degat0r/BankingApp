Feature: Test Application functionality

  Background: 
    Given I open chrome browser
    And I visit the environment
    And I enter "john@codegator.us" username
    And I enter "Welcome2" password
    When I click the login button

  @application
  Scenario: Verify Application field
    Then I verify the Application on the home page
    Then I click on new button
    And I verify the first name field is required field
    Then I enter some text that id "00NHs00000gWijB" to the field to verify length no more than "codegatornumberonegood"
    And I click on the save button