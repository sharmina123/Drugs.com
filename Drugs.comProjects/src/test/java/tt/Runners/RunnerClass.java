package tt.Runners;

import java.io.File;

import org.junit.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class RunnerClass {

	@CucumberOptions(features = {"src/test/resource/FeaturesFiles"}, glue = {"tt.drugs.stepDef", "tt.utilities"},
            tags = {"@regration"}, 
            plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json", 
                     "com.cucumber,listener.ExtentCucumberFormatter:target/cucumber-reports.html" },
                       monochrome = true) 


public class DrugsRunner extends AbstractTestNGCucumberTests {
		@AfterClass
		public  void writeExtentReport(){
			Reporter.loadXMLConfig(new File ("config/config.xml"));
		


	}
}
}


	
