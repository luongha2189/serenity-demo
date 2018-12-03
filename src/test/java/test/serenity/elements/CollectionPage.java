package test.serenity.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CollectionPage extends PageObject {
	@FindBy(how = How.XPATH, using = "//a[contains(@data-name, 'products')]")
	public WebElementFacade menuProduct;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href, 'admin/collections')]")
	public WebElementFacade listCollection;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-title-bar__actions-group') or contains(@class,'ui-empty-state')]//a[contains(@href, '/admin/collections/create')]")
    public WebElementFacade btnAddCollection;
	
	@FindBy(xpath = "//div[contains(@class,'ui-context-bar')]//button[contains(.,'Lưu')]")
	public WebElementFacade btnSave;
}
