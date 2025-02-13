package Annotation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderFlipkart {

	
		
		WebDriver w;
		
		@BeforeClass
		public void browserlaunch() {
			w = new ChromeDriver();
			w.get("https://www.flipkart.com/");
		}
		
		@Test (dataProviderClass = DataProviderDataForFlipkart.class, dataProvider ="flipkart")
		public void search (String search) throws Exception{
			w.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a");
			Thread.sleep(2000);
			w.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE,Keys.ENTER);
			Thread.sleep(2000);
			w.findElement(By.name("q")).sendKeys(search, Keys.ENTER);
		}
		
		@AfterClass
		public void browserclose() {
			w.quit();
		}
	}
	

