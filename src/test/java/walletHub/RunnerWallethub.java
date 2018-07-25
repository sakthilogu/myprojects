package walletHub;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

features = "src/test/resources/wallethublogin/features/wallethublogin.feature",

plugin = { "pretty", "html:target/wallethubReports" })
public class RunnerWallethub {

	}
