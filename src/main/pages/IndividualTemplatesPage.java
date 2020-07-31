import org.openqa.selenium.interactions.Actions;

public class IndividualTemplatesPage {

    private Selenium selenium;
    private static final String firstTemplate = "";
    private static final String signUpButton = "//button[@data-hover='Sign Up']";

    // Add XPaths here


    public IndividualTemplatesPage() {
        this.selenium = new Selenium();
    }

    // Create a function that clicks on the Sign Up button

    public SignUpPage goToSignUpPage() {
        hoverOverElement(firstTemplate);
        selenium.clickByXpath(signUpButton);
        return new SignUpPage();
    }

    private void hoverOverElement(String xpath) {
        Actions actions = new Actions(selenium.getDriver());
        actions.moveToElement(selenium.getElement(xpath)).perform();
    }
}
