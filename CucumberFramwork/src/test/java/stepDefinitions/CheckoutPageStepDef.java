package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestBase;
import utils.TestContextSetup;

public class CheckoutPageStepDef {
	public WebDriver driver;
	public String Landingproductname;
	public String OfferProductName;
	TestContextSetup testContextsetup;
	public TestBase testBase;
	public CheckoutPage checkoutPage;

	public CheckoutPageStepDef(TestContextSetup testContextsetup) {
		this.testContextsetup = testContextsetup;
		this.checkoutPage = testContextsetup.pageObjectManager.getcheckoutPage();
	}

	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate(String name) throws InterruptedException {
		Thread.sleep(2000);
		checkoutPage.checkOutPageItems();
	}

	@Then("Verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code() throws InterruptedException {
		Assert.assertTrue(checkoutPage.verifyPromoButton());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
		Thread.sleep(2000);
	}

}
