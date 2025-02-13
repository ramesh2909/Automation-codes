package Log4j;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FlipkartLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log = LogManager.getLogger();
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
		RemoteWebDriver w = new RemoteWebDriver(dc);
		
		
//		WebDriver w = new ChromeDriver();
		log.info("browser has been launch");
		w.get("https://www.flipkart.com/");
		log.info("user redirected to flipkart application ");
		w.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		log.info("search mobile in serach field");
		w.findElement(By.className("CGtC98")).click();
		log.info("click on first mobile on search list");
		String parent = w.getWindowHandle();
		Set<String> child = w.getWindowHandles();
		for (String c : child){
			if (!c.equals(parent)) {
				w.switchTo().window(c);
				try {
					w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]")).click();
					log.info("click on add to cart button");
				} catch (Exception e){
					log.error("add to cart option is not found");
					
				}
			}
				
			}
		}

}
