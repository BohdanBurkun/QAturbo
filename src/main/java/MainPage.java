import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions{
    public MainPage(WebDriver driver, WebDriverWait wait) {super(driver,wait);}
    public void clickJoinButton(){driver.findElement(Locators.REGISTRATION_BUTTON).click();}
    //Header
    public void clickHomeButton(){driver.findElement(Locators.BUTTON_HOME).click();}
    public void clickJavaButton(){driver.findElement(Locators.BUTTON_JAVA).click();}
    public void clickPricingButton(){driver.findElement(Locators.BUTTON_PRICING).click();}
    public void clickReviewsButton(){driver.findElement(Locators.BUTTON_REVIEWS).click();}
    public void clickAboutButton(){driver.findElement(Locators.BUTTON_ABOUT).click();}

}
