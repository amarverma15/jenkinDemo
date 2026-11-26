package com.espo.crm.integration;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.objectrepository.ContactsCreatePage;
import com.espo.crm.objectrepository.ContactsPage;
import com.espo.crm.objectrepository.HomePage;
import com.espo.crm.objectrepository.OpportunitiesCreatePage;
import com.espo.crm.objectrepository.OpportunitiesPage;

public class tc001_Contact_Opportunity extends BaseClass {

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
		
		// Click on opportunities to create new opportunities
		hp.getOpportunitiesLink().click();
		
		Thread.sleep(2000);

		OpportunitiesPage op = new OpportunitiesPage(driver);
		op.getCreateOpportunityLink().click();
		
		OpportunitiesCreatePage cop = new OpportunitiesCreatePage(driver);
		cop.getNameEdit().sendKeys(ContactFirstName);
		
		String Ammount = eutil.getDataFromExcel("contact", 7, 2);
		String Date = eutil.getDataFromExcel("contact", 7, 3);
		cop.getAmountField().sendKeys(Ammount);
		cop.getClosingDateField().sendKeys(Date);
		Thread.sleep(3000);
		
		cop.getSaveButton().click();

		Thread.sleep(3000);

		hp.getOpportunitiesLink().click();
		
    	Thread.sleep(3000);
	}
}