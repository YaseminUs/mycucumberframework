package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AwsCalcHomePage {

    WebDriver driver;

    public AwsCalcHomePage(){
        driver = Driver.driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@class=\"cell firstCell\"])[2]\n")
    public WebElement ec2InstancesAddButton;

    @FindBy(xpath = "//*[@class='billLabel']")
    public WebElement estimateOfMBillPart;

    @FindBy(xpath ="(//input[@class='gwt-TextBox gwt-TextBox-readonly'])[4119]")
    public WebElement totalAmount;

}
