package pmttestcases.stepdefinition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Buyersguide_POM;
import utility.Baseclass;


public class TC007_PMT_Buyersguide extends Baseclass {

	
	Buyersguide_POM bguide;
	

	
	@Given("^User will go to parts page and search for a part# and will tie-up the application$")
	public void user_will_go_to_parts_page_and_search_for_a_part_and_will_tie_up_the_application() throws Throwable {
	    
		bguide = new Buyersguide_POM();
		bguide.partslanding();
		bguide.partsearch(pro.getProperty("partnoenter"));
	}

	@When("^User will click on buyersguide frame and choose the vehicle, make, model & search$")
	public void user_will_click_on_buyersguide_frame_and_choose_the_vehicle_make_model_search() throws Throwable {
	    
		bguide.buyerguideclick();
		bguide.apppartsvehicldropdown();
		bguide.apppartsmakedropdown();
		bguide.apppartsmodeldropdown();
		bguide.apppartsearch();
	}

	@And("^User will choose an enginebase and click on save$")
	public void user_will_choose_an_enginebase_and_click_on_save() throws Throwable {
	    
		bguide.apppartsenginebase();
		bguide.savebtn();
	}

	@Then("^User will see successfull alert and verify the reocrd has shown in the below grid$")
	public void user_will_see_successfull_alert_and_verify_the_reocrd_has_shown_in_the_below_grid() throws Throwable {
	   
		bguide.acceptAlert();
	}

	@Given("^User will go to parts page and search for a part# will edit notes$")
	public void user_will_go_to_parts_page_and_search_for_a_part_will_edit_notes() throws Throwable {
	  
		bguide = new Buyersguide_POM();
		bguide.partslanding();
		bguide.partsearch(pro.getProperty("partnoenter"));
	}

	@When("^User will click on buyers guide frame, show grid will be seen along with application & edit an application$")
	public void user_will_click_on_buyers_guide_frame_show_grid_will_be_seen_along_with_application_edit_an_application() throws Throwable {
	    
		bguide.buyerguideclick();
		bguide.editappparts();
		
	}

	@And("^User will enter notes in notes textbox and click on save$")
	public void user_will_enter_notes_in_notes_textbox_and_click_on_save() throws Throwable {
	    
		bguide.apppartsnote(pro.getProperty("apppartnotes"));
		bguide.updatebtn();
		
	}

	@Then("^User will see succesfull alert and verify the notes added$")
	public void user_will_see_succesfull_alert_and_verify_the_notes_added() throws Throwable {
	    
		bguide.acceptAlert();
	}

	@Given("^User will go to parts page and search for a part# to delete the application$")
	public void user_will_go_to_parts_page_and_search_for_a_part_to_delete_the_application() throws Throwable {
	  
		bguide = new Buyersguide_POM();
		bguide.partslanding();
		bguide.partsearch(pro.getProperty("partnoenter"));
	}

	@When("^User will click on buyers guide frame, choose the application and click on delete$")
	public void user_will_click_on_buyers_guide_frame_choose_the_application_and_click_on_delete() throws Throwable {
	    
		bguide.buyerguideclick();
		bguide.deletebuyerappln();
	}

	@Then("^User will see succesfull alert and verify the application is deleted from the show grid$")
	public void user_will_see_succesfull_alert_and_verify_the_application_is_deleted_from_the_show_grid() throws Throwable {
	   
		bguide.acceptAlert1();
	}
	
	
}
