package pmttestcases.stepdefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.AddIntchgName_POM;

import utility.Baseclass;

public class TC011_AddIntchgName extends Baseclass {

	AddIntchgName_POM ipom;
	
	
	
	@Given("^User will mouse over master and click Interchange Name$")
	public void user_will_mouse_over_master_and_click_Interchange_Name() throws Throwable {
		try {
			ipom = new AddIntchgName_POM();
			ipom.clickonInterchangeName();
		} catch (Exception e) {
			System.out.println(" Interchange Name Button Not Clicked "+e.getMessage());
		}
	    
	}

	@When("^User will click Add Button and Enter Interchange name$")
	public void user_will_click_Add_Button_and_Enter_Interchange_name() throws Throwable {
		try {
			ipom.clickAdd();
			
			ipom.EnterIntName(pro.getProperty("InterchangeNameValue"));
		} catch (Exception e) {
			System.out.println(" Add button or Interchange Name Not Entereded "+e.getMessage());
		}
	   
	}

	@When("^User will select checkbox Interchange Type Name and enter Brand AAIA Name$")
	public void user_will_select_checkbox_Interchange_Type_Name_and_enter_Brand_AAIA_Name() throws Throwable {
		try {
			ipom.clickIntTypeName();
			
			ipom.EnterBrandAAIA(pro.getProperty("BrandAAIAvalue"));
		} catch (Exception e) {
			System.out.println(" checkbox Interchange Type Not Selected or Brand AAIA Name Not Entered "+e.getMessage());
		}
	    
	}

	@Then("^User will click save and accept the alert$")
	public void user_will_click_save_and_accept_the_alert() throws Throwable {
		try {
			ipom.Clicksave();
			
			ipom.acceptAlert();
		} catch (Exception e) {
			System.out.println("Interchange Name Not Added"+e.getMessage());
		}
		
	    
	}
	

}



