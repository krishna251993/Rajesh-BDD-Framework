package runnerPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature"},
		glue= {"stepDefination"},
		tags= {"@Login"}
		
		)

public class RunnerClass {

}
