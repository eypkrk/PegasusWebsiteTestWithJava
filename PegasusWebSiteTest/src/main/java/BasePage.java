import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//ana sayfamız, selectorlerin metodların tanımlandığı kısım
public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    String baseUrl = "https://www.flypgs.com/";

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement cssSelectorFind(String css){
        return driver.findElement(By.cssSelector(css));
    }
    public List cssSelectorsFinds(String css){
        return driver.findElements(By.cssSelector(css));
    }
    public WebElement xpathSelectorFind(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }
    public List xpathSelectorsFind(String xpath){
        return driver.findElements(By.xpath(xpath));
    }
    public void click(String css){
        cssSelectorFind(css).click();
    }
    public void clickXpath(String xpath){
        xpathSelectorFind(xpath).click();
    }
    public void sKeys(String css,String text){
        cssSelectorFind(css).sendKeys(text);
    }
    public void sKeysClick(String css,Keys btn){
        cssSelectorFind(css).sendKeys(btn);
    }
    public void scroll(int value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+value+")");
    }
    public void actions(WebElement locator){
        actions = new Actions(driver);
        actions.moveToElement(locator).perform();
    }

    public void chooseDay(String xpath,String date,String hoverDay)throws Exception{
        List<WebElement> days = xpathSelectorsFind(xpath);
        for (WebElement day:days){
            String cDay = day.getText();//tarihin sayısını bulamıyor kontrol edilecek
            if (cDay.equals(date)){
                System.out.println(day.getText());
                actions(day);
                waitForSee(hoverDay);
                Thread.sleep(2000);
                if (xpathSelectorFind(xpath).getAttribute("class").equalsIgnoreCase("ui-state-default ui-state-hover")){
                    day.click();
                    Thread.sleep(2000);
                }
            }
        }
    }

    public void waitForSee(String text){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(text)));
    }
    public void waitXpath(String xpath){
        wait = new WebDriverWait(driver,Duration.ofSeconds(5L));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public void clear(String css){
        cssSelectorFind(css).clear();
    }

    public void otherScreen(int number){
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(number));
    }
}
