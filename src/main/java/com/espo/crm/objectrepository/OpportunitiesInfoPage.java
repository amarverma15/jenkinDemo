package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesInfoPage {

	WebDriver driver;
	// Adding Create Opportunities Link
	@FindBy (xpath = "//button[@data-name='confirm']")
	private WebElement ConfirmLink;
	
	// Create Constructor to Initialize
	public OpportunitiesInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement getConfirmLink() {
		return ConfirmLink;
	}
}