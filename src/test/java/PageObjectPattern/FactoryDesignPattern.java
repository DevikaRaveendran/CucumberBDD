package PageObjectPattern;

import org.openqa.selenium.WebDriver;

public class FactoryDesignPattern {
	public WebDriver driver;
	public MainPage mainPage;
	public SubPage subPage;
	public CheckoutPage checkoutPage;

	public FactoryDesignPattern(WebDriver driver) {
		this.driver = driver;
	}

	public MainPage getMainPage() {
		mainPage = new MainPage(driver);
		return mainPage;
	}

	public SubPage getSubPage() {
		subPage = new SubPage(driver);
		return subPage;
	}

	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
}
