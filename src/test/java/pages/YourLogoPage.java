package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YourLogoPage {
    WebDriver driver;
    public YourLogoPage(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn;

    @FindBy(id = "email_create")
    public WebElement createEmail;

    @FindBy(id="SubmitCreate")
    public WebElement clickCreateAnAccount;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lasttName;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement id_state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(xpath ="//select[@id='id_country']")
    public WebElement country;

    @FindBy(id = "phone_mobile")
    public WebElement phone;

    @FindBy(xpath="//button[@id='submitAccount']")
    public WebElement register;

   ////////////////////////////////////////////

    @FindBy(xpath="//input[@id='email']")
    public  WebElement sign;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement psswd;

    @FindBy(xpath="//button[@id='SubmitLogin']")
    public WebElement login;

   ////////////////////////////////////////////

    @FindBy(xpath = "//a[@title='Addresses']")
    public WebElement myadress;
    @FindBy(xpath = "//a[@title='Update']")
    public WebElement update;
    @FindBy(id = "submitAddress")
    public WebElement save;




}
