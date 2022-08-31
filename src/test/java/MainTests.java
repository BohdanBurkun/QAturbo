import org.testng.annotations.Test;

public class MainTests extends BaseUI {
    //HeaderTests
    @Test
    public void HeaderTests(){
        mainPage.clickHomeButton();
        mainPage.clickJavaButton();
        mainPage.clickPricingButton();
        mainPage.clickReviewsButton();
        mainPage.clickAboutButton();}

    //RegistrationTests
    @Test
    public void registrationTests(){
        mainPage.clickJoinButton();
        registrationForm.fillInTheRegistration();
        registrationForm.submitRegistration();

    }


}
