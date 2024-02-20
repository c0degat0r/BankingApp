Feature: Test Application functionality
  I want to use this feature file to test the Application functionality

  Background: Verify the standard user credentials can login
    Given I open chrome browser
    And I visit the environment
    And I enter "john@codegator.us" username
    And I enter "Welcome2" password
    When I click the login button
    Then I should see the home page

  Scenario: Test the application Tab
    Given I click on Application Tab
    And I click on New Tab
    And I check that First Name field is present
    And I click save to confirm that this field is mandatory
    Then I enter letters to confirm the	required length of 20 characters
    Then I click the save button to varify the entry

  Scenario: Test the application Tab
    Given I click on the Application Tab
    And I click on New
    Then I verify that Middle Name field is present
    And I check the Middle Name is not required
    And I enter lenght of  20 characters to confirm
    Then I click the save button to confirm the entry

  Scenario: Test the application Tab
    Given I click on Application
    Then I clicke on New
    And I verify that Last Name field is present
    And I click save button to confirm that last Name field is mandatory
    Then I enter letters to confirm the	required length of 20 chrachters
    And I click save button to confirm

  Scenario: Test the application Tab
    Given I click on the Application
    And I click on the New tab
    Then I verify the dropdown field is present which has "00NHs00000gWil2" id
    And I click save to confirm that this field is required
    And I verify the dropdown options which has "00NHs00000gWil2" id
      | --None-- |
      | Divorced |
      | Married  |
      | Single   |
    And I verify the values are in alphabetical order
    Then I verify the default value is entered as none

  Scenario: Test the application Tab
    Given I verify the access as standard user
    And I verify that the Application Object tab is visible
