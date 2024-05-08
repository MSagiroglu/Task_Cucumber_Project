package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.N11Pages;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class SearchDetilsForN11 {
    N11Pages n11Pages = new N11Pages();
    Faker faker = new Faker();
    String productName = ConfigReader.getProperty("productName");
    String currency = ConfigReader.getProperty("currency");

    @Given("Search product named  in search bar")
    public void search_product_named_in_search_bar() {
        n11Pages.searchBox.sendKeys(productName, Keys.ENTER);
    }

    @Given("Click the first result")
    public void click_the_first_result() {

        ReusableMethods.scroll(n11Pages.firstProduct);
        n11Pages.firstProduct.click();
    }


    @Then("Verify product details contains productName")
    public void verifyProductDetailsContainsProductName() {
        String productNameDetails = n11Pages.productNameDetails.getText();
        Assert.assertTrue(productNameDetails.contains(productName));

    }

    @Then("Verify product price contains currency")
    public void verifyProductPriceContainsCurrency() {
        String productPrice = n11Pages.productPrice.getText();
        Assert.assertTrue(productPrice.contains(currency));

    }

    @Then("Verify brand rate point is visible")
    public void verifyBrandRatePointIsVisible() {
        Assert.assertTrue(n11Pages.shopPoint.isDisplayed());
    }

    @Given("Search {string}  in search bar")
    public void searchInSearchBar(String arg0) {
        n11Pages.searchBox.sendKeys(arg0, Keys.ENTER);

    }

    @Then("Verify product details contains {string} in productName")
    public void verifyProductDetailsContainsInProductName(String arg0) {
        String productNameDetails = n11Pages.productNameDetails.getText();
        Assert.assertTrue(productNameDetails.contains(arg0));
    }
}
