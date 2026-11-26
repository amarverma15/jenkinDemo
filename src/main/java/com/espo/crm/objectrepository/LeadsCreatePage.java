package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsCreatePage {

	
	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//input[@data-name='firstName']")
	private WebElement FirstNameEdt;
	
	@FindBy (xpath = "//input[@data-name='lastName']")
	private WebElement LastNameEdt;
	
	@FindBy (xpath = "//button[@data-name='save']")
	private WebElement SaveButton;
	
	// Create Constructor to Initialize
	public LeadsCreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstNameEdt() {
		return FirstNameEdt;
	}

	public WebElement getLastNameEdt() {
		return LastNameEdt;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}	
}
//	
//	public void CreateLead()
//}
