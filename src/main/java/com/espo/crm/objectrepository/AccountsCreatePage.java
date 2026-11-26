package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsCreatePage {


	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//input[@data-name='name']")
	private WebElement NameEdit;
	
	@FindBy (xpath = "//button[@data-name='save']")
	private WebElement SaveButton;
	
	@FindBy (xpath = "//div[@data-name='industry']//div[contains(@class,'selectize-control')]")
	private WebElement IndustryDropdown;
	
	@FindBy (xpath = "//div[contains(@class,'selectize-dropdown')]//div[contains(@class,'option') and normalize-space()='Automotive']")
	private WebElement SelectAutomotive;
	
	// Create Constructor to Initialize
	public AccountsCreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getNameEdit() {
		return NameEdit;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}

	public WebElement getSelectAutomotive() {
		return SelectAutomotive;
	}
}
