package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.OrangeHRMDashboard;
import pages.OrangeHRMJobTitle_pages;
import pages.OrangeHRMLoginPAge;
import utilities.Configurations;
import utilities.Driver;

import javax.swing.*;

public class orangeHRM_changePasword_Step {
    //WebDriver driver;

    OrangeHRMLoginPAge orangeHRMLoginPAge = new OrangeHRMLoginPAge();
    OrangeHRMDashboard orangeHRMDashboard = new OrangeHRMDashboard();
    OrangeHRMJobTitle_pages orangeHRMJobTitle_pages = new OrangeHRMJobTitle_pages();

    @Given("^Navigate to page Orangehrm home page$")
    public void navigate_to_page_Orangehrm_home_page() throws Throwable {
        Driver.driver.get(Configurations.getproperties("orangeUrl"));
    }

    @Then("^Login as an Admin username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void login_as_an_Admin_username_password(String username, String password) throws Throwable {
      orangeHRMLoginPAge.userName.sendKeys(username);
      orangeHRMLoginPAge.password.sendKeys(password);
      orangeHRMLoginPAge.login.click();
    }

    @And("^Change password for Fiona Grace$")
    public void change_password_for_Fiona_Grace() throws Throwable {
        Thread.sleep(2000);
     orangeHRMDashboard.adminButton.click();
     Thread.sleep(2000);
     orangeHRMDashboard.FionaGracebutton.click();
        Thread.sleep(2000);
     orangeHRMDashboard.editButton.click();
     orangeHRMDashboard.changeCheckobx.click();
     orangeHRMDashboard.newPasswordfield.sendKeys("abcd123");
     orangeHRMDashboard.confirmPasswordField.sendKeys("abcd123");
     orangeHRMDashboard.save.click();
     orangeHRMDashboard.welcomeAdmin.click();
     orangeHRMDashboard.logout.click();
    }

    @Then("^Verify it is changed by signing in again$")
    public void verify_it_is_changed_by_signing_in_again() throws Throwable {
        Thread.sleep(2000);
     orangeHRMDashboard.username.click();
     orangeHRMDashboard.username.sendKeys("fiona.grace");
     orangeHRMDashboard.pass.sendKeys("abcd123");
     orangeHRMDashboard.login.click();
    }
//----------------------------------//

    @Then("^Click admin field Go to job Title section and click$")
    public void go_to_job_Title_section_and_click() throws Throwable {
        Actions actions=new Actions(Driver.driver);
      orangeHRMJobTitle_pages.adminField.click();
      Thread.sleep(2000);
      actions.click(orangeHRMJobTitle_pages.jobField).build().perform();
      actions.moveToElement(orangeHRMJobTitle_pages.jobTitle).click().build().perform();
      orangeHRMJobTitle_pages.addButton.click();
    }

    @Then("^Add‘IT SDET’ job$")
    public void add_IT_SDET_job() throws Throwable {
     orangeHRMJobTitle_pages.jobItSdet.sendKeys("IT_SDETS");
     orangeHRMJobTitle_pages.saveButton.click();
    }

    @Then("^Verify it is added$")
    public void verify_it_is_added() throws Throwable {
//        String actual = Driver.driver.getTitle();
//        Assert.assertTrue(orangeHRMJobTitle_pages.verifItSdet.getText().contains("IT_SDETS"));
    }
    @Then("^go to Leave section$")
    public void go_to_Leave_section() throws Throwable {

    }

    @Then("^verify Linda Anderson’s number leave days properly calculated by going to details of leave and counting the days$")
    public void verify_Linda_Anderson_s_number_leave_days_properly_calculated_by_going_to_details_of_leave_and_counting_the_days() throws Throwable {

    }








}



