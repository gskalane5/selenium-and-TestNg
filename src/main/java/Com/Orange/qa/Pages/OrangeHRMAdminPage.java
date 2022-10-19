package Com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.base.TestBase;

public class OrangeHRMAdminPage extends TestBase {

	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement Loginbutton;
	@FindBy(xpath="(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[6]") WebElement info;
	
	@FindBy(xpath="(//h6[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"])[1]") WebElement text;
	
	
	public OrangeHRMAdminPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public boolean click(String UN, String PWD) throws InterruptedException {
		Username.sendKeys(UN);
		Thread.sleep(3000);
		
		Password.sendKeys(PWD);
		Thread.sleep(3000);

		Loginbutton.click();
		
		Thread.sleep(3000);
		
		info.click();
		Thread.sleep(3000);
		
		return text.isDisplayed();
		
	}
	

}
