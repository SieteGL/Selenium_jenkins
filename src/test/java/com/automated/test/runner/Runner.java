package com.automated.test.runner;


import com.automated.basepage.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features = "src/test/resources/feature",
                glue = "com/automated/test/steps",
                plugin = {
                        "com.qmetry.qaf.automation.cucumber.QAFCucumberPlugin",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                },
                monochrome = true,
                tags = "@full-requirements"
                )

public class Runner {
    @AfterClass
    public static void closeBrowser(){
        BasePage.closeBrowser();
    }
}
