
  Feature: Home page test

    Background:
      Given The user should be on the web page
      When The user should be open the account
      And The user should be enter valid credentials

      @home
    Scenario: The user navigate the modules
      Given The user should be check modules
      When The user should be click all modules
      And The user should be open training_appointment modules
      And The user should be click appointment
      And The user should be enter valid credentials for appointment

