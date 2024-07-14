package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage landingPage;
	public OffersPage ofrPage;
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver  driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public OffersPage getOffersPage() {
		ofrPage=new OffersPage(driver);
		return 	ofrPage;
	}
	
	
	public CheckoutPage getcheckoutPage() {
		checkoutPage=new CheckoutPage(driver);
		return 	checkoutPage;
	}
	
	

}
