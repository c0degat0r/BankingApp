Feature: Test Application functionality
  I want to use this feature file to test the Application functionality

  Background: Verify the standard user credentials can login
    Given I open chrome browser
    And I visit the environment
    And I enter "john@codegator.us" username
    And I enter "Welcome2" password
    When I click the login button

  @tag
  Scenario: Test the application Tab
    Given I clicked on Application Tab
    And I clicked on New Tab
    And I verified that First Name field is present
    And I clicked save to confirm that this field is mandatory
    Then I entered letters to confirm the	required length of 20 characters
    Then I click the save button to confirm the entry

  @tag1
  Scenario: Test the application Tab
    Given I clicked on Application Tab
    And I clicked on New Tab
    And I verified that Middle Name field is present
    And I verified that the field is not required by clicking save tab
    And I entered length of 20 characters to confirm the required length
    Then I click save to confirm the entry

  @tag2
  Scenario: Test the application Tab
    Given I clicked on Application Tab
    And I clicked on New Tab
    And I verify that Last Name field is present
    And I click save to confirm that this field is mandatory
    Then I enter letters to confirm the	required length of 20 chrachters
    And I click save button to confirm

  @tag3
  Scenario: Test the application Tab
    Given I clicked on Application Tab
    And I clicked on New Tab
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
    Given I verified the access as standard user
    And I verified that the Application Object tab is visible

  @tag5
  Scenario: Add co-signer checkbox
    Given I clicked on Application Tab
    And I clicked on New Tab
    And I verify the Co-signer checkbox is there
    And I verify that it is unchecked by default

  @tag6
  Scenario: Add co-signer checkbox
    Given I clicked on Application Tab
    And I clicked on New Tab
    And I verify that the Loan will be used for field is present
    And I verify the dropdown options which has "00NHs00000gYC9d" id
      | --None--                        |
      | Business Launch                 |
      | Home Improvement / House Buying |
      | Other                           |
      | Education                       |
      | Investment                      |
    And I verified that the values are displayed in the order above

  @tag7
  Scenario: Add Loan Amount field to the Application object
    Given I clicked on Application Tab
    And I clicked on New Tab
		And I verified that the field is currency field only
		And it is accepting decimal value also
		