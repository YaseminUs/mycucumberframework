package stepDefs;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.YourLogoAdress;
import pages.YourLogoPage;
import utilities.Configurations;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class YourLogo {

   YourLogoPage yourLogoPage = new YourLogoPage();
   YourLogoAdress yourLogoAdress = new YourLogoAdress();

    @Given("^Navigate to page$")
    public void navigate_to_page() throws Throwable {
        Driver.driver.get(Configurations.getproperties("browserUrl"));
        Thread.sleep(2000);

    }

    @Then("^User click signing button$")
    public void user_click_signing_button() throws Throwable {
        yourLogoPage.signIn.click();
    }

    @Then("^User create by signing  with valid credentials E mail \"([^\"]*)\"$")
    public void user_create_by_signing_with_valid_credentials_E_mail(String email) throws Throwable {
      //yourLogoPage.createEmail.clear();
      yourLogoPage.createEmail.sendKeys(email);



    }

    @Then("^User click Create an accaount$")
    public void user_click_Create_an_accaount() throws Throwable {
    yourLogoPage.clickCreateAnAccount.click();
    }

    @Then("^Fill up the new account form with the following data$")
    public void fill_up_the_new_account_form_with_the_following_data(DataTable dataTable) throws Throwable {
        List<Map<String,Object>> listOfMaps=dataTable.asMaps(String.class,Object.class);
        yourLogoPage.firstName.sendKeys(listOfMaps.get(0).get("First Name").toString());
        yourLogoPage.lasttName.sendKeys(listOfMaps.get(0).get("Last Name").toString());
        yourLogoPage.passwd.sendKeys(listOfMaps.get(0).get("Password").toString());
        yourLogoPage.address.sendKeys(listOfMaps.get(0).get("Adress").toString());
        yourLogoPage.city.sendKeys(listOfMaps.get(0).get("City").toString());
        yourLogoPage.id_state.sendKeys(listOfMaps.get(0).get("State").toString());
        yourLogoPage.postcode.sendKeys(listOfMaps.get(0).get("Zip").toString());
        yourLogoPage.country.sendKeys(listOfMaps.get(0).get("Country").toString());
        yourLogoPage.phone.sendKeys(listOfMaps.get(0).get("Mobile phone").toString());


        Select select = new Select(yourLogoPage.country);
        select.selectByVisibleText("United States");
    }

    @Then("^User clicks on Register$")
    public void user_clicks_on_Register() throws Throwable {
        yourLogoPage.register.click();

    }

    @Given("^Navigate to sign in page$")
    public void navigate_to_sign_in_page() throws Throwable {
        Driver.driver.get(Configurations.getproperties("browserUrl"));
        Thread.sleep(2000);

    }
    @Given("^User click sign$")
    public void user_click_login() throws Throwable {
        Thread.sleep(2000);
        yourLogoPage.signIn.click();
    }

    @Then("^User in with valid credentials email \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_in_with_valid_credentials_email_password(String sign, String psswd) throws Throwable {
         yourLogoPage.sign.sendKeys(sign);
         yourLogoPage.psswd.sendKeys(psswd);
    }

    @Then("^User click signin$")
    public void user_click_signin() throws Throwable {
        yourLogoPage.login.click();

    }

    @Then("^Verify Home page \"([^\"]*)\"$")
    public void verify_Home_page(String arg1) throws Throwable {
        String actual=Driver.driver.getTitle();

    }

    @Then("^User in with invalid credentials email \"([^\"]*)\" password \"(\\d+)$")
    public void user_in_with_invalid_credentials_email_password(String sign, String psswd) throws Throwable {
        yourLogoPage.sign.sendKeys(sign);
        yourLogoPage.psswd.sendKeys(psswd);

    }
    @Then("^User click signinvalid$")
    public void user_click_signinvalid() throws Throwable {
        yourLogoPage.login.click();

    }

    @Then("^Verify Signin page$")
    public void verify_Signin_page() throws Throwable {

        String actualResult= Driver.driver.getTitle();
        String expected = Driver.driver.getTitle();
        Assert.assertEquals(expected,actualResult);
    }

    @Given("^Navigate to My Addresses$")
    public void navigate_to_My_Addresses() throws Throwable {
        Driver.driver.get(Configurations.getproperties("browserUrl"));
        yourLogoPage.myadress.click();
        Thread.sleep(2000);
    }

    @Then("^User click on Update$")
    public void user_click_on_Update() throws Throwable {
      yourLogoPage.update.click();
        Thread.sleep(2000);
    }

    @Then("^User changes Address$")
    public void user_changes_Address(DataTable datatable) throws Throwable {
        List<Map<String,Object>> listOfMaps=datatable.asMaps(String.class,Object.class);
        yourLogoPage.address.clear();
        yourLogoPage.address.sendKeys(listOfMaps.get(0).get("Adress").toString());
        yourLogoPage.city.clear();
        yourLogoPage.city.sendKeys(listOfMaps.get(0).get("City").toString());
        yourLogoPage.id_state.sendKeys(listOfMaps.get(0).get("State").toString());
        yourLogoPage.postcode.clear();
        yourLogoPage.postcode.sendKeys(listOfMaps.get(0).get("Zip").toString());

    }

    @Then("^clicks on Save$")
    public void clicks_on_Save() throws Throwable {
         yourLogoPage.save.click();
    }




//    @Then("^User click on \"([^\"]*)\"$")
//    public void user_click_on(String myaddress) throws Throwable {
//        yourLogoAdress.myaddress.click();
//        yourLogoAdress.update.click();
//    }
//
//    @Then("^User updates address with following data$")
//    public void user_updates_address_with_following_data(DataTable dataTable) throws Throwable {
//        List<Map<String,Object>> listOfMap=dataTable.asMaps(String.class,Object.class);
//        yourLogoAdress.firstName1.clear();
//        yourLogoAdress.firstName1.sendKeys(listOfMap.get(0).get("First Name").toString());
//        yourLogoAdress.lasttName1.clear();
//        yourLogoAdress.lasttName1.sendKeys(listOfMap.get(0).get("Last Name").toString());
//        yourLogoAdress.passwd1.clear();
//        yourLogoAdress.passwd1.sendKeys(listOfMap.get(0).get("Password").toString());
//        yourLogoAdress.address1.clear();
//        yourLogoAdress.address1.sendKeys(listOfMap.get(0).get("Address").toString());
//        yourLogoAdress.city1.clear();
//        yourLogoAdress.city1.sendKeys(listOfMap.get(0).get("City").toString());
//        yourLogoAdress.id_state1.clear();
//        yourLogoAdress.id_state1.sendKeys(listOfMap.get(0).get("State").toString());
//        yourLogoAdress.postcode1.clear();
//        yourLogoAdress.postcode1.sendKeys(listOfMap.get(0).get("Zip").toString());
//        yourLogoAdress.country1.clear();
//        yourLogoAdress.country1.sendKeys(listOfMap.get(0).get("Country").toString());
//        yourLogoAdress.phone1.clear();
//        yourLogoAdress.phone1.sendKeys(listOfMap.get(0).get("Mobile phone").toString());
//        Select select = new Select(yourLogoAdress.country1);
//        select.selectByVisibleText("United States");
//    }
//
//    @Then("^User clicks on Update button$")
//    public void user_clicks_on_Update_button() throws Throwable {
//        yourLogoAdress.save.click();

    }





