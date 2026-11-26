package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//span[text()='Create Lead']")
	private WebElement CreateLeadLink;
	
	// Create Constructor to Initialize
	public LeadsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateLeadLink() {
		return CreateLeadLink;
	}
}
