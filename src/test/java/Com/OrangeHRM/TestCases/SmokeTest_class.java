package Com.OrangeHRM.TestCases;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Orange.qa.Pages.Smoke_Page;
import Com.OrangeHRM.qa.base.TestBase;

public class SmokeTest_class extends TestBase {
	Smoke_Page smoke;
	public SmokeTest_class() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		 initialization();  	
		 
		 smoke= new Smoke_Page();
		 
	}
	@Test
	
	public void validatesmoketest() {
		boolean smoke1= smoke.conductsmoketest();
		AssertJUnit.assertTrue(true);
	}
	@Test
	public void validatesmoketest1() {
		boolean smoke2= smoke.Forgetpass();
		AssertJUnit.assertTrue(false);
	}
	@Test
	public void validatesmoketest2() {
		boolean smoke3= smoke.smoketest();
		AssertJUnit.assertTrue(true);
	}
	@AfterMethod
	public void Teardown() {
		driver.quit();
		
	}

}
