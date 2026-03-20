package com.openwayintern.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BinOpen {
    
    WebDriver driver;
    WebDriverWait wait;

    public BinOpen(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(15));
    }

    public void navigateToBin() {
        driver.get("https://mail.google.com/mail/u/0/#trash");
        wait.until(ExpectedConditions.urlContains("#trash"));
        // Wait for at least one email row to be visible in the Trash list.
        // Avoid span[@email] constraint — Trash rows may not carry that attribute.
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//tr[@role='row']")
        ));
    }
}