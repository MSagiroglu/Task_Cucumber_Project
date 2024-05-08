package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.N11Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class Hooks {
    N11Pages n11Pages = new N11Pages();

    @Before
    public void setUp() throws Exception {
        System.out.println("Scenariolar çalışmaya başladı");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.shadowRootWithSearchContext(n11Pages.shadowParentElement, ConfigReader.getProperty("ShadowRejectButton"));
        //ReusableMethods.shadowRootWithClickParent(n11Pages.shadowParentElement,n11Pages.rejectButton2);
        //ReusableMethods.shadowRootWithParentElement(n11Pages.shadowParentElement);
        n11Pages.dahaSonraButton.click();
    }

    // @Before("@UI")
    // public void beforeUI() throws Exception {
    //     System.out.println("UI testi başladı");
    //     Driver.getDriver().get(ConfigReader.getProperty("managementOnSchoolsUrl"));
    // }

    //  @Before("@admin")
    //  public void beforeApiAdmin() throws Exception {
    //      System.out.println("admin api before çalıştı.");


    //  }

    //  @Before("@dean")
    //  public void beforeApiDean() throws Exception {
    //      deanSetUp();

    //  }


    //  @Before("@viceDean")
    //  public void beforeApiViceDean() throws Exception {
    //      viceDeanSetUp();

    //  }

    //  @Before("@adviceTeacher")
    //  public void beforeApiAdviceTeacher() throws Exception {
    //      adviceTeacherSetUp();
    //  }

    //  @Before("@student")
    //  public void beforeApiStudent() throws Exception {
    //      studentSetUp();

    //  }


  @After//import io.cucumber.java.After;
  public void tearDown(Scenario scenario) throws Exception {
      if (scenario.isFailed()) {//-->Scenario fail olursa
          TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
          scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", scenario.getName());
          Driver.quitDriver();
      }
      Driver.closeDriver();
  }


//Bu method fail olan scenario'larda fail olan kısmın resmini rapora ekleyecektir.

    // @AfterAll
    // public static void tearDownAll() {
    //     Driver.closeDriver();
    // }

}


