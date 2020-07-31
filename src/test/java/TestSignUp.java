import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestSignUp {
	private Selenium selenium;
	private Account account;
	private IndividualTemplatesPage templates;
	private SignUpPage signUpPage;
	private OnboardingFirstStep onboarding;
	
	@BeforeMethod
	public void setUp(){
		// Instantiate page objects here
		selenium = new Selenium();
		account = new Account();
		signUpPage = new SignUpPage();

		selenium.goToUrl("http://venngage.com/templates");
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		signUpPage = templates.goToSignUpPage();
		onboarding = signUpPage.signUp(account);

		assertTrue(onboarding.getPageTitle().contains("Venngage | Survey"));
		assertTrue(onboarding.getWelcomeMessage().contains(account.getFirstName()));
	}
}
