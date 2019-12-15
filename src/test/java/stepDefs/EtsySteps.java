package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EtsyHomePage;
import pages.EtsyResultPage;
import utilities.BrowserUtils;
import utilities.Configurations;
import utilities.Driver;

public class EtsySteps {

    EtsyHomePage etsyHomePage = new EtsyHomePage();
    EtsyResultPage etsyResultPage = new EtsyResultPage();

    @Given("^Navigate Etsy Homepage$")
    public void navigate_Etsy_Homepage() throws Throwable {
        Driver.driver.get(Configurations.getproperties("etsyUrl"));
    }

    @When("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String item) throws Throwable {
        etsyHomePage.searchBox.sendKeys(item + Keys.ENTER);

    }

    @Then("^Validate search message have word \"([^\"]*)\"$")
    public void validate_search_message_have_word(String item) throws Throwable {
        String actualSearchMessage = etsyResultPage.searchMessage.getText();
        Assert.assertEquals(item, actualSearchMessage);

    }

    @When("^User clicks on \"([^\"]*)\"$")
    public void user_clicks_on(String department) throws Throwable {

        if (etsyHomePage.jeweleryA.getText().equalsIgnoreCase(department)) {
            etsyHomePage.jeweleryA.click();
        } else if (etsyHomePage.ClothesS.getText().equalsIgnoreCase(department)) {
            etsyHomePage.ClothesS.click();
        } else if (etsyHomePage.HomeL.getText().equalsIgnoreCase(department)) {
            etsyHomePage.HomeL.click();
        } else if (etsyHomePage.WeddingP.getText().equalsIgnoreCase(department)) {
            etsyHomePage.WeddingP.click();
        } else if (etsyHomePage.ToysE.getText().equalsIgnoreCase(department)) {
            etsyHomePage.ToysE.click();
        }

    }

    @Then("^User validate title \"([^\"]*)\"$")
    public void user_validate_title(String title) throws Throwable {
        String actualTitle = Driver.driver.getTitle();
        Assert.assertEquals(title, actualTitle);
    }

    @When("^User clicks on Free Shipping checkbox$")
    public void user_clicks_on_Free_Shipping_checkbox() throws Throwable {
        etsyResultPage.freeShippingCheckbox.click();
        Thread.sleep(3000);

    }

    @Then("^Verify all result have \"([^\"]*)\" label$")
    public void verify_all_result_have_label(String label) throws Throwable {
        for (WebElement element : etsyResultPage.freeShippingLabels) {
            Assert.assertEquals(label, element.getText().trim());
        }
    }

    @When("^User click on Over Price checbox$")
    public void user_click_on_Over_Price_checbox() throws Throwable {
        WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(etsyResultPage.over1000Checkbox));
        etsyResultPage.over1000Checkbox.click();
    }

    @Then("^User verifies all items prices ar over that price$")
    public void user_verifies_all_items_prices_ar_over_that_price() throws Throwable {
        for (WebElement element : etsyResultPage.resultPrices) {
            String number = element.getText().replace(",", "");
            if (!number.isEmpty()) {
                double price = Double.parseDouble(number);
                System.out.println(price);
                Assert.assertTrue(price >= 1000);
            }
        }
    }

}



