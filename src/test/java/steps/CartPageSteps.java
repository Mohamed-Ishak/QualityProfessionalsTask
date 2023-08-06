package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;
import testBase.TestBasePage;

public class CartPageSteps extends TestBasePage {

    CartPage cartPage ;
    @And("user is observed the selected product and delete it")
    public void userIsObservedTheSelectedProductAndDeleteIt() {
       cartPage = new CartPage(driver);
       cartPage.deleteProductFromList();

    }

    @And("User is clicked on placeOrder button")
    public void userIsClickedOnPlaceOrderButton() {
     cartPage = new CartPage(driver);
      cartPage.clickOnPlaceOrder();
     cartPage.waitUntilElementIsDisplayed(cartPage.placeOrderLabel, 30);
     System.out.println(cartPage.placeOrderLabel.getText());
    }

    @And("User is filled all the mandatory info to complete a successful purchase {string} {string}")
    public void userIsFilledAllTheMandatoryInfoToCompleteASuccessfulPurchase(String prodName, String creditNum) {
        cartPage.fillAllMandatoryPurchaseInfo(prodName,creditNum);
        cartPage.clickOnPurchaseButton();
    }


    @Then("A successful purchase message is displayed")
    public void aSuccessfulPurchaseMessageIsDisplayed() {
        Assert.assertEquals("Thank you for your purchase!",cartPage.getSuccessfulMessage());
        System.out.println(cartPage.getSuccessfulMessage());


        cartPage.clickTheOKButton();
        cartPage.waitUntilElementIsDisplayed(cartPage.successfulPurchaseMSG, 10);
    }
}
