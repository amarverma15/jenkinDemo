package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasesCreatePage {

	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//input[@data-name='name']")
	private WebElement NameEdit;
	
	@FindBy (xpath = "//div[@class='cell col-sm-6 form-group' and contains(.,'Accounts')]/descendant::span[@class='input-group-btn']")
	private WebElement AddAccountLink;
	
	
	@FindBy (xpath = "//div[@class='cell col-sm-6 form-group' and contains(.,'Contacts')]/descendant::span[@class='input-group-btn']")
	private WebElement AddContactLink;
	
	@FindBy (xpath = "//a[text()='BMW']/ancestor::tr/descendant::input")
	private WebElement BMWAccountCheckbox;
	
	@FindBy (xpath = "//button[text()='Select']")
	private WebElement AccountSelectButton;
	
	@FindBy (xpath = "//button[@data-name='save']")
	private WebElement SaveButton;
	
	// Create Constructor to Initialize
	public CasesCreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getNameEdit() {
		return NameEdit;
	}

	public WebElement getAddAccountLink() {
		return AddAccountLink;
	}

	public WebElement getAddContactLink() {
		return AddContactLink;
	}

	public WebElement getBMWAccountCheckbox() {
		return BMWAccountCheckbox;
	}

	public WebElement getAccountSelectButton() {
		return AccountSelectButton;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
}