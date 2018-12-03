package runTest;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
				 features = { "src/test/resources/features" },
				 glue = { "test.serenity.stepDefinitions" }
)
public class RunTest  {
	/*@Managed(uniqueSession = true)
    public WebDriver web;*/
	
}
