package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "step_definition",
        features = "src/test/resources/features/",
        plugin = { "junit:target/test-artifacts/Login.xml",
                "json:target/test-artifacts/Login.json" }
)
public class LoginTest {
}