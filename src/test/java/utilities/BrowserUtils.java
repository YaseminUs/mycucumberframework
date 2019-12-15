package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    // this method will get hover over webElement
    // You need to give the element and driver
    public static void hover(WebElement element, WebDriver driver){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    // create method for drag and drop, right click
    // this method will take the text off webelement and return the String , You need pass the element
    public static String getText(WebElement element){
        return element.getText();
    }
    // This method will take the list of webElement it will return listof text from the webElements
    public static List<String> getElementsText(List<WebElement> elements){
        List <String> textList=new ArrayList<>(); // this is interface we can't instantiate interface
        for(WebElement el:elements){
            if(!el.getText().isEmpty()){
                textList.add(el.getText());
            }
        }
        return textList;
    }
    // driver comes from testBase class, element comes from PageClass (findby)
    public static void visibilityOfElement(WebDriver driver,WebElement element,int time){
        WebDriverWait wait=new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    // clickable, isAlertPresent
    public static void swithchWindow(String targetTitle,WebDriver driver){
        String origin=driver.getWindowHandle(); // it will return me cutrent page string value
        Set<String> allWindows=driver.getWindowHandles();
        for(String windows:allWindows){
            driver.switchTo().window(windows);
            if(driver.getTitle().equals(targetTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);
    }
}



