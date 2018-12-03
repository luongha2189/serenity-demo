package test.serenity.steps;

import java.util.ArrayList;

import net.thucydides.core.annotations.Step;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

public class Global {
	
	@Step
	public void openNewTabWindow(String url, WebDriver driver){
		((JavascriptExecutor)driver).executeScript("window.open()");		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());   
		   driver.switchTo().window(tabs.get(tabs.size()-1)); 
		   driver.get(url);
	}
	
	@Step
	public void closeTabWindow(int index, WebDriver driver){
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		   try {
			   if(driver.switchTo().window(tabs.get(index)) != null) 
			   {
				   driver.close();
			   } 
		   }
		   catch(NoSuchWindowException e) {
			   e.printStackTrace();
		   }
	}
	
	@Step
	public void switchTabWindow(int tab_number, WebDriver driver){
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());   
		   try {
			   	driver.switchTo().window(tabs.get(tab_number));
			   }
		   catch(NoSuchWindowException e) {
		   e.printStackTrace();
		   }
	}	
	
}
