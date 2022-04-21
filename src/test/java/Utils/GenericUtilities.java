package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilities {
	public WebDriver driver;

	public GenericUtilities(WebDriver driver) {
		this.driver = driver;
	}

	public void switchWindow() throws InterruptedException {
		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> iterator = windowsid.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(10000);
	}

}
