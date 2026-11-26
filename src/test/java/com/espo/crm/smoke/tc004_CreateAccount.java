package com.espo.crm.smoke;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.webdriverutility.WebDriverUtility;
import com.espo.crm.objectrepository.AccountsCreatePage;
import com.espo.crm.objectrepository.AccountsPage;
import com.espo.crm.objectrepository.HomePage;

public class tc004_CreateAccount extends BaseClass{

	@Test
	public void test() throws InterruptedException, EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.getAccountsLink().click();
		
		AccountsPage ap = new AccountsPage(driver);
		ap.getCreateAccountsLink().click();
		
		AccountsCreatePage acp = new AccountsCreatePage(driver);
		
		// Enter the Lead Name From Excel
		String AccountsName1 = eutil.getDataFromExcel("contact", 5, 5);
		String AccountsName2 = eutil.getDataFromExcel("contact", 5, 6);
		String AccountsName3 = eutil.getDataFromExcel("contact", 5, 7);
		String AccountsName4 = eutil.getDataFromExcel("contact", 5, 8);
		String AccountsName5 = eutil.getDataFromExcel("contact", 5, 9);
		String AccountsName6 = eutil.getDataFromExcel("contact", 5, 10);
				
		acp.getNameEdit().sendKeys(AccountsName4);
		
		WebDriverUtility.waitForElementToBeClickable(driver, acp.getIndustryDropdown()).click();
		WebDriverUtility.waitForElementToBeClickable(driver, acp.getSelectAutomotive()).click();
		
		acp.getSaveButton().click();
	
	}
}