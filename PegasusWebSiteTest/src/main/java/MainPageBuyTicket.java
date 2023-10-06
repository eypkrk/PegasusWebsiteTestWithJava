import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageBuyTicket extends BasePage{


    Variables variables = new Variables(driver);
        public MainPageBuyTicket(WebDriver driver) {
        super(driver);
        driver.get(baseUrl);
    }
    //anasayfada bilet almak için kullanılan sayfa
    public void BuyTicket(){
        scroll(200);
        waitForSee(variables.fromWhere);
        click(variables.fromWhere);
        WebElement moveCity = cssSelectorFind(variables.cities);
        actions(moveCity);
        click(variables.city);
        WebElement goCity = cssSelectorFind(variables.toWhereCities);
        actions(goCity);
        waitForSee(variables.toCity);
        click(variables.toCity);
        waitForSee(variables.goDay);
        waitXpath(variables.dateArea);
        waitXpath(variables.day23);
        clickXpath(variables.day23);
        waitXpath(variables.day28);
        clickXpath(variables.day28);
        waitXpath(variables.armChair);
        clickXpath(variables.armChair);//armchair bulunacak
        sKeys(variables.plusPassenger,"2");
        clear(variables.plusPassenger);
        click(variables.clickPassenger);
        click(variables.searchFly);
        scroll(300);
    }
}
