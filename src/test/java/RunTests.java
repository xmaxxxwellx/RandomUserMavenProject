import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
//        glue = "src/test/java/stepDefinitions",
        features = "src/test/resources")
public class RunTests {
}
