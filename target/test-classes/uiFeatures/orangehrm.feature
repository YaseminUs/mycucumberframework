@Project-101
Feature: HR Management Application
  Scenario: Verify Create an account
  Given Navigate to page Orangehrm home page
    Then Login as an Admin username "Admin" password "admin123"
    And Change password for Fiona Grace
    Then Verify it is changed by signing in again

@Project-103
  Scenario: Login and go to job Title section and add‘IT SDET’ job, and verify it is added
  Given Navigate to page Orangehrm home page
  Then Login as an Admin username "Admin" password "admin123"
  And Click admin field Go to job Title section and click
  And Add‘IT SDET’ job
  Then Verify it is added

@Project-100
  Scenario: Login to application and go to Leave section and verify Linda Anderson’s number leave days properly calculated by going to details of leave and counting the days
  Given Navigate to page Orangehrm home page
  Then Login as an Admin username "Admin" password "admin123"
  And go to Leave section
  And verify Linda Anderson’s number leave days properly calculated by going to details of leave and counting the days
