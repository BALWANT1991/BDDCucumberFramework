package stepDefinitions;

import java.util.Iterator; 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import utils.TestBase;
import utils.TestContextSetup;

public class LandingPageStepDef {
	public WebDriver driver;
	public String Landingproductname;
	public String OfferProductName;
	TestContextSetup testContextsetup;
	public TestBase testBase;
	private LandingPage landingPage;
	
	public LandingPageStepDef(TestContextSetup testContextsetup){
		this.testContextsetup=testContextsetup;
		this.landingPage=testContextsetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on Greenkart Landing page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingPage.getTitleOfLandingPage().contains("GreenKart"));
	}

	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		landingPage.searchItems(shortname);
		testContextsetup.Landingproductname=landingPage.getProductName().split("-")[0].trim();
		System.out.println(testContextsetup.Landingproductname  + "is extracted from home page");
		Thread.sleep(2000);
	}
	
	@And("Added the {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product(String Qnty) throws InterruptedException
	{
		landingPage.incrementQuantity(Integer.parseInt(Qnty));
		landingPage.addToCart();
		Thread.sleep(2000);
	}
}
