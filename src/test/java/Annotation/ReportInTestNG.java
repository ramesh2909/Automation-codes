package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportInTestNG {
	@Test
	public void flipkart() {
		WebDriver w = new ChromeDriver();
		Reporter.log("Browser has been launch");
		w.get("https://www.flipkart.com/");
		Reporter.log("site has been open");
		w.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		Reporter.log("Enter product in search");
		w.findElement(By.className("CGtC98")).click();
		Reporter.log("first product has been selected");
		
		
	}

}
