package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	public WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	private By search = By.xpath("//input[contains(@id,'auto-search')]");
	private By searchIcon = By.xpath("//button[@class='search-clear']/following-sibling::button");
	private By product = By.xpath("//h3[contains(@id,'productName')]/a");

	public String getTitleOfPage() {
		String title= driver.getTitle().split("-")[0].trim();
		return title;
	}
	public void searchItem(String item) {
		driver.findElement(search).sendKeys(item);
		driver.findElement(searchIcon).click();
	}

	public String getProduct() {
		return driver.findElement(product).getText();
	}
}
