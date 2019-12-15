package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginHomePage {
    WebDriver driver;

    public LoginHomePage(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='Login']")
    public WebElement login;

    @FindBy(id = "TitleId")
    public WebElement title;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='Female']")
    public WebElement gender;

    @FindBy(xpath = "//input[@name='english']")
    public WebElement language;

    @FindBy(xpath = "//input[@name='Save']")
    public WebElement saveButton;




}
