package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = {"src\\test\\resources"},// your features file path

        glue = {"steps_definitions","hooks"},// your steps definitions
       // dryRun = true   // mapping scenario with step definitions
       // tags = "@regression"
        plugin = {
                "pretty","html:report/execution.html"
        }

)

public class TestRunner {
}
