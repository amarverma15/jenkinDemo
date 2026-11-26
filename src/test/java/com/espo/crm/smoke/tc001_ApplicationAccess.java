package com.espo.crm.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.espo.crm.basetest.BaseClass;
import com.espo.crm.objectrepository.HomePage;

public class tc001_ApplicationAccess extends BaseClass {


	@Test
	public void test() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		// access account module
		hp.getAccountsLink().click();
		
		Thread.sleep(2000);
		// access lead module
		hp.getLeadLink().click();
		
		Thread.sleep(2000);
		// access contact module
		hp.getContactLink().click();
		
		Thread.sleep(2000);
		// access opportunities module
		hp.getOpportunitiesLink().click();
		
		Thread.sleep(2000);
		// access cases module
		hp.getCasesLink().click();
		
		Thread.sleep(2000);

	
	}
}