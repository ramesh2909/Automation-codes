package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parellelexecution {

	@Test 	

	public void facebook() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		w.findElement(By.id("pass")).sendKeys("1");
//		w.findElement(By.name("logi")).click();
		Thread.sleep(2000);
		w.close();

	}
	@Test 

	public void Google() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.co.in/");
//		w.findElement(By.id("APjFqb")).sendKeys("shoes", Keys.ENTER);
		Thread.sleep(2000);
		w.close();

	}
}
