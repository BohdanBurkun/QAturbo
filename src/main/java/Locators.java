import org.openqa.selenium.By;

public class Locators {
    //Registration
    public static final By REGISTRATION_BUTTON = By.cssSelector("div[id='comp-kfwl696p']");
    public static final By TEXT_FIRST_NAME = By.cssSelector("input[name='first-name']");
    public static final By TEXT_LAST_NAME = By.cssSelector("input[name='last-name']");
    public static final By TEXT_EMAIL = By.cssSelector("input[name='email']");
    public static final By TEXT_NUMBER_PHONE = By.xpath("//input[@name='phone']");
    public static final By TEXT_YOUR_JOP_TITLE = By.xpath("//input[@name='your-job title ']");
    public static final By TEXT_ENGLISH_LEVEL = By.xpath("//input[@name='english-level']");
    public static final By TEXT_WHY_DO_YOU_WANT_TO_LEARN_AUTOMATION = By.xpath("//input[contains(@name,'why-do')]");
    public static final By SUBMIT_BUTTON = By.cssSelector("div[id='comp-k90973nm']");

    //Header
    public static final By BUTTON_HOME = By.xpath("//p[@id='comp-kf8fejw00label']");
    public static final By BUTTON_JAVA = By.xpath("//p[@id='comp-kf8fejw01label']");
    public static final By BUTTON_PRICING = By.xpath("//p[@id='comp-kf8fejw02label']");
    public static final By BUTTON_REVIEWS = By.xpath("//p[@id='comp-kf8fejw03label']");
    public static final By BUTTON_ABOUT = By.xpath("//p[@id='comp-kf8fejw04label']");


}
