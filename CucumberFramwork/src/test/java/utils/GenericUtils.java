package utils;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchWindowToChild() {
		Set<String> s1 =driver.getWindowHandles();
		Iterator<String> itr1 = s1.iterator();
		String parentWindow = itr1.next();
		String childWindow = itr1.next();
		driver.switchTo().window(childWindow);
	}

}
