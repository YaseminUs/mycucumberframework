package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMDashboard {
    WebDriver driver;
    public OrangeHRMDashboard(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminButton;
    @FindBy(xpath = "//a[@href='saveSystemUser?userId=6']")
    public WebElement FionaGracebutton;
    @FindBy(id = "btnSave")
    public WebElement editButton;
    @FindBy(id = "systemUser_chkChangePassword")
    public WebElement changeCheckobx;
    @FindBy(id = "systemUser_password")
    public WebElement newPasswordfield;
    @FindBy(id = "systemUser_confirmPassword")
    public WebElement confirmPasswordField;
    @FindBy(id="btnSave")
    public WebElement save;
    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;
    @FindBy(xpath = "//a[@href='/index.php/auth/logout']")
    public WebElement logout;


    @FindBy(id ="txtUsername")
    public WebElement username;
    @FindBy(id="txtPassword")
    public WebElement pass;
    @FindBy (id="btnLogin")
    public  WebElement login;



}
