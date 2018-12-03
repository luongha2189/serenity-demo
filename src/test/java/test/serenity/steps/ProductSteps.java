package test.serenity.steps;

import net.thucydides.core.annotations.Step;
import test.serenity.elements.GlobalElement;
import test.serenity.elements.ProductPage;

public class ProductSteps {
	public ProductPage productPage;
	public GlobalElement global;
	
	@Step
	public void clickMenuProduct()
	{
		productPage.menuProduct.click();
	}
	
	@Step
	public void onListProduct()
	{
		productPage.listProduct.click();
	}
	
	@Step
	public void onFirstProduct()
	{
		productPage.firtListProduct.click();
	}
	
	@Step
	public void changeFieldProduct(String name)
	{
		System.out.println("1a");
		productPage.sendkey(name);
	}
	
	@Step
	public void clickSaveProduct() throws Exception
	{
		productPage.btnSave.click();
	}	
	
	@Step
	public void notificationSuccessfullyAddProduct(String noti) throws Exception
	{		
		global.verifyNoti(noti);		
	}
	
	@Step
	public void clickAddProduct()
	{
		//productPage.addProduct.waitUntilEnabled();
		productPage.addProduct.click();
	}
	
	@Step
	public void viewPage()
	{
		productPage.viewPage.click();
	}
}
