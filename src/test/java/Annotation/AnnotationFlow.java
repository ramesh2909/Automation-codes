package Annotation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationFlow {
		
	WebDriver w;
	@BeforeSuite
	public void OpenBrowser() {
		w = new ChromeDriver();
	}
	
	@BeforeTest
	public void LaunchSite() {
		w.get("https://demo.frontaccounting.eu/");
	}
	
	@BeforeClass
	public void LogIn() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.name("SubmitUser")).click();
	}
	
	@BeforeMethod
	public void SalesQuotationEntry() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.linkText("Sales Quotation Entry")).click();
	}

	@Test
	public void Customer() throws Exception {
		Thread.sleep(2000);
		Select s = new Select(w.findElement(By.id("customer_id")));
		Thread.sleep(2000);
		s.selectByVisibleText("Janet");				
	}
	
	@Test
	public void Payment() throws Exception {
		Thread.sleep(2000);
		Select s = new Select(w.findElement(By.id("payment")));
		Thread.sleep(2000);
		s.selectByVisibleText("Prepaid");				
	}

	@AfterMethod
	public void CancelQuotation() throws Exception {
		w.findElement(By.name("CancelOrder")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		w.findElement(By.linkText("Back")).click();
	}
	
	@AfterClass
	public void LogOut() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.linkText("Logout")).click();
	}
	

	@AfterSuite
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		w.quit();
	}
}
