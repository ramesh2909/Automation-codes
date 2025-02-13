package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryFrontAccounting {

	public static
	
	void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		PageFactoryRepoFrontAccounting r = new PageFactoryRepoFrontAccounting(w);
		r.ClearUsername();
		r.EnterUsername();
		r.Clearpassword();
		r.EnterPasword();
		r.login();
		r.logout();
		
	}

}
