package test.serenity.steps;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.serenity.elements.CollectionPage;
import net.thucydides.core.annotations.Step;

public class CollectionSteps {
	CollectionPage collectionPage;
	
	@Step
	public void onPage()
	{
		collectionPage.listCollection.click();
	}
	
	@Step
	public void add()
	{
		collectionPage.btnAddCollection.click();
	}
}
