package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="Features" ,
		//features="D:/CucumberDemo/Features/Tagging.feature",
		features="D:/CucumberDemo/Features/Hooks.feature",
		glue="stepDefinition",
		format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		dryRun=false,
		monochrome=true,
		strict=false
		//tags= {"@SanityTest"}  //execute only sanity test
		//tags= {"@SanityTest, @RegressionTest"}  //execute only scenarion which comes under sanity test & regression //or
		//tags={"@RegressionTest","@EndToEndTest"}, //execute scenarios from regression and end to end
		//tags={"@SanityTest","@EndToEndTest"}
		//tags={"~@EndToEndTest","~@SanityTest"} //this will ignore end to end scenarios
		//tags={"~@EndToEndTest","~@SanityTest"} //execute sanity n enetoend
		)
public class TestRunner {
	
	

}
