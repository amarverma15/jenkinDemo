package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsConvertPage {

	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//input[@data-scope='Account']")
	private WebElement AccountCheckbox;
	@FindBy (xpath = "//input[@data-name='name']")
	private WebElement AccountName;
	@FindBy (xpath = "//input[@data-scope='Contact']")
	private WebElement ContactCheckbox;
	@FindBy (xpath = "//input[@data-scope='Opportunity']")
	private WebElement OpportunityCheckbox;
	@FindBy (xpath = "//span[text()='USD']/ancestor::div[@class='panel-body panel-body-form']/descendant::input[@data-name='name']")
	private WebElement OppName;
	@FindBy (xpath = "//input[@data-name='amount']")
	private WebElement OppAmountField;
	@FindBy (xpath = "//input[@data-name='closeDate']")
	private WebElement OppDateField;
	@FindBy (xpath = "//button[@data-action='convert']")
	private WebElement LeadConvertBtn;
	
	public LeadsConvertPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAccountCheckbox() {
		return AccountCheckbox;
	}
	public WebElement getAccountName() {
		return AccountName;
	}
	public WebElement getContactCheckbox() {
		return ContactCheckbox;
	}
	public WebElement getOpportunityCheckbox() {
		return OpportunityCheckbox;
	}
	public WebElement getOppName() {
		return OppName;
	}
	public WebElement getOppAmountField() {
		return OppAmountField;
	}
	public WebElement getOppDateField() {
		return OppDateField;
	}
	public WebElement getLeadConvertBtn() {
		return LeadConvertBtn;
	}

	
}
