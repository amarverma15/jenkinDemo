package com.espo.crm.integration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.espo.crm.basetest.BaseClass;
import com.espo.crm.generic.fileutility.ExcelUtility;
import com.espo.crm.generic.fileutility.FileUtility;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.generic.webdriverutility.WebDriverUtility;
import com.espo.crm.objectrepository.HomePage;
import com.espo.crm.objectrepository.LeadsConvertPage;
import com.espo.crm.objectrepository.LeadsCreatePage;
import com.espo.crm.objectrepository.LeadsPage;
import com.espo.crm.objectrepository.LoginPage;
import com.espo.crm.objectrepository.LeadsInfoPage;

public class tc003_Lead_Convert_To_All extends BaseClass {

	@Test
	public void test() throws InterruptedException, IOException {

		/*
		 * Lead(Amardeep = unproven Inquiry) ==> Convert to Contact( Verified
		 * Person)==>+ Opportunity(Amardeep 2.5L purchase) Account ( His Company)
		 */
		HomePage hp = new HomePage(driver);
		/* STEP 1 Click on Lead Link */
		hp.getLeadLink().click();

		/* In LeadPage Click on Create Lead */

		LeadsPage lsp = new LeadsPage(driver);
        // STEP 2
		lsp.getCreateLeadLink().click();

		// Enter the Lead Name From Excel
		String LeadFirstName = eutil.getDataFromExcel("contact", 5, 3) + JavaUtility.getRandomNumber();

		// Create Object of CreateLeadsPage and Enter Leads FirstName and LastName
		LeadsCreatePage lc = new LeadsCreatePage(driver);
		lc.getFirstNameEdt().sendKeys(LeadFirstName);

		// Enter the Lead Last Name From Excel
		String LeadLastName = eutil.getDataFromExcel("contact", 5, 4);
		lc.getLastNameEdt().sendKeys(LeadLastName);


		lc.getSaveButton().click();
		Thread.sleep(2000);

		// ============================================================================//
		
        // Step 3
		// Click on Convert Button
		LeadsInfoPage nlp = new LeadsInfoPage(driver);
		nlp.getLeadConvertLink().click();

        //Step 4
		// Enter Data in Account, Contact and Opportunity and convert

		LeadsConvertPage lcp = new LeadsConvertPage(driver);

		lcp.getAccountCheckbox().click();

		Thread.sleep(2000);

		String AccountName = eutil.getDataFromExcel("contact", 5, 5);

		lcp.getAccountName().sendKeys(AccountName);

		lcp.getContactCheckbox().click();

		Thread.sleep(3000);

		lcp.getOpportunityCheckbox().click();
		Thread.sleep(3000);

		lcp.getOppName().sendKeys(LeadFirstName);

		Thread.sleep(2000);

		lcp.getOppAmountField().sendKeys("1000");

		// Enter the closing date
		String endDate = JavaUtility.getRequiredDateYYYYMMDD(30);

		lcp.getOppDateField().sendKeys(endDate);

		lcp.getLeadConvertBtn().click();

	}
}