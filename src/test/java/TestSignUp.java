import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestSignUp {
	private Selenium selenium;
	private Account account;
	private TemplatesPage templates;
	private SignUpPage signUpPage;
	private OnboardingFirstStep onboarding;
	
	@BeforeMethod
	public void setUp(){
		// Instantiate page objects here
		selenium = new Selenium();
		templates = new TemplatesPage();
		account = new Account();

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

	@AfterMethod
	public void closeBrowser(){
		selenium.quitChrome();
	}
}
