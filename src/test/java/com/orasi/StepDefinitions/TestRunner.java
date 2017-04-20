package com.orasi.StepDefinitions;

import cucumber.api.CucumberOptions;
import com.hpe.alm.octane.OctaneCucumber;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
        features = "src/test/java/com/orasi/Features",
        glue = "com.orasi.StepDefinitions",
        plugin = {
                "pretty",
                "json:RunResults/cucmber.json",
                "junit:RunResults/cucmber.xml",
                "junit:RunResults/cucmber.html"
        },
        tags = {"@TID42009REV0.4.0"}
)

public class TestRunner {
    @Test
    public void Test() {}
}
