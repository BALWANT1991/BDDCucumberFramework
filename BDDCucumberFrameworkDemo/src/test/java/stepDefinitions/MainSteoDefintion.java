package stepDefinitions;

import io.cucumber.java.en.*;

public class MainSteoDefintion {

	@Given("User is on Netbanking Landing Page")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("User is on Netbanking Landing Page");

	}

	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_and(String username, String password) {
		System.out.println("User login into application with "+"Username:-" + username + "Password:-" + password);

	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
	}

	@Then("Card are displayed")
	public void card_are_displayed() {
		System.out.println("Card are displayed");
	}
	
	@Given("Clear All Cache")
	public void clearCache() {
		System.out.println("Clear all Cache");
	}
	
	@Given("Launch the browser")
	public void launchBrowser() {
		System.out.println("Launch the browser");
	}


}
