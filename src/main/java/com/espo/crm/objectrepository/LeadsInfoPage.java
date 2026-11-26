package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsInfoPage {



	WebDriver driver;
	// Adding LaedButton
	@FindBy (xpath = "//button[@data-name='convert']")
	private WebElement LeadConvertLink;
	@FindBy (xpath = "//button[@data-name='edit']")
	private WebElement LeadEditBtn;
	
	public LeadsInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLeadConvertLink() {
		return LeadConvertLink;
	}
	public WebElement getLeadEditBtn() {
		return LeadEditBtn;
	}
	
}