package com.espo.crm.integration;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.objectrepository.ContactsCreatePage;
import com.espo.crm.objectrepository.ContactsInfoPage;
import com.espo.crm.objectrepository.ContactsPage;
import com.espo.crm.objectrepository.HomePage;

public class tc002_Contact_Cases extends BaseClass {


	@Test
	public void test() throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		HomePage hp = new HomePage(driver);
		hp.getContactLink().click();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.getCreateContactLink().click();
		
		ContactsCreatePage ccp = new ContactsCreatePage(driver);
		
		// Enter the Lead Name From Excel
		String ContactFirstName = eutil.getDataFromExcel("contact", 1, 2) + JavaUtility.getRandomNumber();
		
		// Enter the Lead Name From Excel
		String ContactLastName = eutil.getDataFromExcel("contact", 1, 3);

		ccp.getFirstNameEdit().sendKeys(ContactFirstName);
		ccp.getLastNameEdit().sendKeys(ContactLastName);
		ccp.getAddAccountLink().click();
		ccp.getBMWAccountCheckbox().click();
		ccp.getAccountSelectButton().click();
		ccp.getSaveButton().click();
		
		Thread.sleep(3000);

		ContactsInfoPage cip = new ContactsInfoPage(driver);
		cip.getAddCasesButton().click();
		String CaseName = eutil.getDataFromExcel("contact", 7, 4);
		cip.getNameEdit().sendKeys(CaseName);
		Thread.sleep(2000);
		cip.getSaveButton().click();

	}
}