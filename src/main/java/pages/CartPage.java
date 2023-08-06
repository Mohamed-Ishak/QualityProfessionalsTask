package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends PageBase{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "totalp")
    WebElement totalNum ;

    @FindBy(css = "td:nth-child(4) a")
    WebElement deleteProduct ;


    @FindBy(xpath = "//button[@class='btn btn-success']")
    WebElement  placeOrderBTN ;

    @FindBy(xpath = "//h5[@id='orderModalLabel']")
    public WebElement placeOrderLabel ;

    @FindBy(id = "name")
    WebElement productNameField ;

    @FindBy(id = "country")
    WebElement countryField ;

    @FindBy(id = "city")
    WebElement cityField ;
    @FindBy(id = "card")
    WebElement cardField ;

    @FindBy(id = "month")
    WebElement monthField ;

    @FindBy(id ="year")
    WebElement yearField ;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElement purchaseBTN ;



    @FindBy(xpath = "//div[@class='sa-confirm-button-container']/button")
    WebElement oKButton;

    @FindBy(xpath = "//div[contains(@class,'sweet-alert')]/h2")
    public WebElement successfulPurchaseMSG ;

    //Thank you for your purchase!
    public void deleteProductFromList(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(totalNum));
        clickOnElement(deleteProduct);

    }

    public void clickOnPlaceOrder(){
        clickOnElement(placeOrderBTN);
    }

    public void fillAllMandatoryPurchaseInfo(String productName,String creditCardNumber){
      sendTextToElement(productNameField,productName);
   //   sendTextToElement(countryField,countryName);
    //  sendTextToElement(cityField,cityName);
      sendTextToElement(cardField,creditCardNumber);
     // sendNumberToElement(monthField,month);
     // sendNumberToElement(yearField,year);
    }

    public void clickOnPurchaseButton(){
        clickOnElement(purchaseBTN);
    }

    public String getSuccessfulMessage(){
        return successfulPurchaseMSG.getText();
    }
    public void clickTheOKButton(){
        clickOnElement(oKButton);
    }
    @Override
    public void waitUntilElementIsDisplayed(WebElement element, int duration) {
        super.waitUntilElementIsDisplayed(element, duration);
    }
}
