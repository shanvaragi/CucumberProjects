package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,monochrome=true,
//strict=false,snippets=SnippetType.CAMELCASE,tags= {"not @smoke"})
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,monochrome=true,
strict=false,snippets=SnippetType.CAMELCASE,plugin= {"html:target\\Reports",
		"junit:target\\Reports\\fb.xml",
		"json:target\\Reports\\FBLanding.json",
		"rerun:src\\test\\resources\\Rerun\\Failed.txt"
		
})
public class TestReRunnerClass {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\FBLanding.json");

	}
	

}
