package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends PageBase{

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    String[] items = {"Phones","Laptops","Monitors"};


    @FindBy(id = "nameofuser")
    public WebElement userName ;

    @FindBy(css = "div[class='list-group'] a[id='itemc']")
    public List<WebElement> categoryList;

    @FindBy(xpath = "//div[@class='card h-100']")
    List<WebElement> products ;

    @FindBy(css = "h4[class='card-title'] a")
    List<WebElement> productsLink ;

    public String getUserName() {
        String username =driver.findElement(By.id("nameofuser")).getText();
        return username.substring(8);
    }


    public void checkCategoryItemsList(){
        for (WebElement e:categoryList) {
            System.out.println(e.getText());
        }
       int ListOfProducts =  categoryList.size();

        System.out.println(products.size());
    }


    public void scrollBy(){
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("window.scrollBy(0,500)");
    }
    public void selectRandomItem(){
        for (int i = 0; i < products.size(); i++) {
            if(i == 4 )
                productsLink.get(i).click();

        }
    }

    public void itemsArray(){
      int num =   items.length ;
    }


}



