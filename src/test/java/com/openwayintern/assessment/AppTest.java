package com.openwayintern.assessment;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest 
{
    @Test
    public void testChrome() {
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
        
        driver.get("https://mail.google.com/mail/u/0/#inbox");

        System.out.println("Page title is: " + driver.getTitle());
        
        driver.quit();
    }
}
