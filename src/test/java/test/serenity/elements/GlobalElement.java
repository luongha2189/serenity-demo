package test.serenity.elements;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class GlobalElement extends PageObject{
	
	@FindBy(how = How.XPATH, using = "//p[@class='ui-flash__message']")
	public WebElementFacade notification;
	
	public void verifyNoti(String noti)
	{
		waitFor(ExpectedConditions.visibilityOf(notification));
//		waitForTextToAppear(notification, noti);
//		System.out.println(notification.getText());
//		notification.shouldContainText(noti);
		
	}
	
}
