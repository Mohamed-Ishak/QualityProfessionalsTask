package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LandingPage;
import testBase.TestBasePage;

public class RegistrationStep extends TestBasePage {

     LandingPage landingPage ;


    @Given("User is navigate to the product store website")
    public void user_navigated_to_the_product_store_website() {
        driver.navigate().to(" https://www.demoblaze.com/");
    }

    @When("User is entered a valid {string} and valid {string}")
    public void user_is_entered_a_valid_and_valid(String userName, String password) {
        landingPage = new LandingPage(driver);
        landingPage.clickOnSignupTab();
        landingPage.waitUntilElementIsDisplayed(landingPage.signUpLabel, 30);
        landingPage.fillTheRegistrationForm(userName,password);
    }

    @And("User is clicked on Signup button")
    public void user_is_clicked_on_signup_button() {
        landingPage.clickOnSignupButton();

    }


    @And("User is accepted the success alert")
    public void userIsAcceptedTheSuccessAlert() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }


}
