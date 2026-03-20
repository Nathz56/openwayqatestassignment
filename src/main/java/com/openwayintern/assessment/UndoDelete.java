package com.openwayintern.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UndoDelete {
    
    WebDriver driver;
    WebDriverWait wait;

    By undoButton = By.id("link_undo");

    public UndoDelete(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    public void hitUndoDelete() {
        wait.until(driver -> driver.findElement(undoButton).isDisplayed());
        driver.findElement(undoButton).click();
    }
}
