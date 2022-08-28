package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage{
	
	//All the locators of page
	@FindBy(xpath="//*[text()='Username']//parent::div//parent::div//input")
	WebElement userName;
	
	@FindBy(xpath="//*[text()='Password']//parent::div//parent::div//input")
	WebElement passWord;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement btnLogin;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginPage;
	

	
	//Initialization of locators/variables
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//methods required to perform test steps
	
	/* Author : Tarique Siddiqui
	 * Date  : 26 Aug 2022
	 * Decsription : This test methods is used to perform login on login Page
	 */
	public void loginMethod() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		btnLogin.click();
	}
	
	/* Author : Tarique Siddiqui
	 * Date  : 26 Aug 2022
	 * Decsription : This test methods is used to verify login page title
	 */
	public String titleLoginPage() {
		return txtLoginPage.getText();
	}
	
	/* Author : Tarique Siddiqui
	 * Date  : 26 Aug 2022
	 * Decsription : This test methods is used to verify url of page
	 */
	public String currentUrl() {
		return driver.getCurrentUrl();
	}

}
