Feature: Test Application functionality

  Background: 
    Given I open chrome browser
    And I visit the environment
    And I enter "john@codegator.us" username
    And I enter "Welcome2" password
    When I click the login button
    Then I should see the home page
    Then I clicked on Application Tab
    And I clicked on New button

  @application @tc1
  Scenario: Test the application Tab
    And I verified that First Name field is present
    And I clicked save to confirm
    Then I eneterd letters to confirm the	required length of 20 chrachters
    Then I click the save button to confirm

  @application @tc2
  Scenario: Test the application Tab
    Given I verified that Middle Name field is present
    And I verified that the field is not required by clicking save button
    And I entered length of sometext to confirm the required length
    Then I click save to comfirm the entry

  @application @tc3
  Scenario: Test the application Tab
    Given I verified that Last Name field is present
    And I clicked save to confirm that this field is madatory
    Then I eneterd letters to confirm the	required length of 20
    Then I click the save button to confirm the required length

  @application @tc4
  Scenario: Test the application Tab
    Given I verified the dropdown field is present
    And I clicked save to confirm that this field is required
    And I verified the dropdown which has "00NHs00000gWil2" id with these following options
      | --None-- |
      | Single   |
      | Married  |
      | Divorced |
    And I verified the values are in alphabetical in order with these following option
      | --None-- |
      | Divorced |
      | Married  |
      | Single   |
    Then I verified the default value is entered as none

  @application @tc5
  Scenario: Test the application Tab
    Given I verified the access as standard user
    And I visit the environment
    And I enter username
    And I enter password
    When I click the login button
    And I verified that the Application Object tab is visible
