package pmttestcases.stepdefinition;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Interchange_POM;
import utility.Baseclass;


public class TC006_PMT_Partinterchange extends Baseclass {

	
	Interchange_POM inter;
	

	
	@Given("^User will go to parts page and search for a part#$")
	public void user_will_go_to_parts_page_and_search_for_a_part() throws Throwable {
	    
		inter = new Interchange_POM();
		inter.partslanding();
		inter.partsearch(pro.getProperty("partnoenter"));
		
	}

	@When("^User will click on the interchange frame, choose interchange name dropdown, enter interchange part# and click save$")
	public void user_will_click_on_the_interchange_frame_choose_interchange_name_dropdown_enter_interchange_part_and_click_save() throws Throwable {
	   
		inter.interchangesclick();
		inter.interchangedrpdownnotes();
		inter.interchangenoteenter(pro.getProperty("interchangepartno"));
		inter.savebtn();
	}

	@Then("^User will see successfull alert and verify the record to be shown in the grid below$")
	public void user_will_see_successfull_alert_and_verify_the_record_to_be_shown_in_the_grid_below() throws Throwable {
	    
		inter.acceptAlert();
	}

	@Given("^User will go to parts page and search for the part# to edit data$")
	public void user_will_go_to_parts_page_and_search_for_the_part_to_edit_data() throws Throwable {
	    
		inter = new Interchange_POM();
		inter.partslanding();
		inter.partsearch(pro.getProperty("partnoenter"));
	}

	@When("^User will click on interchange frame and will edit the notes & saved$")
	public void user_will_click_on_interchange_frame_and_will_edit_the_notes_saved() throws Throwable {
	    
		inter.interchangesclick();
		inter.editinterchange(pro.getProperty("interditpart"),pro.getProperty("editinternotes"));
		inter.savebtn();
		
	}

	@Then("^User will see successfull alert and verify the record should be edited successfully$")
	public void user_will_see_successfull_alert_and_verify_the_record_should_be_edited_successfully() throws Throwable {
	   
		inter.acceptAlert();
	}

	@Given("^User will go to parts page and search for a part# to delete that data$")
	public void user_will_go_to_parts_page_and_search_for_a_part_to_delete_that_data() throws Throwable {
	    
		inter = new Interchange_POM();
		inter.partslanding();
		inter.partsearch(pro.getProperty("partnoenter"));
	}

	@When("^User will click on interchange frame and will delete the added or available record$")
	public void user_will_click_on_interchange_frame_and_will_delete_the_added_or_available_record() throws Throwable {
	    
		inter.interchangesclick();
		inter.deletepartinter();
	}

	@Then("^User will see successfull alert and verify the record has been deleted or not$")
	public void user_will_see_successfull_alert_and_verify_the_record_has_been_deleted_or_not() throws Throwable {
	 
		inter.acceptAlert();
	}

	
	

}

