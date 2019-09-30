package pmt.reports;




import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReport {

	
	public static ExtentHtmlReporter report=null;
	public static ExtentReports extent = null;
	public static ExtentTest test=null;
	
	
	public static ExtentReports setup() {
		String reportlocation = "./Reports/Extent_PMTReports.html";
		report = new ExtentHtmlReporter(reportlocation);
		report.config().setDocumentTitle("AUTOMATION TEST REPORT");
		report.config().setReportName("PMT BASIC FUNCTIONALITY TEST REPORT");
		report.config().setTheme(Theme.STANDARD);
		System.out.println("Extent Report Initialized");
		report.start();
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo(" Application", "PRODUCT MANAGEMENT TOOL");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("Username", System.getProperty("user.name"));
		System.out.println("Sytem Info in Extent Report");
		return extent;
		
	}
	
	public static void TestStep(String teststatus, WebDriver driver,ExtentTest extenttest, Throwable throwable) {
		switch(teststatus) {
		
		case "Fail":
			extenttest.fail(MarkupHelper.createLabel("Test Case is Failed: ", ExtentColor.RED));
			extenttest.error(throwable.fillInStackTrace());
			
			try {
				extenttest.addScreenCaptureFromPath(Screenshotcapture(driver));
			} catch (IOException e) {
				e.printStackTrace();
			}
			    if (driver!=null) {
			    	driver.quit();
			    		
			    }
			    break;
			    
		case "Pass":
			extenttest.pass(MarkupHelper.createLabel("Test Case is passed:  ", ExtentColor.GREEN));
			break;
			
			default:
				break;
		
		}
	}
	
	
	public static String Screenshotcapture(WebDriver driver) throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String desc = "F:\\Selenium test code\\pmt\\pmtincucumber\\Screenshot\\" + getcurrentdateandtime() + ".png";
		File target = new File(desc);
		FileUtils.copyFile(src, target);
		return desc;
	}
	
	private static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateformat.format(date);
			str = str.replace("", "").replaceAll("/", "").replaceAll(":","");
		} catch (Exception e) {
			
		}
		return str;
	}
	
	
}

