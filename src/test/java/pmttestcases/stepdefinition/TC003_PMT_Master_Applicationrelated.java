package pmttestcases.stepdefinition;



import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Applicationrelated_vehicle_make_model;
import utility.Baseclass;

public class TC003_PMT_Master_Applicationrelated extends Baseclass{

	//Pageobjectclass pom;
	Applicationrelated_vehicle_make_model master;
	//ExtentTest loginfo=null;
	
	
	
	@Given("^User will mouse hover on Master and choose the vehicle type page$")
	public void user_will_mouse_hover_on_Master_and_choose_the_vehicle_type_page() throws Throwable {
	  
		master = new Applicationrelated_vehicle_make_model();
		master.clickonvehicletype();
	}

	@When("^User will click on the add button and will enter the new vehicle type and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_enter_the_new_vehicle_type_and_choose_the_equivalent_ACES_save() throws Throwable {
	
		master.vehicletypename(pro.getProperty("vehicletypename"));
	}

	/*@Then("^User will successfully added and verify the added record should be shown in grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_vehicle_grid() throws Throwable {
	   
		master.acceptAlert();
		
	}*/
	
	@Then("^User will successfully added and verify the added record should be shown in vehicle grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_vehicle_grid() throws Throwable {
	    
		master.acceptAlert();
	}
	

	@Given("^User will mouse hover on master and choose the make$")
	public void user_will_mouse_hover_on_master_and_choose_the_make() throws Throwable {
	   
		master = new Applicationrelated_vehicle_make_model();
		master.clickonmake();
	}

	@When("^User will click on the add button and will choose the added vehicle type, enter the new make name and choose the equivalent ACES & save$")
	public void user_will_click_on_the_add_button_and_will_choose_the_added_vehicle_type_enter_the_new_make_name_and_choose_the_equivalent_ACES_save() throws Throwable {
	
		master.addmakename();
		master.newmakename(pro.getProperty("makename"));
		
	}

	/*@Then("^User will successfully added and verify the added record should be shown in grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_make_grid() throws Throwable {
		
		master.acceptAlertformake();
	} */   

	@Then("^User will successfully added and verify the added record should be shown in make grid$")
	public void user_will_successfully_added_and_verify_the_added_record_should_be_shown_in_make_grid() throws Throwable {
	   
		master.acceptAlertformake();
	}

	
	
	@Given("^User will mouse hover on master and choose the model$")
	public void user_will_mouse_hover_on_master_and_choose_the_model() throws Throwable {
		
		master = new Applicationrelated_vehicle_make_model();
		master.clickonmodel();
	}    

	@When("^User will mouse hover on master and choose the model,click on the add button and will choose the added vehicle type, make & enter the new model name and choose the equivalent ACES & save$")
	public void user_will_mouse_hover_on_master_and_choose_the_model_click_on_the_add_button_and_will_choose_the_added_vehicle_type_make_enter_the_new_model_name_and_choose_the_equivalent_ACES_save() throws Throwable {
	    
		master.addmodelname();
		master.addmodeldrp2();
		master.modelnameadd(pro.getProperty("modelname"));
	}

	@Then("^User will successfully added and verify that the record has come\\.$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {
	    
		master.acceptAlertformodel();

}
	
	
}

