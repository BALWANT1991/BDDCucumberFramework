package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(value = Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",monochrome=true,dryRun=false,
                 tags="@placeOrderPage1 or @OffersPage1",plugin= {"html:target/cucumber.html","json:target/cucumber.json",
                	  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"})
public class JUnitTestRunnerTest {
	
}
