package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;

/**
 * Created by Daria_Ivanova2 on 10/6/2016.
 */

public class Selenium {

    private Selenium(){}

    private static Selenium instance;
    public static Selenium Instance = Selenium.getInstance();

    private static Selenium getInstance(){

        return (instance!=null)?instance:new Selenium();
    }

    public RemoteWebDriver _webDriver;

    public RemoteWebDriver WebDriver = getWebDriver();

    private RemoteWebDriver getWebDriver(){
        File file = new File("D:/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        if(_webDriver == null) _webDriver = new ChromeDriver();
        return _webDriver;
    }

    public void openUrl(String url){
        WebDriver.navigate().to(url);
        WebDriver.manage().window().maximize();
    }

    public WebElement findWebElement(String xpath){
        if(xpath != null) return WebDriver.findElement(By.xpath(xpath));
        return null;
    }

    public void refreshPage(){
        WebDriver.navigate().refresh();
        WebDriver.switchTo().alert().accept();
    }

    public void closeBrowser(){
        if(_webDriver != null) WebDriver.quit();
        _webDriver = null;
    }
}
