package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.espo.crm.generic.webdriverutility.WebDriverUtility;

public class LoginPage extends WebDriverUtility{

	WebDriver driver;
	// Declaration
	@FindBy (id = "field-userName")
	private WebElement UserNameTextfield;
	
	@FindBy (id = "field-password")
	private WebElement PasswordTextfield;
	
	@FindBy (id = "btn-login")
	private WebElement LoginButton;

	// Create Constructor to Initialize
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	// Create Getters
	public WebElement getUserNameTextfield() {
		return UserNameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	// Call to login // Provide Action
	public void loginToApp(String URL, String USERNAME, String PASSWORD) {
		// Maximize the Browser
		driver.manage().window().maximize();
		// Implicit Wait
		waitForPageToLoad(driver);
		// Navigate to the URL
		driver.get(URL);
		// Call UserNameTextfield 
		UserNameTextfield.sendKeys(USERNAME);
		// Call PassWordTextfield
		PasswordTextfield.sendKeys(PASSWORD);
		// Call LoginButton
		LoginButton.click();
	}
}
