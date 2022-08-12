import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MainTests extends BaseUI {
    By registration = By.cssSelector("div[id='comp-kfwl696p']");
    By textfirstName = By.cssSelector("input[name='first-name']");
    By textlastName = By.cssSelector("input[name='last-name']");
    By textemail = By.cssSelector("input[name='email']");
    By textnumberPhone = By.xpath("//input[@name='phone']");
    By textyourJobTitle = By.xpath("//input[@name='your-job title ']");
    By textenglishLevel = By.xpath("//input[@name='english-level']");
    By textwhyDoYouWantToLearnAutomation = By.xpath("//input[contains(@name,'why-do')]");
    By submit = By.cssSelector("div[id='comp-k90973nm']");
    By buttonHome = By.xpath("//p[@id='comp-kf8fejw00label']");
    By buttonJava = By.xpath("//p[@id='comp-kf8fejw01label']");
    By buttonPricing = By.xpath("//p[@id='comp-kf8fejw02label']");
    By buttonReviews = By.xpath("//p[@id='comp-kf8fejw03label']");
    By buttonAbout = By.xpath("//p[@id='comp-kf8fejw04label']");

    String firstName = "Bohdan";
    String lastName = "Burkun";
    String email = "zxcvbn@gmail.com";
    String numberPhone = "+380123456789";
    String jobTitle = "QA Automation engineer";
    String lishLevel = "Beginner";
    String questions = "This is the future and we must move forward with it!";

    @Test
    public void registrationTests1(){
    driver.findElement(registration).click();
    driver.findElement(textfirstName).sendKeys(firstName);
    driver.findElement(textlastName).sendKeys(lastName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(textemail).sendKeys(email);
    driver.findElement(textnumberPhone).sendKeys(numberPhone);
        wait.until(ExpectedConditions.elementToBeClickable(textyourJobTitle));
    driver.findElement(textyourJobTitle).sendKeys(jobTitle);
    driver.findElement(textenglishLevel).sendKeys(lishLevel);
    driver.findElement(textwhyDoYouWantToLearnAutomation).sendKeys(questions);
    driver.findElement(submit).click();
    }
    @Test
    public void buttonHomeTests2(){
        driver.findElement(buttonHome).click();
    }
    @Test
    public void buttonJavaTests3(){
        driver.findElement(buttonJava).click();
    }
    @Test
    public void buttonPricingTests4(){
        driver.findElement(buttonPricing).click();
    }
    @Test
    public void buttonReviewsTests5(){
        driver.findElement(buttonReviews).click();
    }
    @Test
    public void buttonAboutTests6(){
        driver.findElement(buttonAbout).click();
    }

}
