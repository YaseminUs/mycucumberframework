@TEC-1
Feature: verifying login functionality

  Scenario: verifying with valid credentials
    Given navigate to login page
    Then user logs in with valid credentials username "admin" password "adminpass"
    And Fill up the new form with the following data
      | Title | First Name | Gender | Languages Known |
      | Ms.   | Yasemin    | Female | English         |
    Then User clicks on save