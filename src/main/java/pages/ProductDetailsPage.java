package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase{

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='row']/div/a")
    WebElement addToCartBTN ;

    @FindBy(id = "cartur")
    public WebElement cartTab ;

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartBTN);
    }

    public void clickOnCartTab(){
        clickOnElement(cartTab);
    }

    @Override
    public void waitUntilElementIsDisplayed(WebElement element, int duration) {
        super.waitUntilElementIsDisplayed(element, duration);
    }
}
