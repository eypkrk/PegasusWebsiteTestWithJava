import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//bol bol kullanıcı girişi
public class MoreMoreLogin extends BasePage{
   Variables variables = new Variables(driver);
    public MoreMoreLogin(WebDriver driver) {
        super(driver);
        driver.get(baseUrl);
    }
    public void loginNotChooseRobot(){
        waitForSee(variables.bolbol);
        click(variables.bolbol);
        waitForSee(variables.loginWPhone);
        sKeys(variables.loginWPhone,"5552228899");
        sKeys(variables.loginWPassword,"111222333");
        WebElement nameFrame = cssSelectorFind(variables.robotName);
        driver.switchTo().frame(nameFrame);
        waitForSee(variables.notRobot);
        click(variables.notRobot);
        driver.switchTo().parentFrame();
        click(variables.loginBtn);
    }
}
