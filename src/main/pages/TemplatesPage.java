import org.openqa.selenium.interactions.Actions;

public class TemplatesPage {

    private Selenium selenium;

        // Add XPaths here
    private static final String signUpButton = "//button[@data-hover='Sign Up']";

    public TemplatesPage() {
        this.selenium = new Selenium();
    }

    // Create a function that clicks on the Sign Up button

    public SignUpPage goToSignUpPage() {
        hoverOverElement(477, 341);
        selenium.clickByXpath(signUpButton);
        return new SignUpPage();
    }

    private void hoverOverElement(int x, int y) {
        Actions actions = new Actions(selenium.getDriver());
        actions.moveByOffset(x, y).perform();
    }
}
