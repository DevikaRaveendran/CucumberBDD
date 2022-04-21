package StepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import PageObjectPattern.MainPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainPageStepDefinition {
	
	TestContextSetup testContextSetup;
	public MainPage mainPage;

	public MainPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.mainPage=testContextSetup.factoryDesignPattern.getMainPage();
	}
	@Given("User is on lulu hypermarket landing page")
	public void user_is_on_lulu_hypermarket_landing_page() throws IOException {
//		testContextSetup.driverManager.webDriverManager();
		Assert.assertTrue(mainPage.getTitleOfPage().contains("LuLu Hypermarket India"));
	}

	@When("^User searches the required item (.*)$")
	public void user_select_the_product_category_and_searches_the_required_item(String item) {
		mainPage.searchItem(item);
		String product=mainPage.getProduct();
		System.out.println(product);
	}

}
