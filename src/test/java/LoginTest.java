import Models.InputElements.InputElement;
import org.junit.Test;

/**
 * Created by Daria_Ivanova2 on 10/6/2016.
 */
public class LoginTest extends LoginBaseTest {
    @Test
    public void test(){
        loginPage.email.setValue("looksliketestuser@gmail.com");
        loginPage.next.Click();
        System.out.println("count of instances" + InputElement.getNumOfInstances());
    }
}
