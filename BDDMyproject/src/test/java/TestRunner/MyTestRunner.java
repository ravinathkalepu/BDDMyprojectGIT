package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ravi\\eclipse-workspace\\BDDMyproject\\src\\test\\java\\Features\\login.feature",
		//glue = "C:\\Users\\ravi\\eclipse-workspace\\BDDMyproject\\src\\test\\java\\Steps",
		format = {"pretty","html:target/Destination"}
		
		
)

public class MyTestRunner {

	
}
