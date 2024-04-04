package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/select_restaurant.feature",glue = {"stepDefinitions"},plugin = {"pretty", "html:target/cucumber-reports"})
public class TestRunner {
}
