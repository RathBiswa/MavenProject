Feature: As a user of parasoft application
  I want to login to bank login page
  So that i can view my bank account

  Scenario: Verify existing user are able to login to parasoft application
    Given an existing user launches parasoft application
    When user enters the login details
    Then user is navigated to home screen
    Then account balance should greater than zero
