package com.test.util.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver = new ChromeDriver();
    @Before
    public void startBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @After
    public void closeBrowser()
    {
        driver.close();
        driver.quit();
    }

}
