package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {

	WebDriver driver;
	// Adding Create Opportunities Link
	@FindBy (xpath = "//span[text()='Create Opportunity']")
	private WebElement CreateOpportunityLink;
	
	// Create Constructor to Initialize
	public OpportunitiesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement getCreateOpportunityLink() {
		return CreateOpportunityLink;
	}
}
