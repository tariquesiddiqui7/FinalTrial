package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {
	@BeforeClass
	public void login() {
		landingPage.loginMethod();
	}
	
	@Test(priority=3)
	public void verifyPimPage() {
			Assert.assertEquals(pimPage.titleOfPimPage(), "PIM");
	}
	
	@Test(priority=4)
	public void verifyIdCheckBoxIsSelected() {
		pimPage.selectIdcheckBox();
		Assert.assertEquals(pimPage.verifyIdCheckBoxSelected(), true);
	}
	
}
