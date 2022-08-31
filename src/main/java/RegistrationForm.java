import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions {
    public RegistrationForm(WebDriver driver, WebDriverWait wait) { super(driver, wait);}
    public void fillInTheRegistration(){
        driver.findElement(Locators.TEXT_FIRST_NAME).sendKeys(Data.firstName);
        driver.findElement(Locators.TEXT_LAST_NAME).sendKeys(Data.lastName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Locators.TEXT_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_NUMBER_PHONE).sendKeys(Data.numberPhone);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_YOUR_JOP_TITLE));
        driver.findElement(Locators.TEXT_YOUR_JOP_TITLE).sendKeys(Data.jobTitle);
        driver.findElement(Locators.TEXT_ENGLISH_LEVEL).sendKeys(Data.lishLevel);
        driver.findElement(Locators.TEXT_WHY_DO_YOU_WANT_TO_LEARN_AUTOMATION).sendKeys(Data.questions);
    }
    public void submitRegistration(){
        driver.findElement(Locators.SUBMIT_BUTTON).click();
    }
}
