package CrossBrawser;

import java.lang.runtime.SwitchBootstraps;
import java.util.Set;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrawser {

	
		// TODO Auto-generated method stub
//	for grid
//		DesiredCapabilities dc;
//		RemoteWebDriver w;
	
		WebDriver w;
		@Parameters("browser")
		@Test
		
		public void flipkart(String browserValue) throws Exception {
			switch (browserValue) {
			case "chrome":
//				for grid
//				dc = new DesiredCapabilities();
//				dc.setPlatform(Platform.WINDOWS);
//				dc.setBrowserName("chrome");
//				w = new RemoteWebDriver(dc);
				
				w = new ChromeDriver();
				break;
			case "edge":
//				for grid
//				dc = new DesiredCapabilities();
//				dc.setPlatform(Platform.WINDOWS);
//				dc.setBrowserName("MicrosoftEdge");
//				w = new RemoteWebDriver(dc);
				
				w = new EdgeDriver();
				break;

			default:
				System.out.println("invalid browser has been selected "
						+ "that browser is non other than"+ browserValue +"Browser");
				break;
			}
			
			w.manage().window().maximize();
			w.get("https://www.flipkart.com/");
			w.findElement(By.cssSelector("input[class=\"Pke_EE\"]")).sendKeys("mobile", Keys.ENTER);
			Thread.sleep(1000);
			w.navigate().refresh();
			Thread.sleep(3000);
			
			w.findElement(By.cssSelector("img[class=\"DByuf4\"]")).click();
			
			String parent = w.getWindowHandle(); 
			Set<String> child = w.getWindowHandles();
			
			for(String c: child) {
				if(!c.equals(parent)) {
					w.switchTo().window(c);
					Thread.sleep(2000);
//					Actions act = new Actions(w);
					try {
						w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]")).click();
						
					} catch (Exception e) {
						// TODO: handle exception
						w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2 JTo6b7\"]")).click();
					}
				}
			}
			
		}

	}
