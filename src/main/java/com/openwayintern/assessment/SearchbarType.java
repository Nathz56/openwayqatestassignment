package com.openwayintern.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchbarType {

    WebDriver driver;
    WebDriverWait wait;

    By hitSearchBar = By.xpath("//*[@id=\"gs_lc50\"]/input[1]");
    By lastTitle = By.xpath( "(//tr[@role='row' and .//span[@class='bqe']]//span[@class='bqe'])[last()]");

    public SearchbarType(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    public void typeSearchBar() {
        wait.until(driver -> driver.findElement(hitSearchBar).isDisplayed());
        driver.findElement(hitSearchBar).sendKeys("is:unread");
        driver.findElement(hitSearchBar).sendKeys(Keys.ENTER);
    }

    public void getLastUnreadTitle() {
        wait.until(driver -> driver.findElement(lastTitle).isDisplayed());
        String lastUnreadTitle = driver.findElement(lastTitle).getText();
        System.out.println("LAST TITLE IS PRINTED HERE = " + lastUnreadTitle);
    }


}
