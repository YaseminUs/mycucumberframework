@mercury-01
Feature: User Registration in MercuryFlight site

  Scenario: Single user registration
    Given Verify accsess to Registration Page
    When Registration page displayed and click Register
    Then Enter valid data on page
      | FirstName | LastName | Phone      | Email      | Address       | City       | State | UserName | Password | ConfirmPassword |
      | Jasmin    | Us       | 2245959999 | a@test.com | 305 wildberry | Schaumburg | Il    | jasmin   | test123  | test123         |

    Then Click on Summit Button
    And Thank you for registering: should be displayed
    Then Click on SignOff
    And Close the Browser

  Scenario: Flight registration
    Given Verify accsess to Registration Page
    When Home page displayed and click Flight
    Then Enter Flight Details
    And Verify accsess  "DEPART - RETURN"
