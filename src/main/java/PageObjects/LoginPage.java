package PageObjects;

import Models.ClickElements.ClickElement;
import Models.InputElements.InputElement;

/**
 * Created by Daria_Ivanova2 on 10/6/2016.
 */
public class LoginPage {
    public InputElement email = new InputElement("//input[@id='Email']");
    public ClickElement next = new ClickElement("//*[@id='next']");
}
