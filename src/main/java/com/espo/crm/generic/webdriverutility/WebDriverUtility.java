package com.espo.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	WebDriver driver;

	public static void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void TakeScreenshotOfWebpage() {

		// Type cast web driver reference into TakesScreenshot reference
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Using object reference call getScreenshotAs and pass the argument
		// (OutputType.FILE)
		String filePath = ts.getScreenshotAs(OutputType.BASE64);

//		//Create object for File Class and pass file path // Define permanent destination to store file
//		File dest = new File("./errorShots/img.png");
//		
//		//Copy from temp and paste it into dest
//		FileHandler.copy(filePath, dest);
	}

	public static void switchNewBrowserTab(WebDriver driver, String partialURL) {

		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			String actualUrl = driver.getCurrentUrl();
			if (actualUrl.contains(partialURL)) {
				break;
			}
		}
	}

	public static void switchToTabOnTitle(WebDriver driver, String partialTitle) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			String actualUrl = driver.getCurrentUrl();
			if (actualUrl.contains(partialTitle)) {
				break;
			}
		}
	}

	public static void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);

	}

	public static void switchToFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}

	public static void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	public static void switchToMainFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public static void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public static void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	// Get alert text
	public static String getAlertText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	// Enter text into prompt alert
	public static void enterTextInAlert(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	// Wait for alert
	public static Alert waitForAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void selectByVT(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public static void selectByCVT(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByContainsVisibleText(text);
	}

	public static void selectByIndx(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public static void mouseMoveToElement(WebDriver driver, WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public static void doubleClick(WebDriver driver, WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
}