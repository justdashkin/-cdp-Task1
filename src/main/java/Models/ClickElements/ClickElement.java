package Models.ClickElements;

import Models.ClickElements.Interfaces.IUiClickableElement;
import Models.UIElementBase;

/**
 * Created by Daria_Ivanova2 on 10/6/2016.
 */
public class ClickElement extends UIElementBase implements IUiClickableElement {

    private static int counOfInstances;

    public ClickElement(String xpath) {
        super(xpath);
        counOfInstances++;
    }

    public void Click() {
        element.click();
    }

    public boolean isDisplayed(){
        return element.isDisplayed();
    }

    public static int getNumOfInstances() {
        return counOfInstances;
    }
}
