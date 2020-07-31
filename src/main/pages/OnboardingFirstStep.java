public class OnboardingFirstStep {
    private Selenium selenium;
    private static final String welcomeMessage = "//div[@class='styles__greeting--3psym']/h3";

    public OnboardingFirstStep(){
        this.selenium = new Selenium();
    }

    public String getPageTitle(){
        return selenium.getPageTitle();
    }

    public String getWelcomeMessage(){
        return selenium.getElementText(welcomeMessage);
    }
}
