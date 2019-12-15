package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.LoginHomePage;
import pages.LoginPage;
import utilities.Configurations;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class Login_user_pass_Step {

    LoginHomePage loginHomePage = new LoginHomePage();

    @Given("^navigate to login page$")
    public void navigate_to_login_page() throws Throwable {
        Driver.driver.get(Configurations.getproperties("exeAutoUrl"));
        Thread.sleep(2000);
    }

    @Then("^user logs in with valid credentials username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_logs_in_with_valid_credentials_username_password(String username, String password) throws Throwable {
     loginHomePage.userName.sendKeys(username);
        loginHomePage.password.sendKeys(password);
        loginHomePage.login.click();
    }
    @Then("^Fill up the new form with the following data$")
    public void fill_up_the_new_form_with_the_following_data(DataTable table) throws Throwable {
        List<Map<String,Object>> listOfMaps=table.asMaps(String.class,Object.class);
        loginHomePage.title.sendKeys(listOfMaps.get(0).get("Title").toString());
        loginHomePage.firstName.sendKeys(listOfMaps.get(0).get("First Name").toString());
        loginHomePage.gender.click();
        loginHomePage.language.click();

        Select select = new Select(loginHomePage.title);
        select.selectByVisibleText("Ms.");

    }

    @Then("^User clicks on save$")
    public void user_clicks_on_save() throws Throwable {
       loginHomePage.saveButton.click();
    }

    }



