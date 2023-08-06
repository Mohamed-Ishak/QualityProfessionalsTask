package steps;

import io.cucumber.java.en.And;
import pages.ProductDetailsPage;
import testBase.TestBasePage;

public class ProductDetailsPageSteps extends TestBasePage {

    ProductDetailsPage productDetailsPage ;
    @And("User is added a random product to cart")
    public void userIsAddedARandomProductToCart() {
        productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage.clickOnAddToCartButton();
    }

    @And("User is clicked on Cart tab and navigated to Cart page")
    public void userIsClickedOnCartTab() {
        productDetailsPage.clickOnCartTab();

    }


}
