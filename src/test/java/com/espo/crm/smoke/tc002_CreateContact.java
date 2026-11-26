package com.espo.crm.smoke;

import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.objectrepository.ContactsCreatePage;
import com.espo.crm.objectrepository.ContactsPage;
import com.espo.crm.objectrepository.HomePage;

public class tc002_CreateContact  extends BaseClass{


	@Test(groups = "smoke")
	public void test() throws InterruptedException, EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);

		// access contact module
		hp.getContactLink().click();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateContactLink().click();
		
		ContactsCreatePage ccp = new ContactsCreatePage(driver);
		String FirstName = eutil.getDataFromExcel("contact", 5, 3) + JavaUtility.getRandomNumber();
		String LastName = eutil.getDataFromExcel("contact", 5, 4);
		ccp.getFirstNameEdit().sendKeys(FirstName);
		ccp.getLastNameEdit().sendKeys(LastName);
		ccp.getSaveButton().click();

		Thread.sleep(4000);
	}
}