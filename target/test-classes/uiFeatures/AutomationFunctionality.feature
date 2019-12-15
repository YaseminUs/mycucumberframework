@Project-101
Feature: Authentication functionality

  @TC1
  Scenario: Verify Create an account
    Given Navigate to page
    Then User click signing button
    Then User create by signing  with valid credentials E mail "jasmine@gmail.com"
    And User click Create an accaount
    Then Fill up the new account form with the following data
      | First Name | Last Name | email             | Password | Adress       | City       | State | Zip   | Country       | Mobile phone |
      | Jasmine    | Us        | jasmine@gmail.com | 123456   | 2200 E.Devon | Desplaines | Il    | 60103 | United States | 2245959876   |
    Then User clicks on Register

  @TC2
  Scenario: Verify with valid credentials
    Given Navigate to page
    And User click sign
    Then User in with valid credentials email "jasmine@gmail.com" password "123456"
    And User click signin
    And Verify Home page "My account - My Store"

  @TC3
  Scenario: Verify with invalid credentials
    Given Navigate to sign in page
    And User click sign
    Then User in with invalid credentials email "tech@gmail.com" password "0123456
    And User click signinvalid
    And Verify Signin page

  @TC4
  Scenario: Verify address Update
    Given Navigate to sign in page
    Given Navigate to My Addresses
    Then User click on Update
    Then User changes Address
      | Adress            | City       | State | Zip   |
      | 305 Wildberry ct. | Schaumburg | WI    | 60193 |
    Then clicks on Save








