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
    Then I eneterd some letters to confirm the	required length of 20 chrachters
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

  @application @tc6
  Scenario: add loan field to the application
    Given I verified if is application tab present then click on New button
    And I verified the Co-signer checkbox is present
    Then I verified the checkbox should have a default value of un-clecked

  @application @tc7
  Scenario: add loan loan to the application
    Given I verified the Loan Amount  should be added to the "00NHs00000gYC9T" id fiel
    And The field should be a currency field
    Then The loan amount should be saved along with the application data
    Then The field should accept decimal values

  @application @tc8
  Scenario: Test the Loan dropdown  fiel
    Given I verified the dropdown field is present
    And The drop down field should have the following options in the specified order
      | --None--                      |
      | Business Launch               |
      | Home Improvement/House Buying |
      | Other                         |
    And The selected purpose should be saved along with the application data

  @application @tc9
  Scenario: Test Loan Amount field is accept Alphabets
    Given I verified the Loan Amount field is there
    And The Loan Amount field should accept Alphabets
    Then I click save to comfirm the entry

  @application @tc10
  Scenario: Test add Employment Status dropdown field
    Given I verfied the dropdown field is present
    And the drop down filed should have the following options
      | Employed      |
      | Self-employed |
      | Un-Employed   |
      | Other         |
    Then I verified the Default Value should be "Emmpoyed"
    And I verified the "yes" is the require field by click on "save" button

  @application @tc11
  Scenario: Test Status Type drop down field
    Given I verfied the Status Type field is present
    And The Status Type drop down field should have these following options
      | In-Process |
      | In-Review  |
      | Approved   |
      | Rejected   |
    Then The "In-Process" value is the Default Value

  @application @tc12
  Scenario: Test Employment Category drop down field
    Given I verfied the field that has "00NHs00000ht2ko" id is present
    Then The drop down field should have these follwing options
      | --None--        |
      | Mechanic        |
      | IT Professional |
      | Driver          |
      | Sales Associate |
      | Chef            |
      | Self Employed   |
      | Un-employed     |
    Then I verified "--None" is the default value
    And I verified is a Required field by clicking save button
    And I verified the values are in alphabatically in order by following option
      | --None--        |
      | Chef            |
      | Driver          |
      | IT Professional |
      | Mechanic        |
      | Sales Associate |
      | Self Employed   |
      | Un-employed     |

  @application @tc13
  Scenario: Test Application Statua drop down field
    Given I verified the drop down field that has "00NHs00000ht3C4" id is there
    Then I click save button to verified that is a required field
    And I verified the values are in order by following option
      | --None--  |
      | In-review |
      | Approved  |
      | Rejected  |
    Then I verified default value is "--None--"
    And I verfied the values are in alphabatically in order by following optin
      | --None--  |
      | Approved  |
      | In-review |
      | Rejected  |

  @application @tc14
  Scenario: Test Annual Income field
    Given I verified the field that has name "00NHs00000ht3C9" is present
    Then I verified is a required field by clicking "save" button
    And It should take length 6 max amount and 2 decimals

  @application @tc15
  Scenario: Test Phone field
    Given I verified the field that has id "00NHs00000ht3CE" is present
    Then I verified it is a required field by click save button
    And I enter some numbers to verified it able to take the text

  @application @tc16
  Scenario: Test Email field
    Given I verified the field has Id  "00NHs00000ht3CJ" is present
    Then I click  save to verify is a required field
    And I enter some text to verified it is able to appear

  @application @tc17
  Scenario: Test Date of Birth field
    Given I verified the field is that has id "00NHs00000ht3CO" is there
    Then I verified it is a required field
    And I verified It should not accept future date by enter some future date
   

  @application @tc18
  Scenario: Test SSN field
    Given I verified the field present on the application page
    Then It should be Encrypted field:***_**_4656
    And I verified it a required field by click on save button
