package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccountingWithOutpageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		RepoOfFrontAccountWithOutpageFactory r = new RepoOfFrontAccountWithOutpageFactory(w);
		r.ClearUsername();
		r.EnterUername("demouser");
		r.ClearPassword();
		r.EnterPassword("password");
		r.Login();
		r.Logout();
		

	}

}
