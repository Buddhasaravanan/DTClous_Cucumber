package stepDefinitions;

import Pages.CO_Page;
import factory.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeOrder_Steps 
{
	
	CO_Page cop = new CO_Page(Base.getdriver());
	
	@When("user navigate change order")
	public void user_navigate_change_order() throws InterruptedException 
	{
	    cop.changeorder();
	}

	@When("user click new change order button")
	public void user_click_new_change_order_button() 
	{
	   cop.createnewchangeorder();
	}

	@When("user select external co and giving a name")
	public void user_select_external_co_and_giving_a_name() 
	{
	    
	}

	@When("user click create and open change order")
	public void user_click_create_and_open_change_order() 
	{
	    
	}

	@Then("Validate new CO created")
	public void validate_new_co_created() 
	{
	   
	}

	@When("user go to new co and select design section")
	public void user_go_to_new_co_and_select_design_section() 
	{
	   
	}

	@When("user remove original item with keep accessory")
	public void user_remove_original_item_with_keep_accessory() 
	{
	    
	}

	@Then("Validate item removed and keep accessory")
	public void validate_item_removed_and_keep_accessory() 
	{
	    
	}

	@When("user remove original item keep labor")
	public void user_remove_original_item_keep_labor() 
	{
	    
	}

	@Then("Validate keep labor")
	public void validate_keep_labor() 
	{
	    
	}

	@When("user add item to change order")
	public void user_add_item_to_change_order() 
	{
	    
	}

	@Then("Validate add item to CO")
	public void validate_add_item_to_co() 
	{
	    
	}

	@When("user copy item to all location")
	public void user_copy_item_to_all_location() 
	{
	    
	}

	@Then("Validate copy item")
	public void validate_copy_item() 
	{
	    
	}

	@When("user replace the item")
	public void user_replace_the_item() 
	{
	  
	}

	@Then("Validate replace item")
	public void validate_replace_item() 
	{
	   
	}

	@When("user create proposal")
	public void user_create_proposal() 
	{
	    
	}

	@Then("Validate proposal created")
	public void validate_proposal_created() 
	{
	    
	}

	@When("user accept the change order")
	public void user_accept_the_change_order() 
	{
	    
	}

	@Then("Validate accepted CO")
	public void validate_accepted_co() 
	{
	    
	}

	@When("user back to CO dashboard")
	public void user_back_to_co_dashboard() 
	{
	   
	}

	@When("user select internal co and giving a name")
	public void user_select_internal_co_and_giving_a_name() 
	{
	    
	}

	@Then("Validate new internal CO created")
	public void validate_new_internal_co_created() 
	{
	    
	}

	@Then("user add item")
	public void user_add_item() 
	{
	    
	}

	@Then("Validate item added to CO")
	public void validate_item_added_to_co() 
	{
	   
	}

	@When("user approve the internal CO")
	public void user_approve_the_internal_co() 
	{
	    
	}
	
	
	
}
