Feature: Test Login functionality
  I want to use this feature file to test the login functionality

  Scenario: Test using valid credentials
    Given I open chrome browser
    And I visit the environment
    And I enter username
    And I enter password
    When I click the login button
    Then I should see the home page

  Scenario: Verify the standard user credentials can login
    Given I open chrome browser
    And I visit the environment
    And I enter "john@codegator.us" username
    And I enter "Welcome2" password
    When I click the login button
    Then I should see the home page
