package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BasePage {

	// Locators
	@FindBy(xpath = "//h6[text()='PIM']")
	WebElement txtPage;

	@FindBy(xpath = "//i[contains(@class,'oxd-icon bi-check oxd-checkbox-input-icon')]")
	List<WebElement> checkAll;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkInput;

	// Initialziation
	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Methods
	/*
	 * Author : Tarique Siddiqui Date : 26 Aug 2022 Decsription : This test methods
	 * is used to verify PIM page title
	 */
	public String titleOfPimPage() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return txtPage.getText();
	}

	/*
	 * Author : Tarique Siddiqui Date : 26 Aug 2022 Decsription : This test methods
	 * is used to verify checkbox on Id is selected
	 */
	public boolean verifyIdCheckBoxSelected() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return checkInput.get(0).isSelected();
	}

	/*
	 * Author : Tarique Siddiqui Date : 26 Aug 2022 Decsription : This test methods
	 * is used to select checkbox on Id
	 */
	public void selectIdcheckBox() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		checkAll.get(0).click();
	}
}
