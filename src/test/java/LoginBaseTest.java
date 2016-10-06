import Models.Selenium;
import PageObjects.LoginPage;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Daria_Ivanova2 on 10/6/2016.
 */
public class LoginBaseTest {
    LoginPage loginPage;

    @Before
    public void onTestSetup(){
        Selenium.Instance.openUrl("https://mail.google.com");
        loginPage = new LoginPage();
    }

    @After
    public void onTestCleanup(){
        Selenium.Instance.WebDriver.navigate().to("about:blank");
        Selenium.Instance.closeBrowser();
    }
}
