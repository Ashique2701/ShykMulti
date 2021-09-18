package TestRunne;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "stepDe",

		tags = { "@tea" })

public class TestRun extends AbstractTestNGCucumberTests {

}
