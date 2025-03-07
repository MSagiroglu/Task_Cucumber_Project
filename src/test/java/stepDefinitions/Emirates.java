package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.EmiratesHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Emirates {
    EmiratesHomePage emirates = new EmiratesHomePage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User should choose first city")
    public void userShouldChooseFirstCity() {
        ReusableMethods.waitForVisibility(emirates.acceptButton, 5);
        emirates.acceptButton.click();
        ReusableMethods.waitForClickablility(emirates.xButton, 5);
        actions.click(emirates.firstCity);
        actions.sendKeys(Keys.CLEAR).sendKeys(" dxb").build().perform();
        ReusableMethods.wait(2);
        WebElement country = Driver.getDriver().findElement(By.xpath("//p[@class=\"location__airport__city\" and @data-location-value=\"Dubai\"]"));
        actions.sendKeys(Keys.ENTER).build().perform();

    }

    @And("User should choose second city")
    public void userShouldChooseSecondCity() {
        ReusableMethods.waitForClickablility(emirates.secondCity, 5);
        actions.click(emirates.secondCity);
        actions.sendKeys(" ist").build().perform();
        ReusableMethods.wait(2);
        WebElement country = Driver.getDriver().findElement(By.xpath("//p[@class=\"location__airport__city\" and @data-location-value=\"İstanbul\"]"));
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    @And("User should choose flights dates")
    public void userShouldChooseFlightsDates() {
    }

    @And("Uer should choose number of passengers")
    public void uerShouldChooseNumberOfPassengers() {
    }

    @And("User Should choose class of flight")
    public void userShouldChooseClassOfFlight() {
    }

    @When("User should click on search button")
    public void userShouldClickOnSearchButton() {
    }

    @Then("User should see available flights for correct dates")
    public void userShouldSeeAvailableFlightsForCorrectDates() {
    }
}
