package stepDefinitions;

import com.codeborne.selenide.Configuration;
import context.ScenarioContext;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Hooks {

    @Before
    public void before(Scenario scenario) {
        // Configure browser to use
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;

        // initialize context to pass variables between scenario steps
        new ScenarioContext().init();
        ScenarioContext.put("scenario", scenario);

        System.out.println("------------------------------------------------------------");
        System.out.println(String.format("Starting scenario - %s", scenario.getName()));
        System.out.println("------------------------------------------------------------");
    }

    @After
    public void after(Scenario scenario) throws IOException {
        // add screenshot to report
        byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");

        System.out.println("------------------------------------------------------------");
        System.out.println(String.format("Finishing scenario - %s. Status - %s", scenario.getName(), scenario.getStatus()));
        System.out.println("------------------------------------------------------------");
    }
}
