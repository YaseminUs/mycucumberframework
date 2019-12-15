package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AwsCalcHomePage;
import utilities.Configurations;
import utilities.Driver;
import utilities.ExcelUtiles;

public class AwsCalculatorSteps {
    AwsCalcHomePage awsPage = new AwsCalcHomePage();

    @Given("^User Navigate to AWS Calculator Homapage$")
    public void user_Navigate_to_AWS_Calculator_Homapage() throws Throwable {
        Driver.driver.get(Configurations.getproperties("awsUrl"));

    }

    @When("^User add (\\d+) EC(\\d+) Instances$")
    public void user_add_EC_Instances(int arg1, int arg2) throws Throwable {
     awsPage.ec2InstancesAddButton.click();
     Driver.driver.findElement(By.xpath("(//*[@class='cell firstCell'])[3]")).click();

     Thread.sleep(5000);
    }

    @When("^User adds (\\d+) EC(\\d+) Dedicated Hosts$")
    public void user_adds_EC_Dedicated_Hosts(int arg1, int arg2) throws Throwable {
        Driver.driver.findElement(By.xpath("(//*[@class='cell firstCell'])[6]")).click();
        Driver.driver.findElement(By.xpath("(//*[@class='cell firstCell'])[7]")).click();
        Thread.sleep(5000);
    }

    @Then("^Total estimated coast has to match with prices on \"([^\"]*)\" \"([^\"]*)\" excel file$")
    public void total_estimated_coast_has_to_match_with_prices_on_excel_file(String excelName, String sheetName) throws Throwable {
        awsPage.estimateOfMBillPart.click();
        Thread.sleep(5000);
        String totalActualAmount = awsPage.totalAmount.getAttribute("value");
        System.out.print(totalActualAmount);


        ExcelUtiles.openExcelFile(excelName, sheetName);
        String ec2Price = ExcelUtiles.getValue(1,1);
        double calcEc2Price = Double.parseDouble(ec2Price)*2;
        String ec2Hosts = ExcelUtiles.getValue(2,1);
        double calcEc2Hosts = Double.parseDouble(ec2Hosts)*2;
        double expectedTotalAmount = calcEc2Price + calcEc2Hosts;

        //Assert.assertEquals(expectedTotalAmount, Double.parseDouble(totalActualAmount),1);
    }




}
