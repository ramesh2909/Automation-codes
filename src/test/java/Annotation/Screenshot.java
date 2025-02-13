package Annotation;
import org.openqa.selenium.io.FileHandler;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Screenshot {


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
			TakesScreenshot tss = (TakesScreenshot) w;
			FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\RAMESH\\eclipse-workspace\\AutomationFramwork\\src\\test\\java\\Screenshot\\"+user+".png"));
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
