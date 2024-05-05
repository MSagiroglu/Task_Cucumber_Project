package pages;

import io.cucumber.java.zh_cn.假如;
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

    @FindBy(xpath = "(//img[@class='lazy cardImage'])[1]")
    public WebElement firstProduct;
    @FindBy(xpath = "//h1[@class='proName']")
    public WebElement productNameDetails;

    @FindBy(xpath = "//div[@class='newPrice']")
    public WebElement productPrice;
    @FindBy(xpath = "//div[@class='unf-p-seller-grade']/div")
    public WebElement shopPoint;
    @FindBy(xpath = "//efilli-layout-dynamic")
    public WebElement shadowParentElement;
    @FindBy(css = "div[data-name='Reject Button']")
    public WebElement rejectButton;
    @FindBy(xpath = "//div[@name='Accept Button']")
    public WebElement rejectButton2;


    //kkhh

}
