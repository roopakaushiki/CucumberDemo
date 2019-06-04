package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinition {
	
	@Before
	public void setUp() {
		System.out.println("Launch Chrome browser");
		System.out.println("Enter URL of application");
		
	}
	@After
	public void tearDown() {
		System.out.println("Close the browser");
		
	}
	
	@Given("^user is on add customer page$")
	public void user_is_on_add_customer_page() throws Throwable {
		System.out.println("User is on add cust page");
	 
	}

	@When("^user fills customer details$")
	public void user_fills_customer_details() throws Throwable {
		System.out.println("User fills the cutomer details");
	 
	}

	@Then("^customer is added$")
	public void customer_is_added() throws Throwable {
		System.out.println("User adds custmer");
	   
	}

	@Given("^user is on edit customer page$")
	public void user_is_on_edit_customer_page() throws Throwable {
		System.out.println("User is on edit page");
	   
	}

	@When("^user edits contact details$")
	public void user_edits_contact_details() throws Throwable {
		System.out.println("User edits the contact details");
	   
	}

	@Then("^customer details updated$")
	public void customer_details_updated() throws Throwable {
		System.out.println("User fills the cutomer details");
	    
	}

	@Given("^user is on delete customer page$")
	public void user_is_on_delete_customer_page() throws Throwable {
		System.out.println("User is on the customer page");
	   
	}

	@When("^user delets the customer$")
	public void user_delets_the_customer() throws Throwable {
		System.out.println("User deletes  the cust ");
	   
	}

	@Then("^customer is deleted$")
	public void customer_is_deleted() throws Throwable {
		System.out.println("User delets the customer");
	   
	}



}
