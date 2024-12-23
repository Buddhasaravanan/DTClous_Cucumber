package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(//features= {".//FeatureFile/001_Login.feature", ".//FeatureFile/002_Create_opportunity.feature", "./FeatureFile/003_Qoute_and_Proposal.feature"},
				  features= {".//FeatureFile/"},
				 //features= {".//FeatureFile/001_Login.feature"},
				 //features= {".//FeatureFile/Createnewopp.feature"},
	              //features= {".//FeatureFile/Sanity_and_Smoke_Test.feature"}, 	
                 //features= {"@target/rerun.txt"},    

				   
                 glue= "stepDefinitions",
                 
                 plugin={ "pretty", "html:reports/myreport.html", "rerun:target/rerun.txt", "json:target/cucumber-reports/cucumber.json",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 
                 dryRun=false,
                 
                 monochrome=true,
                 
                 publish=true
                     
                                                                                                           )
public class Execution_File {

}
