package com.espo.crm.smoke;

import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.generic.webdriverutility.WebDriverUtility;
import com.espo.crm.objectrepository.HomePage;
import com.espo.crm.objectrepository.OpportunitiesCreatePage;
import com.espo.crm.objectrepository.OpportunitiesPage;

public class tc003_CreateOpportunities extends BaseClass{

	@Test(groups = "smoke")
	public void test() throws InterruptedException, EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.getOpportunitiesLink().click();
		OpportunitiesPage op = new OpportunitiesPage(driver);
		op.getCreateOpportunityLink().click();
		
		OpportunitiesCreatePage ocp = new OpportunitiesCreatePage(driver);
		String Name = eutil.getDataFromExcel("contact", 3, 2) + JavaUtility.getRandomNumber();
		ocp.getNameEdit().sendKeys(Name);
		
		String Ammount = eutil.getDataFromExcel("contact", 7, 2);
		String Date = eutil.getDataFromExcel("contact", 7, 3);
		ocp.getAmountField().sendKeys(Ammount);
		ocp.getClosingDateField().sendKeys(JavaUtility.getRequiredDateYYYYMMDD(30));
		
		Thread.sleep(5000);
//	
//		WebDriverUtility.waitForElementToBeClickable(driver, ocp.getLeadDropdown()).click();
//		WebDriverUtility.waitForElementToBeClickable(driver, ocp.getSelectCampaign()).click();
		
		//Thread.sleep(5000);
		
		ocp.getSaveButton().click();
	
	}
}
