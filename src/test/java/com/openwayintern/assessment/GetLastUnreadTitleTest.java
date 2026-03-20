package com.openwayintern.assessment;

import org.testng.annotations.Test;

public class GetLastUnreadTitleTest extends ChromeOpen {
    
    @Test
    public void testGetLastUnreadEmailTitle() {
        GmailOpen gmailPage = new GmailOpen(driver);

        SearchbarType searchbarType = new SearchbarType(driver);

        gmailPage.openGmail();
        gmailPage.loginGmail();

        searchbarType.typeSearchBar();
        searchbarType.getLastUnreadTitle();
    }

    @Test (priority = 2)
    public void CloseBrowser() {
            driver.quit(); 
    }
}