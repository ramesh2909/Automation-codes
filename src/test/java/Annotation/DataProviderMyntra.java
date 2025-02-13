package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderMyntra {


	WebDriver w;
	
	@BeforeClass
	public void browserlaunch() {
		w = new ChromeDriver();
		w.get("https://www.myntra.com/");
	}
	
	@Test (dataProviderClass = DataProviderForMyntra.class, dataProvider ="myntra")
	public void search (String search) throws Exception{
//		w.findElement(By.className("desktop-searchBar")).sendKeys(Keys.CONTROL,"a");
//		Thread.sleep(2000);
//		w.findElement(By.className("desktop-searchBar")).sendKeys(Keys.BACK_SPACE,Keys.ENTER);
		Thread.sleep(2000);
		w.findElement(By.className("desktop-searchBar")).clear();
		Thread.sleep(2000);
		w.findElement(By.className("desktop-searchBar")).sendKeys(search, Keys.ENTER);
	
	}
	
	@AfterClass
	public void browserclose() {
		w.quit();
	}
}
