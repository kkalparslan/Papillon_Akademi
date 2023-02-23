Feature: Register New User Test

  @register
  Scenario: The user should be create a new account
    Given The user should be on the web page
    When The user should be open the account bar
    Then The user verify that on the register form page
    And The user should be enter the credentials
    Then The user verify that new account created