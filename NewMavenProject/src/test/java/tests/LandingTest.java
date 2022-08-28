package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends BaseTest {

	@Test(priority = 2, groups = { "smoke", "regression" })
	public void verifyLogin() {
		landingPage.loginMethod();
		Assert.assertEquals(pimPage.titleOfPimPage(), "PIM");
	}

	@Test(priority = 1)
	public void verifyLoginPageIsDisplayed() {
		Assert.assertEquals(landingPage.titleLoginPage(), "Login");
	}

	@Test(priority = 0, groups = "smoke")
	public void verifyUrlOfPage() {
		Assert.assertEquals(landingPage.currentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
