package pmttestcases.stepdefinition;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.AddintchagPartno_POM;
import utility.Baseclass;

public class TC012_AddIntchgPartno extends Baseclass {

	AddintchagPartno_POM ippom;
	
	
	
	@Given("^User will mouse over master and click Interchange Part#$")
	public void user_will_mouse_over_master_and_click_Interchange_Part() throws Throwable {
		try {
			ippom = new AddintchagPartno_POM();
			ippom.clickonInterchangePart();
		} catch (Exception e) {
			System.out.println(" Interchange Part# Button Not Clicked "+e.getMessage());
		}
	}

	@When("^User will click Add Button and Select Interchange name$")
	public void user_will_click_Add_Button_and_Select_Interchange_name() throws Throwable {
		try {
			ippom.clickAdd();
			
			ippom.EnterIntName(pro.getProperty("IntchgNameValue4DBox"));
		} catch (Exception e) {
			System.out.println(" Add button or Interchange Name Not Selected "+e.getMessage());
		}
	    
	}

	@When("^User will Enter the Interchange Part# and Select grade level$")
	public void user_will_Enter_the_Interchange_Part_and_Select_grade_level() throws Throwable {
		
		try {
			ippom.EnterIntchgpartValue(pro.getProperty("interchangepartno"));
			
			ippom.SelectGradeLevel(pro.getProperty("GradeLevelValue"));
			
		} catch (Exception e) {
			System.out.println(" Interchange Part# Not Entered or grade level Not Selected "+e.getMessage());
		}
	}

	@When("^User will select Type code and enter internal & interchange notes$")
	public void user_will_select_Type_code_and_enter_internal_interchange_notes() throws Throwable {
		try {
			ippom.SelectTypeCode(pro.getProperty("TypeCodeValue"));
			
			ippom.EnterInternalNotes(pro.getProperty("InternalNotesValue"));
			ippom.EnterInterchangeNotes(pro.getProperty("InterchangeNotesValue"));
		} catch (Exception e) {
			System.out.println(" Type code Not Selected or internal & interchange Not Entered "+e.getMessage());
		}
		
	    
	}

	@Then("^User will click save button and accept the alert$")
	public void user_will_click_save_button_and_accept_the_alert() throws Throwable {
		try {
			ippom.Clicksave();
			
			ippom.acceptAlert();
		} catch (Exception e) {
			System.out.println("Interchange Part# Not Added"+e.getMessage());
		}
	    
	}
	


}
