package com.orasi.StepDefinitions;

import java.net.URI;

import com.hp.lft.report.ModifiableReportConfiguration;
import cucumber.api.java.en.*;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;

public class CompleteContctUsForm {

    @Given("^a customer fills in the Contct Us form$")
    public void a_customer_fills_in_the_Contct_Us_form() throws Throwable {

        //Initialize the LeanFT SDK and the LeanFT Reporter
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
        ModifiableReportConfiguration rconfig = new ModifiableReportConfiguration();
        Reporter.init (rconfig);

        //Configure the SRF capabilities
        //URL FTAAS_URL = new URL("https","ftaas.saas.hpe.com", 443,"/wd/hub/");
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //capabilities.setCapability("SRF_CLIENT_ID", "t471464561_oauth2-tSLqZ9U5iYO4xd180lig@hpe.com");
        //capabilities.setCapability("SRF_CLIENT_SECRET", "7G5Lt6IxIpQ6VAoAFKII");
        //capabilities.setCapability("name","LFT-Sel-Cuke-SRF - Jean Suplick");
        //capabilities.setVersion("51");
        //capabilities.setCapability("platform","Windows 7");

        //open www.orasi.com
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("http://www.orasi.com");

        //Contact Us
        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("SPAN").innerText("CONTACT US").outerText("CONTACT US").index(0).build()).click();

        //inquiry type
        browser.describe(Frame.class, new FrameDescription.Builder()
                .id("").name("").index(0).build()).describe(ListBox.class, new ListBoxDescription.Builder()
                .tagName("SELECT").name("42712_172266pi_42712_172266").build()).select("General Questions");

        //email
        browser.describe(Frame.class, new FrameDescription.Builder()
                .id("").name("").index(0).build()).describe(EditField.class, new EditFieldDescription.Builder()
                .type("text").tagName("INPUT").name("42712_172268pi_42712_172268").build()).setValue("jean.suplick@orasi.com");

        //first name
        browser.describe(Frame.class, new FrameDescription.Builder()
                .id("").name("").index(0).build()).describe(EditField.class, new EditFieldDescription.Builder()
                .type("text").tagName("INPUT").name("42712_172270pi_42712_172270").build()).setValue("Jean");

        //last name
        browser.describe(EditField.class, new EditFieldDescription.Builder()
                .type("text").tagName("INPUT").name("42712_172272pi_42712_172272").build()).setValue("Suplick");

        //company name
        browser.describe(EditField.class, new EditFieldDescription.Builder()
                .type("text").tagName("INPUT").name("42712_172274pi_42712_172274").build()).setValue("Orasi");

        //country name
        browser.describe(ListBox.class, new ListBoxDescription.Builder()
                .className("select").tagName("SELECT").name("42712_172278pi_42712_172278").build()).select("United States");

        //state
        browser.describe(ListBox.class, new ListBoxDescription.Builder()
                .className("select").name("42712_185989pi_42712_185989").build()).select("TX");

        //message
        browser.describe(Frame.class, new FrameDescription.Builder()
                .id("").name("").index(0).build()).describe(EditField.class, new EditFieldDescription.Builder()
                .type("textarea").tagName("TEXTAREA").name("42712_172280pi_42712_172280").build()).setValue("This is a test. Please ignore.");

        //I am not a robot
        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("recaptcha-checkbox-checkmark").tagName("DIV").innerText("").build()).click();
    }
    @When("^they click the submit button$")
    public void they_click_the_submit_button() throws Throwable {
        //submit
        //browser.describe(Button.class, new ButtonDescription.Builder()
        //      .buttonType("submit").tagName("INPUT").name("Submit").build()).click();
    }

    @Then("^they get the thank you message$")
    public void they_get_the_thank_you_message() throws Throwable {

        //browser.close;
        //Generate the test report and cleanup the LeanFT SDK usage.
        Reporter.generateReport();
        SDK.cleanup();

    }
}
