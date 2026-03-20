package com.openwayintern.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeleteMail {
    
    WebDriver driver;
    WebDriverWait wait;
    
    By deleteButton = By.xpath("//div[@role='button' and @act='10']");
    By deleteForeverButton = By.xpath("//div[@role='button' and @act='17']");
    
    public DeleteMail(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void deleteSelected() {
        WebElement delete = wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
        delete.click();
    }

    public void deleteForeverSelected() {
        WebElement deleteForever = wait.until(ExpectedConditions.elementToBeClickable(deleteForeverButton));
        deleteForever.click();
    }
}

