package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasesInfoPage {

	WebDriver driver;
	// Adding Create Opportunities Link
	@FindBy (xpath = "//footer[@class='modal-footer']/descendant::button[@data-name='save']")
	private WebElement NameEdit;
	
	// Create Constructor to Initialize
	public CasesInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement getAddCasesButton() {
		return NameEdit;
	}
}