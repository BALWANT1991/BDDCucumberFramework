package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	
	public CheckoutPage(WebDriver  driver) {
		this.driver=driver;
	}

	By cardBag= By.xpath("//img[@alt='Cart']");
	By checkOutButton= By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoButton = By.xpath("//button[contains(text(),'Apply')]");
	By placeOrder= By.xpath("//button[contains(text(),'Place Order')]");
	
	
	
	public void checkOutPageItems() {
		driver.findElement(cardBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public boolean verifyPromoButton() 
	{
		return driver.findElement(promoButton).isDisplayed();
	}
	
	public boolean verifyPlaceOrder() 
	{
		return driver.findElement(placeOrder).isDisplayed();
	}

}
