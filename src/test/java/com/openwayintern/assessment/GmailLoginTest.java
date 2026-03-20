package com.openwayintern.assessment;

import org.testng.annotations.Test;

public class GmailLoginTest extends ChromeOpen {

    @Test
    public void testNavigationFromGoogleToMail() {
        GmailOpen gmailPage = new GmailOpen(driver);

        gmailPage.openGmail();
        gmailPage.loginGmail();

    }
}