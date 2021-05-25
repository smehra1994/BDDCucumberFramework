package StepDifinitions;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/AppFeatures/AccountsPage.feature" }, 
				glue = { "StepDifinitions","AppHooks" }, 
				plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/", "rerun:target/failedtc.txt" }

)
public class FailedRun {

}
