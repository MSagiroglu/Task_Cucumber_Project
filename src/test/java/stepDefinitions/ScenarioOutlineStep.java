package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.N11Pages;


public class ScenarioOutlineStep {
    N11Pages n11Pages = new N11Pages();
    @Given("Search {} in search bar.")
    public void searchInSearchBar(String arg0) {
        n11Pages.searchBox.sendKeys(arg0, Keys.ENTER);
    }

    @Then("Verify product details contains {} in productName")
    public void verifyProductDetailsContainsInProductName(String arg0) {
        String productNameDetails = n11Pages.productNameDetails.getText();
        Assert.assertTrue(productNameDetails.contains((arg0.split(" "))[0]));
    }

    @Then("Verify product price contains {}")
    public void verifyProductPriceContains(String arg0) {
        Assert.assertTrue(n11Pages.productPrice.getText().contains(arg0));
    }

    @Then("Verify product details contains {} in Product Tab")
    public void verifyProductDetailsContainsInProductTab(String arg0) {
        Assert.assertTrue(n11Pages.urunBaslik.getText().contains((arg0.split(" "))[0]));
    }
}
