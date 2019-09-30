package pmttestcases.stepdefinition;



import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Logincheck_POM;
import utility.Baseclass;

public class TC001_PMTlogincheck extends Baseclass {

	
	//ExtentTest loginfo=null;
	Logincheck_POM log;
	
	@Before()
	public void login_initialize() throws InterruptedException {
	
		//try {
			//extent=setup();
			//test = extent.createTest(Feature.class, "PMT Valid Login TestCases ");
			//test=test.createNode(Scenario.class, "Entering Valid Login Testcases");
			//loginfo=test.createNode(new GherkinKeyword("Given"),"Enter the url ");
			Baseclass.browserlaunch();
			Baseclass.logindetails();
			Thread.sleep(5000);
			//loginfo.pass("Browser Launched and Entered URL succesully");
			//loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		} /*catch (Exception e) {
			TestStep("Fail",driver,loginfo,e);
		}*/
		
	
	
	
	
	
	@Given("^enter the url$")
	public void enter_the_url() throws Throwable {
	    
		//System.out.println("url launced successfully");
	
		
	}

	@When("^User will enter the username,password and login$")
	public void user_will_enter_the_username_password_and_login() throws Throwable {
	 
		
		/*try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will enter the username,password and login ");
			log = new Logincheck_POM();
			

			 log.logindetails(pro.getProperty("username"), pro.getProperty("password"));
			 Thread.sleep(5000);
			 loginfo.pass("Username And Password Entered Successfully");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			 
			} catch ( Exception e) {
				//AssertionError |
				TestStep("Fail",driver,loginfo,e);
			}*/
		
	}

	@Then("^User will successfully login and dashboard page will be seen$")
	public void user_will_successfully_login_and_dashboard_page_will_be_seen() throws Throwable {
	    
		/*
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will successfully login and dashboard page will be seen ");
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.equals("APAPMT"))
			{
				System.out.println("Login Successfully");
				loginfo.pass("Successfully Landed on Dashboard Page");
			}else {
				System.out.println("Login Failed");
			}
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
		}catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
		}	*/	
		
		
	}

	
	
	
	
	@After
	public void quit_initialize() {
		Baseclass.teardown();
		//extent.flush();
	}
}


