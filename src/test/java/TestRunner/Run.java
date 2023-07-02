package TestRunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features/LoginFeature.feature",".//Features/ForgotYourPassword.feature"},
		glue="StepDefinition",
		dryRun = false,
		monochrome = true,
		//tags ="@regression",
		plugin = {"pretty","html:Reports/cucumber-reports/report.html"}
		)
public class Run extends AbstractTestNGCucumberTests{
	//This class will empty
}