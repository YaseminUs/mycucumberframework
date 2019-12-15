@TEC-102 @ui  @regressionTest
Feature: Adding Order
  @smokeTest @myTest
  Scenario: Verify create order functionaltiy
    Given Navigate to login page
    Then User logs in with valid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creaters new order
      | Product Name | Quantity | Customer Name | Street     | City    | State | Zip   | Card Nr    | Expire Date |
      | ScreenSaver  | 2        | Techtorial    | 123 N tech | Chicago | IL    | 60000 | 1234567890 | 12/21       |
    Then User verifies Order "is" created

  Scenario: Verify create order functionality with invalid data
    Given Navigate to login page
    Then User logs in with valid credentials username "Tester" password "test"
    And User clicks on Order
    Then User creaters new order
      | Product Name | Quantity | Customer Name | Street     | City    | State | Zip   | Card Nr    | Expire Date |
      | ScreenSaver  | 2        | Techtorial    | 123 N tech | Chicago | IL    | zipCode | 1234567890 | 12/21       |
    Then User verifies Order "is NOT" created

   @TECTC-1015 @smokeTest
   Scenario Outline: Verify Delete functionality
     Given Navigate to login page
     Then User logs in with valid credentials username "Tester" password "test"
     And User deletes "<Name>" from table
     Then Validate than "<Name>" is delete
     Examples:
     |Name|
     |Mark Smith|
     |Samuel Clemens|
     |Paul Brown    |









