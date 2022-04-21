package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	public WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}

	By productName=By.xpath("//h3[contains(@id,'productName')]");
	By displayedProduct=By.cssSelector("h1.product-name");
	By quantitySelect= By.cssSelector("select#myQantitySelect");
	By addToCart= By.xpath("//button[@id='addToCartButton']");
	By useremail= By.xpath("//input[@id='emailAddress']");
	By userpassword= By.xpath("//input[@id='emailAddress']/following::input[contains(@id,'password')]");
	By rememeberMeCheckbox = By.xpath("//label[@for='exampleCheck1']");
	By login= By.xpath("//button[contains(text(),'LOGIN')]");
	
	public String verifyProduct() throws InterruptedException {
		driver.findElement(productName).click();
		Thread.sleep(2000);
		String product =driver.findElement(displayedProduct).getText().split(" ")[0];
		System.out.println(product);
		return product;
	}
	 public void selectQuantity(String quantity) {
		 WebElement staticDropdown =driver.findElement(quantitySelect);
		 Select dropdown= new Select(staticDropdown);
		 dropdown.selectByValue(quantity);
	 }
	 
	 public void addToCart() {
		 driver.findElement(addToCart).click();
	 }
	 
	 public void loginDetails(String username, String password) throws InterruptedException {
		 Thread.sleep(2000);
		 driver.findElement(useremail).sendKeys(username);
		 driver.findElement(userpassword).sendKeys(password);
		 driver.findElement(rememeberMeCheckbox).click();
		 driver.findElement(login).click();
		 
	 }
	
}
