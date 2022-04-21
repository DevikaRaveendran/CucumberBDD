package StepDefinitions;


import org.junit.Assert;

import PageObjectPattern.CheckoutPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutStepDefinition {
	TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;

	public CheckoutStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	@And("^Verifies the product name (.*) is displayed$")
	public void verifies_product_name_is_displayed(String item) throws InterruptedException {
		checkoutPage=testContextSetup.factoryDesignPattern.getCheckoutPage();
		String displayedProduct=checkoutPage.verifyProduct();
		Assert.assertEquals(item, displayedProduct);
	}
	@And("^Add the quantity (.*) of the required product and Add it to cart$")
	public void add_quantity_of_required_item(String quantity) {
		checkoutPage.selectQuantity(quantity);
		checkoutPage.addToCart();
	}
	@Then("^User enters (.*) and (.*) to log in to place order$")
	public void user_enters_abc_gmail_com_and_abcd_to_log_in_to_place_order(String username, String password) throws InterruptedException {
		checkoutPage.loginDetails(username, password);
	}

}
