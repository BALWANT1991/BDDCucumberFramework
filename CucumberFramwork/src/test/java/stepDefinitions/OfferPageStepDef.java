package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDef {

	TestContextSetup testContextsetup;
	public String OfferProductName;
	public PageObjectManager pageObjectManager;
	//Singly Responsiblity Principle
	//Loosly coupled
	//Factory Design Pattern

	public OfferPageStepDef(TestContextSetup testContextsetup) {
		this.testContextsetup = testContextsetup;
	}

	@Then("^User searched for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {

		switchToOffersPage();
		Thread.sleep(5000);
		OffersPage ofrPage=new OffersPage(testContextsetup.driver);
		ofrPage.searchItems(shortname);
		Thread.sleep(5000);
		OfferProductName = ofrPage.getProductName();
		System.out.println(OfferProductName);
	}

	public void switchToOffersPage() {
		LandingPage landingPage=testContextsetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDeal();
		testContextsetup.genericUtils.switchWindowToChild();;
	}

	@Then("Validate product name in offers page matchs with landing page")
	public void validate_product_name_in_offers_page_matchs_with_landing_page() {
		Assert.assertEquals(OfferProductName, testContextsetup.Landingproductname);
		System.out.println("Validate Successfully");
	}
}
