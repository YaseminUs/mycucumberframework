package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Configurations;
import utilities.Driver;

public class VerifyLoginFunctionaltiy {


    LoginPage loginPage = new LoginPage();

    @Given("^Navigate to login page$")
    public void navigate_to_login_page() throws Throwable {
        Driver.driver.get(Configurations.getproperties("projeUrl"));
        Thread.sleep(2000);
    }
    @Then("^User logs in with valid credentials username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_logs_in_with_valid_credentials_username_password(String username, String password) throws Throwable {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
    }
    @Then("^Verify user is Homepage$")
    public void verify_user_is_in_Homepage() throws Throwable {
        String actualTitle=Driver.driver.getTitle();
        String expectedTitle="Web Orders";
        Assert.assertEquals(expectedTitle,actualTitle);
        // always expected comes first when we compare
    }
    @Then("^User logs in with invalid credentials username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_logs_in_with_invalid_credentials_username_password(String username, String password) throws Throwable {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
    }
    @Then("^Verify user gets error message \"([^\"]*)\"$")
    public void verify_user_gets_error_message(String errorMessage) throws Throwable {
        // ecpected is already in parameter thats why we are not writing again
        String actualResult=loginPage.errorMessage.getText();
        Assert.assertEquals(errorMessage,actualResult);

    }





}
