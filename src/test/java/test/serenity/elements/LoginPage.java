package test.serenity.elements;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://hardlovebee211.bizwebvietnam.net/admin/")
public class LoginPage extends PageObject{
	@FindBy(xpath="//title")
	public static WebElementFacade titleLogin;
	
	@FindBy(xpath="//input[@id='Email']")
	public static WebElementFacade email;
	
	@FindBy(xpath="//input[@id='Password']")
	public static WebElementFacade password;
	
	@FindBy(xpath="//button[@title='Đăng nhập']")
	public static WebElementFacade loginBtn;
	
	
	//@WhenPageOpens
    public void waitUntilTitleAppears() {
    	System.out.println(titleLogin.getText());
    	
        element(titleLogin).waitUntilVisible();
    }
	
}
