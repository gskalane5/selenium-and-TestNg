package Com.OrangeHRM.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Orange.qa.Pages.OrangeHRMLeavePage;
import Com.Orange.qa.Pages.OrangeHRMLoginpage;
import Com.OrangeHRM.qa.base.TestBase;

public class Leavepage extends TestBase {

	OrangeHRMLeavePage leavepage1;
	OrangeHRMLoginpage Loginpage;
	public Leavepage() throws IOException {
		super();
	}

@BeforeMethod
public void setup() throws IOException {
initialization();
leavepage1= new OrangeHRMLeavePage();
Loginpage =new OrangeHRMLoginpage();

}
@Test
public void runapplyleave() throws InterruptedException {
	Loginpage.Validateusername(props.getProperty("Username"), props.getProperty("Password"));
	leavepage1.applyleave();
}
@AfterMethod
public void teardown() {
	driver.quit();
}
}
