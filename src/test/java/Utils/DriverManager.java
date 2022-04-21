package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	public WebDriver driver;

	public WebDriver webDriverManager() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\Resouces\\GlobalVariables.properties");
		Properties property = new Properties();
		property.load(file);
		String url = property.getProperty("QAUrl");
		String browser_properties=property.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		//Java ternary Operator: result=test condition? value1:value2,if test condition is true,result=value1,else result is value2
		String browser=browser_maven!=null?browser_maven:browser_properties;
		
		
		if (driver == (null)) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\Resouces\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gekco.driver", System.getProperty("user.dir") + "\\src\\test\\Resouces\\firefoxdriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
		}
		return driver;

	}

}
