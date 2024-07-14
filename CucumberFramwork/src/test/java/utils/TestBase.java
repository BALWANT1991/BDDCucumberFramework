package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebdriverManager() throws IOException 
	{
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+ "//src//test//resources//global.properties");
		Properties prob=new Properties();
		prob.load(fis);
		String QAUrl = prob.getProperty("URL");
		String browser_properties = prob.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		//result =testCondtion? value1:Value2
		String browser = browser_maven!=null ? browser_maven:browser_properties;
		
		if(driver==null) 
		{
			if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "//src//test//resources//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(QAUrl);
		}
		return driver;
	}
	

}
