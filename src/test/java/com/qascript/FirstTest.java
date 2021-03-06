package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("headless");
        options.addArguments("headless");
        options.addArguments("no-sandbox");
        options.addArguments("disable-dev-shm-usage");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.javatpoint.com/");
        String URL= driver.getCurrentUrl();
        System.out.print("Current url is : "+URL);
        System.out.println("Title of the page is: " + driver.getTitle());
       // Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }
}


