Feature: Test Login functionality
  I want to use this feature file to test the login functionality

  Scenario: Test using valid credentials
    Given I open chrome browser
    And I visit the environment
    And I enter username
    And I enter password
    When I click the login button
    Then I should see the home page

