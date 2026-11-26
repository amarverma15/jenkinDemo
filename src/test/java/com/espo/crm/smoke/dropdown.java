package com.espo.crm.smoke;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dropdown {
	

	@Test
	public void test() throws InterruptedException {

	// Create Object for ChromeDriver class
	WebDriver driver=new ChromeDriver();  // First Mandatory line of Code

	// maximize browser
	driver.manage().window().maximize();  // Second Mandatory line of Code
	
	// Implicit wait command
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Third Mandatory line of Code
	
	// Navigate to URL
	driver.get("https://techpycrm.espocloud.com/#Account/create");
	
	driver.findElement(By.id("field-userName")).sendKeys("admin");
	
	driver.findElement(By.id("field-password")).sendKeys("55751485");
	
	driver.findElement(By.id("btn-login")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	WebElement industry = wait.until(
	    ExpectedConditions.elementToBeClickable(
	        By.xpath("//div[@data-name='industry']//div[contains(@class,'selectize-control')]")
	    )
	);

	industry.click();

	WebElement option = wait.until(
	    ExpectedConditions.elementToBeClickable(
	        By.xpath("//div[contains(@class,'selectize-dropdown')]//div[contains(@class,'option') and normalize-space()='Automotive']")
	    )
	);

	option.click();
	
	
	}
}