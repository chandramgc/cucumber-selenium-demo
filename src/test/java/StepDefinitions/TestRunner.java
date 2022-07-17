package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports/report.html",
                "json:target/JsonReports/report.json",
                "junit:target/JunitReports/report.xml"},
        tags = "@SmokeTest")
public class TestRunner {
}
