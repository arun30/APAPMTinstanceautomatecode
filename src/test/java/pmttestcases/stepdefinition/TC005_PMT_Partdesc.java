package pmttestcases.stepdefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Partdescription_POM;
import utility.Baseclass;

public class TC005_PMT_Partdesc extends Baseclass {

	
	Partdescription_POM partdesc;
	
	
	@Given("^User will go to parts page and search for the part#$")
	public void user_will_go_to_parts_page_and_search_for_the_part() throws Throwable {
	   
		
		partdesc = new Partdescription_POM();
		partdesc.partslanding();
		partdesc.partsearch(pro.getProperty("partnoenter"));
		
		
	}

	@When("^User will click on the part description and landed in description page$")
	public void user_will_click_on_the_part_description_and_landed_in_description_page() throws Throwable {
	   
		partdesc.descriptionclick();
		//partdesc.descdrop1();
		//partdesc.descriptiondrpdownnotes();
	}

	@And("^Choose the notes type dropdown, enter the notes and click on save button$")
	public void choose_the_notes_type_dropdown_enter_the_notes_and_click_on_save_button() throws Throwable {
	   
		partdesc.descriptiondrpdownnotes();
		partdesc.descriptionadd(pro.getProperty("descnotes"));
		partdesc.savebtn();
	}

	@Then("^User will see successfull alert and verify the record is shown in grid$")
	public void user_will_see_successfull_alert_and_verify_the_record_is_shown_in_grid() throws Throwable {
	    
		partdesc.acceptAlert();
	}

	@Given("^User will go to parts page and search for the part# to edit$")
	public void user_will_go_to_parts_page_and_search_for_the_part_to_edit() throws Throwable {
	    
		
		partdesc = new Partdescription_POM();
		partdesc.partslanding();
		partdesc.partsearch(pro.getProperty("partnoenter"));
	}

	@When("^User will click on part description frame and will edit the notes & saved$")
	public void user_will_click_on_part_description_frame_and_will_edit_the_notes_saved() throws Throwable {
	   
		partdesc.descriptionclick();
		partdesc.editpartdesc(pro.getProperty("editdescnotes"));
		partdesc.savebtn();
	}

	@Then("^User will see successfull alert and verify the record should be edited$")
	public void user_will_see_successfull_alert_and_verify_the_record_should_be_edited() throws Throwable {
	   
		partdesc.acceptAlert();
	}

	@Given("^User will go to parts page and search for the part# to delete$")
	public void user_will_go_to_parts_page_and_search_for_the_part_to_delete() throws Throwable {
	
		partdesc = new Partdescription_POM();
		partdesc.partslanding();
		partdesc.partsearch(pro.getProperty("partnoenter"));
	}

	@When("^User will click on part description frame and will delete the added or available record$")
	public void user_will_click_on_part_description_frame_and_will_delete_the_added_or_available_record() throws Throwable {
	    
		partdesc.descriptionclick();
		partdesc.deletepartdesc();
	}

	@Then("^User will see successfull alert and verify the record should be deleted$")
	public void user_will_see_successfull_alert_and_verify_the_record_should_be_deleted() throws Throwable {
	   
		partdesc.acceptAlert();
	}
	

}
