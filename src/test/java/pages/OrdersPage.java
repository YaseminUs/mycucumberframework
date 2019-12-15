package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrdersPage {

    WebDriver driver;

    public OrdersPage(){
        this.driver= Driver.driverSetup("chrome");
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement prouductName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNr;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(xpath ="//a[@href='Default.aspx']")
    public WebElement ordersViewButton;






}
