package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test (invocationCount = 4)
	
	public void Google() {
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.co.in/");
		
	}
}
