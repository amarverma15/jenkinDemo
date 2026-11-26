package com.espo.crm.basetest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.espo.crm.generic.fileutility.ExcelUtility;
import com.espo.crm.generic.fileutility.FileUtility;
import com.espo.crm.generic.webdriverutility.JavaUtility;
import com.espo.crm.generic.webdriverutility.WebDriverUtility;
import com.espo.crm.objectrepository.HomePage;
import com.espo.crm.objectrepository.LoginPage;

public class BaseClass {

	// Create Objects
	public WebDriver driver = null;
	public FileUtility fileutil = new FileUtility();
	public WebDriverUtility wutil = new WebDriverUtility();
	public ExcelUtility eutil = new ExcelUtility();

	@BeforeSuite(alwaysRun = true)
	public void configBS() {

	}

	// @Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	//public void configBC(@Optional("chrome")String BROWSER) throws IOException {

	public void configBC() throws IOException {
		String BROWSER = fileutil.readDataFromPropertiesFile("browser");

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
	}

	@BeforeMethod(alwaysRun = true)
	public void configBM() throws IOException {
		String URL = fileutil.readDataFromPropertiesFile("url");
		String USERNAME = fileutil.readDataFromPropertiesFile("username");
		String PASSWORD = fileutil.readDataFromPropertiesFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(URL, USERNAME, PASSWORD);

	}

	@AfterMethod(alwaysRun = true)
	public void configAM() {
		// Logout
		HomePage hp2 = new HomePage(driver);
		hp2.logout();
	}

	@AfterClass(alwaysRun = true)
	public void configAC() {
		// Close the browser
		driver.quit();
	}

	@AfterSuite(alwaysRun = true)
	public void configAS() {
		// close DB

//		// Report Backup
//		report.flush();
//	}
//}
	}
}