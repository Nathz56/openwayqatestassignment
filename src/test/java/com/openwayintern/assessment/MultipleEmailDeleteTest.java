package com.openwayintern.assessment;

import org.testng.annotations.Test;

public class MultipleEmailDeleteTest extends ChromeOpen {
    
    @Test
    public void testDeleteMultipleEmail() {
        GmailOpen gmailPage = new GmailOpen(driver);

        MultipleCheckboxMail multipleCheckboxMail = new MultipleCheckboxMail(driver);

        DeleteMail deleteMail = new DeleteMail(driver);

        gmailPage.openGmail();
        gmailPage.loginGmail();

        multipleCheckboxMail.closePopupNotification();
        multipleCheckboxMail.hitCheckboxMultipleEmail();
        
        deleteMail.deleteSelected();
    }

}
