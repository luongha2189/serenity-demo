package test.serenity.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.serenity.steps.CollectionSteps;
import net.thucydides.core.annotations.Steps;

public class CollectionStepefinitions {
	@Steps
	CollectionSteps collectionSteps;
	
	@Given("^I on collection page$")
	public void i_on_collection_page() throws Exception {
		collectionSteps.onPage();
	}
	
	@When("^I add collection$")
	public void i_add_collection() throws Exception {
		collectionSteps.add();
	}
	
	@Then("^I save collection$")
	public void i_save_collection() throws Exception {
	}
}
