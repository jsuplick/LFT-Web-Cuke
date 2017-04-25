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
                //"json:RunResults/runresults.json",
                //"junit:RunResults/runresults.xml",
                //"junit:RunResults/runresults.html",
                //Next is the junit test report that will be pushed into Octane from Jenkins
                "junit:junitResult.xml"
        },
        //provide the tag needed by Octane
        tags = {"@TID42009REV0.4.0"}
)

public class TestRunner {

    @Test
    public void Test() {}
}
