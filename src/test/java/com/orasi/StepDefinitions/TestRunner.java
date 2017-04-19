package com.orasi.StepDefinitions;

import cucumber.api.CucumberOptions;
import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.junit.*;
import org.junit.runner.RunWith;

import com.hp.lft.report.ModifiableReportConfiguration;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.ModifiableSDKConfiguration;
import com.hp.lft.sdk.SDK;

import java.net.URI;

@RunWith(OctaneCucumber.class)
@CucumberOptions(
        features = "src/test/java/com/orasi/Features",
        glue = "com.orasi.StepDefinitions",
        plugin = {
                "pretty",
                "json:RunResults/cucmber.json",
                "junit:RunResults/cucmber.xml",
                "junit:RunResults/cucmber.html"
        }
)
public class TestRunner {
    @Test
    public void Test() {}
}
