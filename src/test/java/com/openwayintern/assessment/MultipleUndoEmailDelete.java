package com.openwayintern.assessment;

import org.testng.annotations.Test;

public class MultipleUndoEmailDelete extends ChromeOpen {
    
     @Test
    public void testUndoDeleteMultipleEmail() {
        GmailOpen gmailPage = new GmailOpen(driver);

        MultipleCheckboxMail multipleCheckboxMail = new MultipleCheckboxMail(driver);

        DeleteMail deleteMail = new DeleteMail(driver);

        UndoDelete undoDelete = new UndoDelete(driver);

        gmailPage.openGmail();
        gmailPage.loginGmail();

        multipleCheckboxMail.closePopupNotification();
        multipleCheckboxMail.hitCheckboxMultipleEmail();
        
        deleteMail.deleteSelected();

        undoDelete.hitUndoDelete();

    }
}
