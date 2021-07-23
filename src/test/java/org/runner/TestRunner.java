package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", 
                 glue="org.stepdefinition",
                 dryRun=false, monochrome=true,
                 tags= {"@smoke"},
                 plugin= {"pretty",
                		 "html:src\\test\\resources\\Reports",
                		 "json:src\\test\\resources\\Reports\\jsonreport.json",
                		 "junit:src\\test\\resources\\Reports\\junitreport.xml",
                		 "rerun:src\\test\\resources\\FailedScenarios\\failedscenario.txt"})
public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\jsonreport.json");
		System.out.println("Done.............");	}

}
