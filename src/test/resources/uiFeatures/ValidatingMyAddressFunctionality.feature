@Project-102


Feature: Validating My Address Functionality

  Scenario: Updating My Address Functionality
    Given Navigate to sign in page
    And User click sign
    Then User in with valid credentials email "jasmine@gmail.com" password "123456"
    And User click signin
    And User click on "MY ADDRESSES"
    And User click on "Update"
    Then User updates address with following data
      | First Name | Last Name | email             | Password | Address      | City       | State | Zip   | Country       | Mobile phone |
      | Jasmine    | Us        | jasmine@gmail.com | 123456   | 2200 E Devon | Schaumburg | IL    | 60193 | United States | 1234567890   |
    Then User clicks on Update button