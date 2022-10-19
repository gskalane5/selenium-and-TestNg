package Com.OrangeHRM.TestCases;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Orange.qa.Pages.OrangeHRMAdminPage;
import Com.OrangeHRM.qa.base.TestBase;

public class Adminpagetest extends TestBase{
	OrangeHRMAdminPage admin;

	public Adminpagetest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setup() throws IOException {
		initialization();  	
		
		admin= new OrangeHRMAdminPage();
		
	}
	@Test
	public void verifythetext() throws InterruptedException {
		
		boolean pagetext= admin.click(props.getProperty("Username"),props.getProperty("Password"));
		AssertJUnit.assertTrue(false);
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
		
	}

}
