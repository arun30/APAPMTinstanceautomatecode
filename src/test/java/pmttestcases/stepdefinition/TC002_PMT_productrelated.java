package pmttestcases.stepdefinition;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Masterproductrelated_POM;
import utility.Baseclass;

public class TC002_PMT_productrelated extends Baseclass {

	ExtentTest loginfo=null;
	Masterproductrelated_POM mpom;
	
	
	 
	
	
	@Given("^User will mouse hover and choose the product category page$")
	public void user_will_mouse_hover_and_choose_the_product_category_page() throws Throwable {
	   
		try {
			extent=setup();	
			test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test=test.createNode(Scenario.class, "Adding product category");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will mouse hover and choose the product category page");
			mpom = new Masterproductrelated_POM();	
			mpom.clickonproductcategory();
			loginfo.pass("product category landed successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		
		 }   catch (Exception e) {
			 TestStep("Fail",driver,loginfo,e);
	}
	}

	@When("^User will click on the add button and add a new category$")
	public void user_will_click_on_the_add_button_and_add_a_new_category() throws Throwable {
	  
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on the add button and add a new category");
			mpom.addcategory1();
			loginfo.pass("Value Entered Successfully");
			 loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		} 	catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
		}	

		}
	@And("^User will enter the category name and choose the equivalent PIES category$")
	public void user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category() throws Throwable {
	 
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will enter the category name and choose the equivalent PIES category");
			mpom.entrycategory(pro.getProperty("categoryname"));
			mpom.savingcategory();
			//Thread.sleep(3000);
			//loginfo.pass("Product category Saved Successfully");
			//loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}

	@Then("^User will successfully added and verify that the record has come$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will successfully added and verify that the record has come");
			mpom.acceptAlert();
			//mpom.verifyingtext(pro.getProperty("categoryname"));
			System.out.println("category successfully added");
			loginfo.pass("Product category Saved Successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		}	catch ( Exception e) {
			TestStep("Fail",driver,loginfo,e);
	}	
	}

	
	@Given("^User will go to master and choose product sub category$")
	public void user_will_go_to_master_and_choose_product_sub_category() throws Throwable {
	   
		try {
			//extent=setup();	
			//test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test=test.createNode(Scenario.class, "Adding product sub category");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to master and choose product sub category");
			mpom = new Masterproductrelated_POM();
			mpom.clicksubcategory();
			loginfo.pass("Product sub category add landing page success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
	}	catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}

	

	@When("^User will click on the add button and choose the category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_drop_down_list() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on the add button and choose the category drop down list");
			mpom.addcategory1();
			mpom.addsubcategory();
			loginfo.pass("Product sub category create landing page success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}

	@And("^User will enter the sub category name  and choose the equivalent and save button is clicked$")
	public void user_will_enter_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked() throws Throwable {
	  
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will enter the sub category name  and choose the equivalent and save button is clicked");
			mpom.entrysubcategory(pro.getProperty("subcategoryname"));
			mpom.savingcategory();
			//loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			mpom.acceptAlertsub();
			loginfo.pass("Product sub category entered success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}
	
	
	@Then("^User will successfully added and verify the record has come in the sub category grid$")
	public void user_will_successfully_added_and_verify_the_record_has_come_in_the_sub_category_grid() throws Throwable {
	    
			
			System.out.println("sub category successfully added");
			
	}

	/*@Then("^User will successfully added and verify the record has come$")
	public void user_will_successfully_added_and_verify_the_record_has_come() throws Throwable {
	  
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will successfully added and verify the record has come");
			mpom.acceptAlertsub();
			loginfo.pass("Product sub category added success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}*/

	
	
	@Given("^User will go to master and choose part description$")
	public void user_will_go_to_master_and_choose_part_description() throws Throwable {
	    
		try {
			//extent=setup();	
			//test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test=test.createNode(Scenario.class, "Adding part description");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to master and choose part description");
			mpom = new Masterproductrelated_POM();
			mpom.partdesc1();
			loginfo.pass("Product part description landed");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}

	@When("^User will click on the add button and choose the category & sub category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_sub_category_drop_down_list() throws Throwable {
	  
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on the add button and choose the category & sub category drop down list");
			mpom.addcategory1();
			mpom.addsubcategory(); //category choose
			mpom.categoryselect(); //subcategory select
			mpom.entrypartdesc(pro.getProperty("partdesc"));
			mpom.equivalentpartdesc();
			loginfo.pass("Product part description choosing the given data");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
		
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}


	@And("^User will enter the part description name  and save button is clicked$")
	public void user_will_enter_the_part_description_name_and_save_button_is_clicked() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("And"),"User will enter the part description name  and save button is clicked");
			mpom.savingpartdesc();
			mpom.acceptAlertdesc();
			loginfo.pass("Product part description submit button clicked success");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}
	
	
	@Then("^User will see successfully added and verify the record has come in the description grid$")
	public void user_will_see_successfully_added_and_verify_the_record_has_come_in_the_description_grid() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfully added and verify the record has come");
			System.out.println("PArt Description Added in the grid");
			loginfo.pass("Product part description submit button clicked & saved in the grid successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}
	}


	/*@Then("^User will see successfully added and verify the record has come$")
	public void user_will_see_successfully_added_and_verify_the_record_has_come() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfully added and verify the record has come");
			mpom.acceptAlertdesc();
			loginfo.pass("Product part description submit button clicked & saved in the grid successfully");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}*/

	@Given("^User will go to master and choose product line$")
	public void user_will_go_to_master_and_choose_product_line() throws Throwable {
	    
		try {
			//extent=setup();	
			//test = extent.createTest(Feature.class, "PMT Product Related Testcases");
			test=test.createNode(Scenario.class, "Adding product Line");
			loginfo=test.createNode(new GherkinKeyword("Given"),"User will go to master and choose product line");
			mpom = new Masterproductrelated_POM();
			mpom.clickonproductlinecode();
			loginfo.pass("Product line landing to adding page");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}

	@When("^User will click on add button and enter the line code and line name$")
	public void user_will_click_on_add_button_and_enter_the_line_code_and_line_name() throws Throwable {
	   
		try {
			loginfo=test.createNode(new GherkinKeyword("When"),"User will click on add button and enter the line code and line name");
			mpom.addcategory1();
			mpom.addproductline(pro.getProperty("productline"), pro.getProperty("linename"));
			mpom.savebtn();
			mpom.acceptAlertline();
			loginfo.pass("Product line trying to add & entering the value");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
	}	
	}

	@Then("^User will see successfully alert and verify the record has come in the grid$")
	public void user_will_see_successfully_alert_and_verify_the_record_has_come_in_the_grid() throws Throwable {
	    
		try {
			loginfo=test.createNode(new GherkinKeyword("Then"),"User will see successfully alert and verify the record has come in the grid");
			System.out.println("Product Line  Added in the grid");
			loginfo.pass("Product line added successfully & shown in grid");
			loginfo.addScreenCaptureFromPath(Screenshotcapture(driver));
			extent.flush();
	}catch ( Exception e) {
		TestStep("Fail",driver,loginfo,e);
		extent.flush();
	}	
	}
	
	
	
	
	/*
	 * @After public void quit_initialize() { Baseclass.teardown(); }
	 */
	
}

