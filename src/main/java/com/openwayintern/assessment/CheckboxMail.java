package com.openwayintern.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckboxMail {
    
    WebDriver driver;
    WebDriverWait wait;

    By firstEmailCheckbox = By.xpath("(//tr[@role='row' and .//span[@email]]//div[@role='checkbox'])[1]");
    

    public CheckboxMail(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void hitCheckboxMail() {
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(firstEmailCheckbox));
        checkbox.click();
    }
}
