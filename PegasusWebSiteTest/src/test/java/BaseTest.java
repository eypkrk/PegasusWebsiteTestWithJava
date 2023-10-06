import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class BaseTest {
    WebDriver driver;
    MainPageBuyTicket mainPageBuyTicket;
    Search search;
    OurServices ourServices;
    MoreMoreLogin moreMoreLogin;
    //ana test sayfamız öncesinde ve sonrasında çalışacaklar

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver();
    }
    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPageBuyTicket = new MainPageBuyTicket(driver);
        search = new Search(driver);
        ourServices = new OurServices(driver);
        moreMoreLogin = new MoreMoreLogin(driver);
        mainPageBuyTicket.click(mainPageBuyTicket.variables.closeSvg);

    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }
}
