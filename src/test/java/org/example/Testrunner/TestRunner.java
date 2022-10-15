package org.example.Testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"}
        ,glue = {"org/example/pageDefinitions"}
        ,tags = " @NC7"
        ,dryRun = false
        ,plugin = {"pretty","html:target/html_report.html"}


)
public class TestRunner {
}
