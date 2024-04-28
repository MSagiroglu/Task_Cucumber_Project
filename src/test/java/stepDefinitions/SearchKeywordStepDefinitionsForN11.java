package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.N11Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class SearchKeywordStepDefinitionsForN11 {

    N11Pages n11Pages = new N11Pages();


    @And("User searches for a keyword in the search box finding results")
    public void userSearchesForAKeywordInTheSearchBoxFindingResults() {
        ReusableMethods.waitForVisibility(n11Pages.searchBox, 5);
        n11Pages.searchBox.sendKeys(ConfigReader.getProperty("SearchWordForResults"), Keys.ENTER);
    }


    @Then("Verify that search results should be displayed in the Browser")
    public void verifyThatSearchResultsShouldBeDisplayedInTheBrowser() throws IOException {
        ReusableMethods.waitForVisibility(n11Pages.succesfullResult, 5);
        Assert.assertTrue(n11Pages.succesfullResult.isDisplayed());
        ReusableMethods.logToTxtFileWithSearchedTermPositive(n11Pages.succesfullResult, " Results for ", ConfigReader.getProperty("reportTxtFileForSearchKeyword"), ConfigReader.getProperty("SearchWordForResults"));
        ReusableMethods.getScreenshot("Succesfull_Search");
        Driver.quitDriver();
    }

    @When("User searches for a keyword in the search box finding no results")
    public void userSearchesForAKeywordInTheSearchBoxFindingNoResults() {
        ReusableMethods.waitForVisibility(n11Pages.searchBox, 5);
        n11Pages.searchBox.sendKeys(ConfigReader.getProperty("SearchWordForNoResults"), Keys.ENTER);
    }


    @Then("Verify that no search results should be displayed in the Browser")
    public void verifyThatNoSearchResultsShouldBeDisplayedInTheBrowser() throws IOException {
        ReusableMethods.waitForVisibility(n11Pages.notFoundImg, 5);
        Assert.assertTrue(n11Pages.notFoundImg.isDisplayed());
        ReusableMethods.getScreenshot("Unsuccesfull_Search");
        ReusableMethods.logToTxtFileWithSearchedTermNegativeAfterPositive(n11Pages.notFoundText, " Results for ", ConfigReader.getProperty("reportTxtFileForSearchKeyword"), ConfigReader.getProperty("SearchWordForNoResults"));
        Driver.quitDriver();

    }



}
