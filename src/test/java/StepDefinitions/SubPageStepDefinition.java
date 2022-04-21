package StepDefinitions;

import PageObjectPattern.SubPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class SubPageStepDefinition {
	TestContextSetup testContextSetup;
	SubPage subPage;

	public SubPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		subPage= testContextSetup.factoryDesignPattern.getSubPage();
	}

	@Then("User go and checks lulu hypermarket kerala facebook page and send message")
	public void user_go_and_check_the_facebook_page() throws InterruptedException {
		subPage.directToFacebook();
		testContextSetup.genericUtilities.switchWindow();
		subPage.sendMessageViaFacebook();
	}

}
