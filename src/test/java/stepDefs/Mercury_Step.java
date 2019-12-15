package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MercuryHomePage;
import utilities.Configurations;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class Mercury_Step {
    WebDriver driver;

    MercuryHomePage mercuryHomePage = new MercuryHomePage();



    @Given("^Verify accsess to Registration Page$")
    public void verify_accsess_to_Registration_Page() throws Throwable {
        Driver.driver.get(Configurations.getproperties("mercuryUrl"));
        Thread.sleep(2000);

    }

    @When("^Registration page displayed and click Register$")
    public void registration_page_displayed_and_click_Register() throws Throwable {
        mercuryHomePage.register.click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(mercuryHomePage.register).perform();
//        WebElement register = driver.findElement(By.xpath("//a[@href='mercuryregister.php']"));
//        JavascriptExecutor js =(JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",register);
//        register.click();
        Thread.sleep(500);


    }

    @Then("^Enter valid data on page$")
    public void enter_valid_data_on_page(DataTable dataTable) throws Throwable {
        List<Map<String,Object>> listOfMaps = dataTable.asMaps(String.class,Object.class);
        mercuryHomePage.firstName.sendKeys(listOfMaps.get(0).get("FirstName").toString());
        mercuryHomePage.lastName.sendKeys(listOfMaps.get(0).get("LastName").toString());
        mercuryHomePage.phone.sendKeys(listOfMaps.get(0).get("Phone").toString());
        mercuryHomePage.email.sendKeys(listOfMaps.get(0).get("UserName").toString());
        mercuryHomePage.address1.sendKeys(listOfMaps.get(0).get("Address").toString());
        mercuryHomePage.city.sendKeys(listOfMaps.get(0).get("City").toString());
        mercuryHomePage.state.sendKeys(listOfMaps.get(0).get("State").toString());
        mercuryHomePage.usernameEmail.sendKeys(listOfMaps.get(0).get("UserName").toString());
        mercuryHomePage.password.sendKeys(listOfMaps.get(0).get("Password").toString());
        mercuryHomePage.confirmPassword.sendKeys(listOfMaps.get(0).get("ConfirmPassword").toString());

        Thread.sleep(5000);


    }

    @Then("^Click on Summit Button$")
    public void click_on_Summit_Button() throws Throwable {
        mercuryHomePage.summit.click();

    }

    @Then("^Thank you for registering: should be displayed$")
    public void thank_you_for_registering_should_be_displayed() throws Throwable {

    }

    @Then("^Click on SignOff$")
    public void click_on_SignOff() throws Throwable {
        mercuryHomePage.signOff.click();

    }

    @Then("^Close the Browser$")
    public void close_the_Browser() throws Throwable {

    }


}
