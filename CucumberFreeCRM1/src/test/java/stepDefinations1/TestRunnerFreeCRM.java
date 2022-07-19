package stepDefinations1;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/freeCRM.feature",glue= {"stepDefinations1"},
monochrome=true,
plugin= {"pretty","html:reports/htmlReport/html",
"json:reports/JsonReport/cucumber.json",
"junit:reports/JunitReport/report.xml"})

public class TestRunnerFreeCRM {

}
