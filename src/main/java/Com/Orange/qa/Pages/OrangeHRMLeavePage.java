package Com.Orange.qa.Pages;

import java.io.IOException;
import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.OrangeHRM.qa.base.TestBase;

public class OrangeHRMLeavePage extends TestBase {
	@FindBy(xpath="//a[@class=\"oxd-main-menu-item active\"]") private WebElement leave;
	
	@FindBy(xpath="//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]") private WebElement list1;
	@FindBy(xpath="(//i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"])[1]") private WebElement startdate;
	@FindBy(xpath="(//i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"])[1]") WebElement Enddate;
	@FindBy(xpath="(//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[2]") WebElement duration;

	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement applybutton;
	
	public OrangeHRMLeavePage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public void applyleave() throws InterruptedException {
		leave.click();
		Thread.sleep(3000);
		Select select1= new Select(list1);
		select1.selectByIndex(0);
		Select select2= new Select(startdate);
		select2.selectByVisibleText("2022-11-10");
		Select select3= new Select(Enddate);
		select3.selectByVisibleText("2022-11-12");
		Select select4= new Select(duration);
		select4.selectByVisibleText("Half Day - Morning");
		applybutton.click();
		
		
	}
}
