package com.espo.crm.smoke;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.objectrepository.CasesCreatePage;
import com.espo.crm.objectrepository.CasesPage;
import com.espo.crm.objectrepository.HomePage;

public class tc005_CreateCases extends BaseClass {

	@Test
	public void test() throws InterruptedException, EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);

		// access cases module
		hp.getCasesLink().click();
		
		CasesPage cp = new CasesPage(driver);
		cp.getCreateCaseLink().click();
		
		CasesCreatePage ccp = new CasesCreatePage(driver);
		
		String Name = eutil.getDataFromExcel("contact", 5, 3) + JavaUtility.getRandomNumber();
		ccp.getNameEdit().sendKeys(Name);
		
		ccp.getSaveButton().click();
		
		Thread.sleep(4000);
	}
}