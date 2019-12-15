Feature: Testing AWS Calculator
  @TECTC-110 @ui @somkeTest
  Scenario: Testing calculation of prices for EC@ Instances
    Given User Navigate to AWS Calculator Homapage
    When User add 2 EC2 Instances
    And User adds 2 EC2 Dedicated Hosts
    Then Total estimated coast has to match with prices on "TestData" "Sheet2" excel file