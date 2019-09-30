package testrunner;

//"classpath:PMTlogincheck.feature",


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Featurefiles",
		//features = "Featurefiles_parts",
		glue = "pmttestcases.stepdefinition",
		dryRun = false,
		monochrome = true,
		format = {"pretty", "html: test-output", "json:json_output/cucumbeer.json"},
			//	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
				//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		strict = false,
				//tags = {"~@Parts","~@partdesc","@interchange"}
				tags = {"@productrelated","~@partdesc","~@applicationTest","~@applicationTest1","~@interchange","~@Buyersguide"}
		
		
		)

public class Testrunner_PMT {

}
