package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInfoPage {

	WebDriver driver;
	// Adding Create Opportunities Link
	@FindBy (xpath = "//button[@data-name='confirm']")
	private WebElement ConfirmLink;
	
	@FindBy (xpath = "//div[@data-name='cases']/descendant::span[@class='fas fa-plus']")
	private WebElement AddCasesButton;
	
	@FindBy (xpath = "//input[@data-name='name']")
	private WebElement NameEdit;
	
	@FindBy (xpath = "//footer[@class='modal-footer']/descendant::button[@data-name='save']")
	private WebElement SaveButton;
	
	// Create Constructor to Initialize
	public ContactsInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement getConfirmLink() {
		return ConfirmLink;
	}

	public WebElement getAddCasesButton() {
		return AddCasesButton;
	}

	public WebElement getNameEdit() {
		return NameEdit;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
}