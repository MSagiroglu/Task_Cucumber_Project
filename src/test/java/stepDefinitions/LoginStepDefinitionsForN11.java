package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.N11Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class LoginStepDefinitionsForN11 {

    N11Pages n11Pages = new N11Pages();


    @Given("User navigates to {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("User clicks to Giris Yap button")
    public void userClicksToGirisYapButton() {
        ReusableMethods.waitForVisibility(n11Pages.girisYapButton, 5);
        ReusableMethods.click(n11Pages.girisYapButton);
    }

    @And("User enters valid username and password")
    public void userEntersValidUserNameAndPassWord() {
        ReusableMethods.waitForVisibility(n11Pages.epostaAdresi, 5);
        n11Pages.epostaAdresi.sendKeys(ConfigReader.getProperty("Username"), Keys.TAB, ConfigReader.getProperty("Password"));
    }

    @When("User clicks to Giris Yap button below")
    public void userClicksToGirisYapButtonBelow() {
        ReusableMethods.waitForVisibility(n11Pages.girisYapButton2, 5);
        ReusableMethods.click(n11Pages.girisYapButton2);

    }

    @Then("Verify that user should be logged in successfully")
    public void VerifyThatUserShouldBeLoggedInSuccessfully() throws IOException {
        ReusableMethods.waitForVisibility(n11Pages.hesabimButton, 5);
        assertTrue(n11Pages.hesabimButton.getAttribute("title").contains("Hesabım"));
        ReusableMethods.getScreenshot("N11SuccesfullLogin");

    }

    @When("User logs out")
    public void userLogsOut() {
        ReusableMethods.click(n11Pages.cikisYapButton);
    }

    @Then("Verify that user should be logged out successfully")
    public void VerifyThatUserShouldBeLoggedOutSuccessfully() throws IOException {
        ReusableMethods.wait(5);
        Assert.assertTrue(n11Pages.girisYapButton.isDisplayed());
        ReusableMethods.getScreenshot("N11SuccesfullLogout");
    }


    @When("User enters invalid username and password")
    public void UserEntersInvalidUserNameAndPassWord() {
        ReusableMethods.waitForVisibility(n11Pages.epostaAdresi, 5);
        n11Pages.epostaAdresi.clear();
        n11Pages.epostaAdresi.sendKeys(ConfigReader.getProperty("InvalidUsername"), Keys.TAB, ConfigReader.getProperty("InvalidPassword"));

    }

    @Then("Verify that user should see an error message")
    public void verifyThatUserShouldSeeAnErrorMessage() throws IOException {
        ReusableMethods.wait(5);
        Assert.assertTrue(n11Pages.errorText.isDisplayed());

        ReusableMethods.logToTxtFile(n11Pages.errorText, ConfigReader.getProperty("loginErrorDefiningMessage"), ConfigReader.getProperty("reportTxtFileForLogin"));

        ReusableMethods.jsExecutorScrool(n11Pages.errorText);
        ReusableMethods.getScreenshot("ErrorAlertMessage");

        //Driver.quitDriver();
    }


}