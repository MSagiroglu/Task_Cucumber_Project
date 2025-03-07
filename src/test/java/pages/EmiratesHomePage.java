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
    @FindBy (id ="field-43f04090-5f21-4dbb-aeb1-12adcce2657b")
    public WebElement firstCity;
}
