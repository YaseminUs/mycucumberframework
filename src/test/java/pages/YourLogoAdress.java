package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YourLogoAdress {
    WebDriver driver;
    public YourLogoAdress (){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Addresses']")
    public WebElement myaddress;
    @FindBy(xpath = "//a[@title='Update']")
    public WebElement update;

    @FindBy(id = "customer_firstname")
    public WebElement firstName1;

    @FindBy(id = "customer_lastname")
    public WebElement lasttName1;

    @FindBy(id = "passwd")
    public WebElement passwd1;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "city")
    public WebElement city1;

    @FindBy(id = "id_state")
    public WebElement id_state1;

    @FindBy(id = "postcode")
    public WebElement postcode1;

    @FindBy(xpath ="//select[@id='id_country']")
    public WebElement country1;

    @FindBy(id = "phone_mobile")
    public WebElement phone1;

    @FindBy(xpath = "//button[@id='submitAddress']")
    public WebElement save;






}
