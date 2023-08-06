package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AccountPage;
import pages.LandingPage;
import testBase.TestBasePage;

public class LoginAndCompleteCheckoutFlowSteps extends TestBasePage {
    LandingPage landingPage;
    AccountPage accountPage;

    @When("User is clicked on login tab")
    public void userIsClickedOnLoginTab() {
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.elementToBeClickable(landingPage.loginTab));
        // js = (JavascriptExecutor) driver ;
        //   js.executeScript("arguments[0].click()",landingPage.loginTab);
        landingPage = new LandingPage(driver);
        landingPage.clickOnLoginTab();
        landingPage.waitUntilElementIsDisplayed(landingPage.loginLabel, 20);
    }

    @And("User is filled the form using the same credentials {string} and {string}")
    public void userIsFilledTheFormUsingTheSameCredentialsAnd(String userName, String password) {
        landingPage.fillTheLoginForm(userName, password);
    }

    @And("User is clicked on login button")
    public void userIsClickedOnLoginButton() {
        landingPage.clickOnLoginButton();

    }

    @Then("User is logged to the account landing page and {string} is displayed")
    public void userIsLoggedToTheAccountLandingPageSuccessfully(String userName) {
        accountPage = new AccountPage(driver);
        accountPage.waitUntilElementIsDisplayed(accountPage.userName, 20);
        Assert.assertEquals(accountPage.getUserName(), userName);
        System.out.println("USerName : "+userName);
    }



}
