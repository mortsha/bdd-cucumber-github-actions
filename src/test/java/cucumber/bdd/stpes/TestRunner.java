package cucumber.bdd.stpes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // path to your .feature files
        glue = {"cucumber.bdd.stpesdef"},                // package where step definitions are
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",  // HTML report
                "json:target/cucumber-reports/cucumber.json",  // JSON report (optional)
                "junit:target/cucumber-reports/cucumber.xml"   // JUnit report (optional)
        },
        monochrome = true,
        dryRun = false,
        tags = "@Login"
)
public class TestRunner {
}
