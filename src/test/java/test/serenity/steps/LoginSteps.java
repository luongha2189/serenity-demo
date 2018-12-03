package test.serenity.steps;

import org.junit.Assert;

import test.serenity.elements.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	LoginPage loginPage;
	
	@Step
	public void openLoginPage() {
		loginPage.open();
	}
	
	@Step
	public void login() {
		loginPage.email.sendKeys("haltb@sapo.vn");
		loginPage.password.sendKeys("123456");	
		loginPage.loginBtn.click();
	}
	
	@Step
	public void checkLoginSuccessfull() {
		System.out.println(loginPage.titleLogin.getText());
		Assert.assertEquals(loginPage.titleLogin, "Trang chủ");
		
	}
}
