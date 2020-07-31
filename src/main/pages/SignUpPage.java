public class SignUpPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String firstNameInput = "//input[@id='user_first_name']";
	private static final String lastNameInput = "//input[@id='user_last_name']";
	private static final String emailInput = "//input[@type='email']" ;
	private static final String passwordInput = "//input[@type='password']";
	private static final String signUpButton = "//button[@id='btn_register']";
	
	
	public SignUpPage(){
		this.selenium = new Selenium();
	}
	
	// Create a function that takes an Account and simulates signing up using Selenium actions. (Refer to Selenium.java)
	public OnboardingFirstStep signUp(Account account){
		selenium.sendKeys(firstNameInput, account.getFirstName());
		selenium.sendKeys(lastNameInput, account.getLastName());
		selenium.sendKeys(emailInput, account.getEmail());
		selenium.sendKeys(passwordInput, account.getPassword());
		selenium.clickByXpath(signUpButton);
		selenium.waitUntilPageTitleContainsString("Survey");
		return new OnboardingFirstStep();
	}
	
}