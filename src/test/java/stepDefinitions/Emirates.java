package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        actions.scrollToElement(emirates.firstCity).perform();

       // ReusableMethods.scroll(emirates.firstCity);
       // emirates.firstCity.click();
        emirates.firstCity.clear();
        emirates.firstCity.sendKeys("dubai", Keys.ENTER);
    }

    @And("User should choose second city")
    public void userShouldChooseSecondCity() {
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
