import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//arama yapmak için kullandıımız sayfa
public class Search extends BasePage{
    Variables variables = new Variables(driver);
    public Search(WebDriver driver) {
        super(driver);
        driver.get(baseUrl);
    }
    public void search(){
        waitForSee(variables.searchBtn);
        click(variables.searchBtn);
        sKeys(variables.searchBtn,"vize");
        sKeysClick(variables.searchBtn, Keys.ENTER);
        scroll(500);
        waitForSee(variables.visaCountry);
        click(variables.visaCountry);

    }
}
