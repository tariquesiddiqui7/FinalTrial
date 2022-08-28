package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;
import pages.LandingPage;
import pages.PimPage;

public class BaseTest extends BasePage {

	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	@BeforeClass
	public void pageObjects() {
		landingPage = new LandingPage(driver);
		pimPage = new PimPage(driver);
		
	}
	
	@AfterClass
	public void tearDownEnvirnment() {
		driver.quit();
	}
	
}
