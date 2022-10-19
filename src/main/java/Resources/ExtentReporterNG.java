package Resources;

import java.io.FileInputStream;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	

	static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
	
		String path =System.getProperty("user.dir")+"//reports//index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\project_FrameWork\\reports\\index.html");
		
		//ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("project framework report");
		reporter.config().setDocumentTitle("Automation Execution Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Automation Engineer", "Ganesh Kalane");
		return extent;
		
	}
	   
	 
	 
}
