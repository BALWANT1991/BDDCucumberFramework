package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {

	public WebDriver driver;
	By search= By.xpath("//input[@type='search']");
	By productName= By.cssSelector("tr td:nth-child(1)");


	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchItems(String Name) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(search).sendKeys(Name);
	}
	
	public void getSearchItems() {
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}

}
