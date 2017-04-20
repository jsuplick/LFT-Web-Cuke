package com.orasi.StepDefinitions;

import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import com.hpe.alm.octane.OctaneCucumber;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
        features = "src/test/java/com/orasi/Features",
        //glue the script to a package where the step definitions can be found.
        glue = "com.orasi.StepDefinitions",
        plugin = {
                "pretty",
                "json:RunResults/runresults.json",
                "junit:RunResults/runresults.xml",
                "junit:RunResults/runresults.html"
        },
        //provide the tag (gherkin test ID) needed by Octane
        tags = {"@TID42009REV0.4.0"}
)

public class TestRunner {
    @Test
    public void Test() {}
}
