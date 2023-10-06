import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//hizmetlerim sekmesi için kullandığımız sayfa
public class OurServices extends BasePage{
    Variables variables = new Variables(driver);
    public OurServices(WebDriver driver) {
        super(driver);
        driver.get(baseUrl);
    }
    public void services(){
        waitForSee(variables.ourServices);
        WebElement ourService = driver.findElement(By.cssSelector(variables.ourServices));
        actions(ourService);
        waitForSee(variables.jumpGo);
        WebElement goJump = driver.findElement(By.cssSelector(variables.jumpGo));
        actions(goJump);
        waitForSee(variables.benefitInf);
        WebElement benfInf = driver.findElement(By.cssSelector(variables.benefitInf));
        actions(benfInf);
        waitForSee(variables.moreServices);
        click(variables.moreServices);
        scroll(200);
        waitForSee(variables.line);
        click(variables.line);
        scroll(300);
        waitForSee(variables.cook);
        click(variables.cook);
        scroll(900);
        waitForSee(variables.PNR);
        sKeys(variables.PNR,"DENEME");
        sKeys(variables.surname,"test");
        click(variables.continuePNR);
        otherScreen(1);
        waitForSee(variables.otherScreenPNR);
        click(variables.otherScreenPNR);
        System.out.println(driver.getCurrentUrl());
        driver.close();
        otherScreen(0);
    }
}
