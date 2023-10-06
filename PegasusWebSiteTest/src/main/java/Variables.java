import org.openqa.selenium.WebDriver;

public class Variables extends BasePage{
    //değişkenlerin tanımlandğı sayfa
    String fromWhere = "div[id='search_cheap_flight_from_arrow_icon']";
    String cities = "div[class='flySearch-content-list nxm-360-search-select-airpot-lists'] div[class='nxm-360-search-select-airpot-list-content']";
    String city = "li[data-name='Gaziantep']";
    String closeSvg = "div[class='c-newsletter__close'] path";
    String toWhere = "div[id='search_cheap_flight_to_arrow_icon']";
    String toWhereCities = "div[class='flySearch-content-list nxm-360-search-select-airpot-lists flex-column'] div[class='nxm-360-search-select-airpot-list-content']";
    String toCity = "div[class='flySearch-content-list nxm-360-search-select-airpot-lists flex-column'] li[class='flySearch-airport-list-item-content nxm-360-search-select-airpot-list-li nxm-360-port_IST_SAW']";
    String goDay = "div[id='search-flight-datepicker-departure'] tr td a";
    String day23Bozuk = "//div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[5]/td[1]/a[contains(text(),23)]";
    String dateArea = "//div[1]/div[2]/div[6]/div[1]/table";
    String day23 = "//div[1]/div[2]/div[6]/div[1]/table[1]/tbody[1]/tr[5]/td/a[contains(text(),23)]";
    String day28Bozuk = "//div[6]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/a[contains(text(),28)]";
    //-//div[6]/div[1]/table[1]/tbody[1]/tr[5]//a[contains(text(),28)]
    String day28 = "//div[@id='search-flight-datepicker-arrival']/div/div/table[1]/tbody[1]/tr[5]/td[6]/a[contains(text(),28)]";
    String BzkarmChair = "div[class='col-sm-6 col-xs-12 passenger-select-area'] div[class='nxm2_form-control']";
    String armChair = "//div[@id='passengerFirst']/div[1]/div[@class='nxm2_form-control']";
    //div[@id='passengerFirst']/div[1]
    String plusPassenger = "li[data-type='ytn'] input[type='number']";
    String clickPassenger = "div[id='nxm2_passenger-select-first'] div[class='nxm2_passenger-select-box']  a[class='nxm2_btn nxm2_btn-orange nxm2_btn-full nxm2_passenger-close']";
    String searchFly = "button[id='hype-search_cheap_flight_search_button']";
    String searchBtn = "input[type='search']";
    String visaCountry = "div a[title='İsviçre Vize Rehberi'] span[class='text-light text-24']";
    String jumpGo = "div li span span[id='why_not_just_go_category']";
    String benefitInf ="span[id='use_information_main_category']";
    String ourServices = "a[id='nexum_services_menu_label']";
    String moreServices = "a[id='use_information_1_label']";
    String line = "section[id='widget-108471'] a[class='accordion-trigger js-show-more is-active']";
    String cook = "div[class='col-sm-4 hidden-xs'] a[title='YEMEK SEÇİMİ']";
    String PNR = "div[class='col-xs-10 col-no-gutter'] input";
    String surname = "div[class='p-r-sm-10 p-b-10'] input";
    String continuePNR = "div[class='col-sm-8 col-xs-12'] button";
    String otherScreenPNR = "div[class='MuiDialogActions-root dialog-action-container MuiDialogActions-spacing'] button";

    String bolbol = "div[class='header-bolbol']";
    String loginWPhone = "input[name='user-phone']";
    String loginWPassword = "input[id='user-password']";
    String loginBtn = "input[id='submit-login-form']";
    String errMessage = "span[class='error-message grecaptcha-error']";
    String robotName = "iframe[title='reCAPTCHA']";
    String notRobot = "div[class='recaptcha-checkbox-border']";
    public Variables(WebDriver driver) {
        super(driver);
    }
}
