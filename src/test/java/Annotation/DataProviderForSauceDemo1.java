package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderForSauceDemo1 {

	WebDriver w;
	
	@BeforeClass
	public void browserlaunch() {
		w = new ChromeDriver();
		w.get("https://www.saucedemo.com/");
	}
	
	@Test (dataProviderClass = DataProviderForSauceDemo.class, dataProvider ="login")
	public void login (String user,String pass) throws Exception{
		w.findElement(By.name("user-name")).sendKeys(user);
		Thread.sleep(2000);
		w.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		w.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		try {
			w.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
//			w.findElement(By.name("user-name")).clear();
			w.findElement(By.name("user-name")).sendKeys(Keys.CONTROL,"a");
			Thread.sleep(2000);
			w.findElement(By.name("user-name")).sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
//			w.findElement(By.name("password")).clear();
			w.findElement(By.name("password")).sendKeys(Keys.CONTROL,"a");
			Thread.sleep(2000);
			w.findElement(By.name("password")).sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);
//			w.navigate().refresh();
			
		}
	}
	
	@AfterClass
	public void browserclose() {
		
		
		w.quit();
	}
}
