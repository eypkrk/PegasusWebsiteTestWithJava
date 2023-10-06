import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_Login extends BaseTest{

    @Test
    public void login(){
        moreMoreLogin.loginNotChooseRobot();
        WebElement text = driver.findElement(By.cssSelector(moreMoreLogin.variables.errMessage));
        String txt = text.getText();
        Assertions.assertEquals("Recaptcha alanı zorunludur",txt,"is not equals!!!");
    }
}
