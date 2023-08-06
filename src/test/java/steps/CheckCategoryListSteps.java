package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AccountPage;
import pages.PageBase;
import pages.ProductDetailsPage;
import testBase.TestBasePage;

public class CheckCategoryListSteps extends TestBasePage {

    AccountPage accountPage ;

    @Then("Check that the category List has Items")
    public void checkThatTheCategoryListHasItems(){
        accountPage = new AccountPage(driver);
        accountPage.checkCategoryItemsList();
        Assert.assertEquals(3,accountPage.categoryList.size());


    }

    @Then("User is selected random products")
    public void userIsSelectedRandomProducts() {
        accountPage.scrollBy();
        accountPage.selectRandomItem();


    }


}
