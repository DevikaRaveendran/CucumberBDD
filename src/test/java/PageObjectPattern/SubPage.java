package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubPage {
	public WebDriver driver;
	public SubPage(WebDriver driver) {
		this.driver= driver;
	}
 private By facebookPage= By.xpath("//li[contains(@class,'facebook')]");
 private By sendMessage= By.xpath("//span[text()='Send Message'][1]");
 
 public void directToFacebook() {
	 driver.findElement(facebookPage).click();
 }
  public void sendMessageViaFacebook() {
	  driver.findElement(sendMessage).click();
  }
}
