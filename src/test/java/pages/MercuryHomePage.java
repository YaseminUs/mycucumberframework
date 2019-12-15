package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MercuryHomePage {
    WebDriver driver;
    public MercuryHomePage(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText= "REGISTER")
    public WebElement register;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='userName']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement usernameEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@name='register']")
    public WebElement summit;

    @FindBy(xpath = "(//td[@class='mouseOut'])[1]")
    public WebElement signOff;





}
