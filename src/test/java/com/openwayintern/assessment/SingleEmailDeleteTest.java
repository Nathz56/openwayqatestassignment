package com.openwayintern.assessment;

import org.testng.annotations.Test;

public class SingleEmailDeleteTest extends ChromeOpen {
    
    @Test
    public void testDeleteSingleEmail() {
        GmailOpen gmailPage = new GmailOpen(driver);

        CheckboxMail checkboxMail = new CheckboxMail(driver);

        gmailPage.openGmail();

        gmailPage.loginGmail();

        checkboxMail.hitCheckboxMail();
        
        checkboxMail.deleteCheckboxMail();
    }

}
