package POM;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class SauceDemoTask {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.saucedemo.com/");
		RepoSaucedemoFlowTask r = new RepoSaucedemoFlowTask(w);
		r.EnterUsername();
		r.Enterpassword();
		r.ClickonLogin();
		r.ClickonAddToCart();
		r.ClickonCart();
		r.ClickonChecout();
		r.Enterfirstname();
		r.EnterlastName();
		r.Enterpostalno();
		r.ClickonContinue();
		r.ClickonFinish();
		Thread.sleep(2000);
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\RAMESH\\eclipse-workspace\\AutomationFramwork\\src\\test\\java\\Screenshot\\src.png"));
		r.ClickonBergerMenu();
		Thread.sleep(2000);
		r.ClickonLogout();
		
	}

}
