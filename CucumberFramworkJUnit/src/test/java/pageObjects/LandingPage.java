package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver  driver) {
		this.driver=driver;
	}

	By search= By.xpath("//input[@type='search']");
	By productName= By.xpath("//h4[normalize-space()='Tomato - 1 Kg']");
	By topDeals= By.linkText("Top Deals");
	By increment= By.cssSelector("a.increment");	
	By addToCartButton= By.cssSelector(".product-action button");
	
	public void searchItems(String Name) {
		driver.findElement(search).sendKeys(Name);
	}
	
	public void getSearchItems(String Name) {
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDeal() {
		driver.findElement(topDeals).click();
	}
	
	public String getTitleOfLandingPage() {
		return driver.getTitle();
	}
	
	public void incrementQuantity(int qnty) {
		int i = qnty-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addToCart() {
	driver.findElement(addToCartButton).click();
	}
	
}
