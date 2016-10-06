package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Daria_Ivanova2 on 10/6/2016.
 */
public abstract class UIElementBase {
    public String xpath;
    public WebElement element;

    public  UIElementBase(String xpath){
        this.xpath = xpath;
        this.element = getElement();
    }

    private WebElement getElement(){
        return Selenium.Instance.findWebElement(xpath);
    }
}
