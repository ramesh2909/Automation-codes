package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {
//by alphabet capitalization order captal will fist exicutve case sensitive
	
	@Test 	

	public void facebook() {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");

	}
	@Test 

	public void Google() {
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.co.in/");
	}

	
	//by alphabet order abcd etc
		@Test 

		public void google() {
			WebDriver w = new ChromeDriver();
			w.get("https://www.google.co.in/");
		}

		@Test 	

		public void fakebook() {
			WebDriver w = new ChromeDriver();
			w.get("https://www.facebook.com/");

		}
		//by priority
		@Test (priority = 1)

		public void joogle() {
			WebDriver w = new ChromeDriver();
			w.get("https://www.google.co.in/");
		}

		@Test 	(priority = 2)

		public void tacebook() {
			WebDriver w = new ChromeDriver();
			w.get("https://www.facebook.com/u");

		}
	
	
	
	
}