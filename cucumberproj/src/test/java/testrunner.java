package testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Durga\\eclipse-workspace\\cucumberproj\\src\\test"
 ,glue= {"stepdefs1"})

public class testrunner {

}
