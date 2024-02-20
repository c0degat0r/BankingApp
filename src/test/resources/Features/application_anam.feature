Feature: Test Application Functionality
  I want to use this feauture file to test the Application Functionality

  Background: Verify the standard user credentials can login
    Given I open chrome browser
    And I visit the environment
    Then I enter "john@codegator.us" username
    Then I enter "Welcome2" password
    When I click the login button
    Then I should see the home page

  @tag
  Scenario: Test the Application Tab
    Given I click on Application 
    Then I click on the New Tab
    Then I verify the First Name field is present
    And I click save to confirm that the field is mandatory
    And I enter the letters to confirm the required length of 20 characters
    And I click the save button

@tag1
  Scenario: Test the Application Tab
    Given I click on Application 
    Then I click on the New Tab
    Then I verify that Middle Name field is present
    Then I verify the Middle Name field is not required by clicking the save tab
    And I entered length of 20 characters to confirm the required length
    And I click the save button to confirm the entry

  @tag2
  Scenario: Test the Application Tab
     Given I click on Application 
    Then I click on the New Tab
    Then I verify that Last Name field is present
    And I click save to confirm that this field is mandatory
    Then I enter letters to confirm the	required length of 20 characters
    And I click save button to confirm

 @tag3
  Scenario: Test the Application Tab
 Given I click on Application 
    Then I click on the New Tab
    And I verified the dropdown field is present which has "00NHs00000gWil2" id
  And I clicked save to confirm that this field is required
  And I verified the dropdown options which has "00NHs00000gWil2" id
    | --None-- |
    | Divorced |
    | Married  |
    | Single   |
  And I verified the values are in alphabetical order
  Then I verified the default value is entered as none

 
 @tag4
  Scenario: Test the application Tab
     Given I verify the access as standard user
    And I verify that the Application Object tab is visible
