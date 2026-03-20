package com.openwayintern.assessment;

import org.testng.annotations.Test;

public class UndoSingleEmailDeleteTest extends ChromeOpen {
    
    @Test
    public void testUndoDeleteSingleEmail() {
        GmailOpen gmailPage = new GmailOpen(driver);

        CheckboxMail checkboxMail = new CheckboxMail(driver);

        DeleteMail deleteMail = new DeleteMail(driver);

        UndoDelete undoDelete = new UndoDelete(driver);

        gmailPage.openGmail();
        gmailPage.loginGmail();

        checkboxMail.hitCheckboxMail();
        
        deleteMail.deleteSelected();

        undoDelete.hitUndoDelete();
    }
    
}
