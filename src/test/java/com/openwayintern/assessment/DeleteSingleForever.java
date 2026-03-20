package com.openwayintern.assessment;

import org.testng.annotations.Test;

public class DeleteSingleForever extends ChromeOpen {
    
    @Test
    public void testDeleteSingleEmail() {
        GmailOpen gmailPage = new GmailOpen(driver);

        CheckboxMail checkboxMail = new CheckboxMail(driver);

        DeleteMail deleteMail = new DeleteMail(driver);

        BinOpen binOpen = new BinOpen(driver);

        gmailPage.openGmail();
        gmailPage.loginGmail();


        checkboxMail.hitCheckboxMail();

        binOpen.navigateToBin();
                
        deleteMail.deleteSelected();

    }
    
}
