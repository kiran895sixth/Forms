package org.test.prolaborate.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/Prolaborate_forms.feature", glue = "org.test.prolaborate.stepDefinitions" ,dryRun=false ,
plugin= {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:report/test.html"} , tags = "@tag49"  )
public class Runnerclass {

}
