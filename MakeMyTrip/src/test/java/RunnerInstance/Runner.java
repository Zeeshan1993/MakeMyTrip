package RunnerInstance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\E004194\\eclipse-workspace\\MakeMyTrip\\src\\main\\java\\Feature\\SearchFlights.feature",
		glue="", plugin = { "pretty", "C:\\Users\\E004194\\eclipse-workspace\\MakeMyTrip\\target\\Output" }, dryRun=true, strict=false
		)
public class Runner {

}
