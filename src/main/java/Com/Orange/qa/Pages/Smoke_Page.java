package Com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.OrangeHRM.qa.base.TestBase;

public class Smoke_Page extends TestBase{
	
	@FindBy(xpath="//img[@src=\"/web/images/ohrm_branding.png?1660914792648\"]") WebElement logo;
	
	@FindBy(xpath="//button[@type=\"submit\"]") WebElement loginbutton;
	
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]") WebElement Forgetpass;
	

	public Smoke_Page() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	public boolean conductsmoketest() {
		return logo.isDisplayed();
	}
public boolean smoketest() {
	return loginbutton.isEnabled();	
}
public boolean Forgetpass() {
	return Forgetpass.isEnabled();
	
}
}
