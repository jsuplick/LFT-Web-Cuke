package com.orasi.StepDefinitions;

import cucumber.api.CucumberOptions;
import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.java.*;
import cucumber.api.java.After;
//import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
        features = "src/test/java/com/orasi/Features",
        //glue the script to a package where the step definitions can be found.
        glue = "com.orasi.StepDefinitions",
        plugin = {
                "pretty",
                "json:RunResults/runresults.json",
                "junit:RunResults/runresults.html",
                "junit:RunResults/RunResults.xml"
        },
        //provide the tag needed by Octane
        tags = {"@TID49001REV0.2.0"}
)

public class TestRunner {

    @Test
    public void Test() {}
}
