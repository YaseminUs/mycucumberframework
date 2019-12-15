package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HRApplicationsPages {
    WebDriver driver;

    public HRApplicationsPages(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//table[@id='europe-employees']//tr/td[1]")
    public List<WebElement> listOfFirstName;

    @FindBy(xpath = "//table[@id='europe-employees']//tr/td[2]")
    public List<WebElement> listOfLasttName;



}
