package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LandingPage extends PageBase{


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "signin2")
    WebElement signupTab ;

    @FindBy(id = "signInModalLabel")
    public WebElement signUpLabel ;

    @FindBy(id = "sign-username")
    WebElement usernameTxtField ;

    @FindBy(id = "sign-password")
    WebElement passwordTxtField ;

    @FindBy(xpath = "//div[@class='modal fade show']/div/div/div[@class='modal-footer']/button[2]")
    WebElement signupAndLoginBTN;

    @FindBy(id = "login2")
    public WebElement loginTab;

    ////div[@class='modal-header']/h5[@id='logInModalLabel']
    @FindBy(xpath = "//ul[@class='navbar-nav ml-auto']/li/a[@id='login2']")
    public WebElement loginLabel ;

    @FindBy(id = "loginusername")
    public WebElement userNameField ;

    @FindBy(id = "loginpassword")
    public WebElement passField;

    public void clickOnSignupTab() {
        clickOnElement(signupTab);
    }
    public void clickOnLoginTab(){
        clickOnElement(loginTab);
    }
    public void fillTheRegistrationForm(String userName,String pass){
        sendTextToElement(usernameTxtField,userName);
        sendTextToElement(passwordTxtField,pass);
    }

    public void fillTheLoginForm(String userName,String pass){
        clickOnElement(userNameField);
        sendTextToElement(userNameField,userName);
        clickOnElement(passField);
        sendTextToElement(passField,pass);
    }

    public void clickOnSignupButton(){
        clickOnElement(signupAndLoginBTN);
    }
    public void clickOnLoginButton(){
        clickOnElement(signupAndLoginBTN);
    }

    @Override
    public void waitUntilElementIsDisplayed(WebElement element, int duration) {
        super.waitUntilElementIsDisplayed(element, duration);
    }


}
