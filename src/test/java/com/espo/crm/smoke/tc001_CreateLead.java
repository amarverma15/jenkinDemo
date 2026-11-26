package com.espo.crm.smoke;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.objectrepository.HomePage;
import com.espo.crm.objectrepository.LeadsCreatePage;
import com.espo.crm.objectrepository.LeadsPage;

public class tc001_CreateLead  extends BaseClass{

	@Test(groups = "smoke")
	public void test() throws InterruptedException, EncryptedDocumentException, IOException {
		

		HomePage hp = new HomePage(driver);
		
		// access lead module
		hp.getLeadLink().click();
		
		LeadsPage lp = new LeadsPage(driver);
		lp.getCreateLeadLink().click();
		
		LeadsCreatePage lcp = new LeadsCreatePage(driver);
		
		String FirstName = eutil.getDataFromExcel("contact", 5, 3) + JavaUtility.getRandomNumber();
		String LastName = eutil.getDataFromExcel("contact", 5, 4);
		lcp.getFirstNameEdt().sendKeys(FirstName);
		lcp.getLastNameEdt().sendKeys(LastName);
		lcp.getSaveButton().click();


		Thread.sleep(5000);
	}
}