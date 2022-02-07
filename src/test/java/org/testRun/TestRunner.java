package org.testRun;

import org.base.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\BookingAdactin.feature" }, glue ="org.hotelStepRef", monochrome = true, plugin = { "pretty",
				"html:C:\\Users\\DELL\\eclipse-workspace\\CucuberBassclass\\Reports",
				"json:C:\\Users\\DELL\\eclipse-workspace\\CucuberBassclass\\Reports\\A.json",
				"junit:C:\\Users\\DELL\\eclipse-workspace\\CucuberBassclass\\Reports\\\\A.xml" ,
				"json:C:\\Users\\DELL\\eclipse-workspace\\CucuberBassclass\\target\\new.json"})

public class TestRunner {
	
@AfterClass
public static void afterClass() {
	ReportGeneration.reportGenerte("C:\\Users\\DELL\\eclipse-workspace\\CucuberBassclass\\target\\new.json");

}
	

}
