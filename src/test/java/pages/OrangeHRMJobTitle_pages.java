package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeHRMJobTitle_pages {
    WebDriver driver;
    public OrangeHRMJobTitle_pages(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminField;

    @FindBy(id ="menu_admin_Job")
    public WebElement jobField;

    @FindBy(id="menu_admin_viewJobTitleList")
    public WebElement jobTitle;

    @FindBy(id="btnAdd")
    public WebElement addButton;

    @FindBy(id="jobTitle_jobTitle")
    public WebElement jobItSdet;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    @FindBy(xpath ="//*[text()='IT_SDETS']")
    public WebElement verifItSdet;

}
