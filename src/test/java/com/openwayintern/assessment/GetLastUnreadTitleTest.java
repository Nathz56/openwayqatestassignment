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

        String lastUnreadTitle = searchbarType.getLastUnreadTitle();
        org.testng.Assert.assertEquals(lastUnreadTitle, "Debug your app");
    }
}