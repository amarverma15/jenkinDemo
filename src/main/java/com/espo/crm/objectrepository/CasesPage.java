package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasesPage {
	
	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//span[text()='Create Case']")
	private WebElement CreateCaseLink;
	
	// Create Constructor to Initialize
	public CasesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateCaseLink() {
		return CreateCaseLink;
	}
}