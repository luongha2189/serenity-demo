package test.serenity.elements;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends PageObject{
	
	@FindBy(xpath = "//a[contains(@data-name, 'products')]")
	public WebElementFacade menuProduct;
	
	@FindBy(xpath = "//a[contains(@href, 'admin/products')]")
	public WebElementFacade listProduct;
	
	@FindBy(xpath = "//div[contains(@class,'ui-title-bar__actions-group') or contains(@class,'ui-empty-state')]//a[contains(@href, '/admin/products/create')]")
	public WebElementFacade addProduct;
	
	@FindBy(how = How.NAME, using = "product[name]")
	public static WebElementFacade name;
	
	@FindBy(xpath = "//div[contains(@class,'ui-context-bar')]//button[contains(.,'Lưu')]")
	public WebElementFacade btnSave;
	
	@FindBy(xpath = "//div[@class='action-bar__top-links']//a[contains(.,'Xem trên web')]")
	public static WebElementFacade viewPage;
	
	@FindBy(how = How.XPATH, using = "//table[@id='price-rule-table']//tbody//tr[1]//td[@class='name']//a")
	public WebElementFacade firtListProduct;
	
	public void sendkey(String nameP) {
		name.click();
		name.sendKeys(nameP);
	}
	
}
