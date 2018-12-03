package test.serenity.stepDefinitions;

import test.serenity.steps.LoginSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	@Steps
	 LoginSteps loginSteps;
	
	@Given("^I open admin page$")
	public void i_open_admin_page() throws Exception {
		loginSteps.openLoginPage();
	}

	@When("^I login admin page$")
	public void i_login_admin_page() throws Exception {
		loginSteps.login();
	}

	@Then("^I check title after login$")
	public void i_check_title_after_login() throws Exception {	
		loginSteps.checkLoginSuccessfull();
	}
}
