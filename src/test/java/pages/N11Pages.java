package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11Pages {

    public N11Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement girisYapButton;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement girisYapButton2;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement sifreGirTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement epostaAdresi;

    @FindBy(xpath = "//*[@class='user']")
    public WebElement hesabimButton;

    @FindBy(xpath = "//*[.='E-posta adresi veya şifre hatalı, kontrol edebilir misin?']")
    public WebElement errorText;
    @FindBy(xpath = "//*[@class='logoutBtn']")
    public WebElement cikisYapButton;

    @FindBy(xpath = "//input[@id='searchData']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='resultView']")
    public WebElement succesfullResult;

    @FindBy(xpath = "//i[@class='notFoundImg']")
    public WebElement notFoundImg;

    @FindBy(xpath = "//h1")
    public WebElement notFoundText;

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement girisYapButton3;


}
