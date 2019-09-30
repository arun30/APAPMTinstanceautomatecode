package pmttestcases.stepdefinition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.PartsAdd_POM;

import utility.Baseclass;

public class TC004_PMT_PartsAdd extends Baseclass {


	PartsAdd_POM parts;
	

	
	@Given("^User will click on parts page and it will redirect to parts page$")
	public void user_will_click_on_parts_page_and_it_will_redirect_to_parts_page() throws Throwable {
	  
		parts = new PartsAdd_POM();
		parts.partslandingpage();
		
	}

	@When("^User will click on the add buton and choose product category, sub category,part desc, product line$")
	public void user_will_click_on_the_add_buton_and_choose_product_category_sub_category_part_desc_product_line() throws Throwable {
	   
		parts.partsadd();
		parts.partsadddrp2();
		parts.partsadddrp3();
		parts.partsadddrp4();
	}

	@And("^User will enter the part# and click on save$")
	public void user_will_enter_the_part_and_click_on_save() throws Throwable {
	   
		parts.savenewpart(pro.getProperty("partno"));
		
	}

	@Then("^User will see successfull alert and verify the part# thorugh part# search$")
	public void user_will_see_successfull_alert_and_verify_the_part_thorugh_part_search() throws Throwable {
	   
		parts.acceptAlert();
	}

	@Given("^User will click on parts page and it will redirect to parts page for part# search through dropdown$")
	public void user_will_click_on_parts_page_and_it_will_redirect_to_parts_page_for_part_search_through_dropdown() throws Throwable {
	    
		parts = new PartsAdd_POM();
		parts.partslandingpage2();
		
	}

	@When("^User will choose the category, sub category, part description, product line and part# dropdown & search$")
	public void user_will_choose_the_category_sub_category_part_description_product_line_and_part_dropdown_search() throws Throwable {
	   
		parts.dropdownfiltercategory();
		//parts.dropdownfiltersubcategory();
		//parts.dropdownfilterpartdesc();
		//parts.dropdownfilterprdtln();
		//parts.dropdownfilterpartno();
		parts.filetrpartno();
		
	}

	@Then("^User will see the search part#$")
	public void user_will_see_the_search_part() throws Throwable {
	   
		System.out.println("Search part# successfull");
	}

	

	
}

