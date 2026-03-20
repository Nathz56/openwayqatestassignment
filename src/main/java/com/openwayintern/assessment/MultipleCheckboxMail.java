package com.openwayintern.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MultipleCheckboxMail {
    
    WebDriver driver;
    WebDriverWait wait;

    By multipleEmailCheckbox = By.xpath("//tr[@role='row' and .//span[@email]]//div[@role='checkbox']");
    By popUpNotification = By.id("link_enable_notifications_hide");

    public MultipleCheckboxMail(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void closePopupNotification() {
        try {
            WebElement toastPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(popUpNotification));
            if (toastPopUp.isDisplayed()) {
                toastPopUp.click();
            }
        } catch (Exception e) {
        }
    }

    public void hitCheckboxMultipleEmail() {
        
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(multipleEmailCheckbox));
        List<WebElement> checkboxes = driver.findElements(multipleEmailCheckbox);

        // int selectedEmail = 3; //this value to limit how many multiple email, but i have to make another different for loop

        for (WebElement checkbox : checkboxes) {
            wait.until(ExpectedConditions.elementToBeClickable(checkbox));
            if (checkbox.getAriaRole().equals("checkbox") && checkbox.getAttribute("aria-checked").equals("false")) {
                checkbox.click();
            }
        }

    }

}
