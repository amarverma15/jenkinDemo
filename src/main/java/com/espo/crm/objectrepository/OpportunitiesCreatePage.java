package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.espo.crm.generic.webdriverutility.WebDriverUtility;

public class OpportunitiesCreatePage extends WebDriverUtility {

	WebDriver driver;

	@FindBy (xpath = "//input[@data-name='name']")
	private WebElement NameEdit;
	@FindBy (xpath = "//input[@data-name='closeDate']")
	private WebElement ClosingDateField;
	@FindBy (xpath = "//input[@data-name='amount']")
	private WebElement AmountField;
	@FindBy (xpath = "//button[@data-name='save']")
	private WebElement SaveButton;
	@FindBy (xpath = "//select[@data-name='leadSource']")
	private WebElement SelectPath;
	@FindBy (xpath = "//div[@data-name='leadSource']/child::div[contains(@class,'selectize-control')]")
	private WebElement LeadDropdown;
	@FindBy (xpath = "//div[contains(@class,'selectize-dropdown')]/child::div[contains(@class,'option') and normalize-space()='Campaign']")
	private WebElement SelectCampaignLink;
	
	// Create Constructor to Initialize
	public OpportunitiesCreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getNameEdit() {
		return NameEdit;
	}

	public WebElement getClosingDateField() {
		return ClosingDateField;
	}

	public WebElement getAmountField() {
		return AmountField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getSelectPath() {
		return SelectPath;
		
	}

	public WebElement getLeadDropdown() {
		return LeadDropdown;
	}

	public WebElement getSelectCampaign() {
		return SelectCampaignLink;
	}
}
