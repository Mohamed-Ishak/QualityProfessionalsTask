package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

   public WebDriver driver ;

    public PageBase(WebDriver driver){
         this.driver = driver ;
        PageFactory.initElements(driver,this);
     }


     public void clickOnElement(WebElement element){

        element.click();
     }

     public void sendTextToElement(WebElement element,String txt){
        element.sendKeys(txt);
     }

     public void sendNumberToElement(WebElement element , int num){
        element.sendKeys(String.valueOf(num));
     }


    public void waitUntilElementIsDisplayed(WebElement element , int duration){
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
