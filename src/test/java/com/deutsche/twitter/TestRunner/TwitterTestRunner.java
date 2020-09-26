package com.deutsche.twitter.TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/deutsche/twitter/featurefiles/Twitter.feature", glue = {
		"com.deutsche.twitter.StepDef" }, monochrome = true, strict = true, dryRun = false, plugin = { "pretty",
				"html:target/cucumber-reports" }

)

public class TwitterTestRunner {







}
