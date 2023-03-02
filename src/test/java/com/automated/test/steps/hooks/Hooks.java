package com.automated.test.steps.hooks;

import com.automated.basepage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BasePage {

    public Hooks(){
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            scenario.write(("Error during test, please check the scenario and check the images: "));
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }
    }

    @After("@AfterCapture")
    public void afterCapture(Scenario scenario){
        if(!scenario.isFailed()){
            scenario.write(("scenario completed successfully. "));
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }
    }

    @AfterStep
    public void afterEveryStep(Scenario scenario){
        if(!scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }
    }
}
