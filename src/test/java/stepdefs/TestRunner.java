package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
	//monochrome = true (it'll hide unsupported characters from console 	
	plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},// it'll Display steps involved in console 
	features="src/test/java/features",
	glue= "stepdefs" ,
	tags = {"@Login or @AddToCart"}
	)
public class TestRunner {

}
