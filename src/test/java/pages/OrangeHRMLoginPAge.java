package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMLoginPAge {
    WebDriver driver;
    public OrangeHRMLoginPAge(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "txtUsername")
    public WebElement userName;
    @FindBy(id = "txtPassword")
    public WebElement password;
    @FindBy(id = "btnLogin")
    public WebElement login;





}
