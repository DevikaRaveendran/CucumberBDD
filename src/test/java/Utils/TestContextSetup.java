package Utils;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectPattern.FactoryDesignPattern;

public class TestContextSetup {
	public WebDriver driver;
	public FactoryDesignPattern factoryDesignPattern;
	public DriverManager driverManager;
	public GenericUtilities genericUtilities;

	public TestContextSetup() throws IOException {
		driverManager= new DriverManager();
		factoryDesignPattern = new FactoryDesignPattern(driverManager.webDriverManager());
		genericUtilities= new GenericUtilities(driverManager.webDriverManager());
		
	}
}
