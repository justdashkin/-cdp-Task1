package Models.InputElements;

import Models.InputElements.Interfaces.IUiInputElement;
import Models.UIElementBase;
import org.openqa.selenium.Keys;

import java.security.Key;

/**
 * Created by Daria_Ivanova2 on 10/6/2016.
 */
public class InputElement extends UIElementBase implements IUiInputElement {

    private static int counOfInstances;

    public InputElement(String xpath) {
        super(xpath);
        counOfInstances++;
    }

    public void setValue(String value) {
        element.sendKeys(value);
    }

    public void submitValue(){
        element.sendKeys(Keys.ENTER);
    }

    public String getPlaceholder(){
        return element.getAttribute("placeholder");
    }

    public static int getNumOfInstances() {
        return counOfInstances;
    }
}
