package test.serenity.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.serenity.steps.Global;
import test.serenity.steps.ProductSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class ProductStepDefinitions {
	/*@Managed                                                                
    WebDriver driver;
	public WebDriverWait wait = new WebDriverWait (driver, 20);*/
	
	@Steps
	public ProductSteps productSteps;
	
	@Steps
	public Global global;

	@Given("^I click menu product$")
	public void i_click_menu_product() throws Exception {
		productSteps.clickMenuProduct();
	}
	
	@Given("^I on list product$")
	public void i_on_list_page() throws Exception {
		productSteps.onListProduct();
	}
	
	@When("^I click button add product")
	public void I_click_button_add_product() throws Exception {
		productSteps.clickAddProduct();
	}
	
	@When("^I sendkey name product \"([^\"]*)\"$")
	public void i_sendkey_name_product(String name) throws Exception {
		productSteps.changeFieldProduct(name);
	}
	
	@Then("^I save product$")
	public void i_save_product() throws Exception {
		productSteps.clickSaveProduct();
	}
	
	@Then("^I verify success add product \"([^\"]*)\"$")
	public void i_save_product(String noti) throws Exception {
		productSteps.notificationSuccessfullyAddProduct(noti);
	}
	
	@Then("^I on first product")
	public void i_on_first_product(String name) throws Exception {
		productSteps.onFirstProduct();
	}
	
	@When("^I click view page$")
	public void i_click_view_page() throws Exception {
		productSteps.viewPage();
	}

	/*@Then("^I close tab$")
	public void i_close_tab() throws Exception {
		global.closeTabWindow(1, driver);
		global.switchTabWindow(0, driver);
	}*/
}
