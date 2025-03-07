package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmiratesHomePage {
    public EmiratesHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "onetrust-accept-btn-handler")
    public WebElement acceptButton;
    @FindBy(xpath = "//*[@id=\"search-flight-control\"]/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div[1]/div/button")
    public WebElement xButton;
    @FindBy (xpath ="//*[@id=\"search-flight-control\"]/section/div[4]/div[1]/div[1]/div/div[1]/div/div/div[1]")
    public WebElement firstCity;

    @FindBy(name = "Varış havalimanı")
    public WebElement secondCity;
}
