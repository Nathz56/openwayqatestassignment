package com.openwayintern.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class GmailOpen {
    
    WebDriver driver;
    WebDriverWait wait;

    By emailInput = By.name("identifier");
    By emailNextButton = By.id("identifierNext");

    By passwordInput = By.xpath("//input[@type='password']");
    By passwordNextButton = By.id("passwordNext");

    public GmailOpen(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openGmail() {
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail");
    }

    public void loginGmail() {
        
        driver.findElement(emailInput).sendKeys("krakensto2@gmail.com");
        driver.findElement(emailNextButton).click();
        
        WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        wait.until(ExpectedConditions.elementToBeClickable(passField));
        
        passField.clear();
        passField.sendKeys("123123-OKOK");
        driver.findElement(passwordNextButton).click();
    }
}
