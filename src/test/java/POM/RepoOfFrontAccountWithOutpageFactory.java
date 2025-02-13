package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoOfFrontAccountWithOutpageFactory  {

	WebDriver w;
	public RepoOfFrontAccountWithOutpageFactory(WebDriver wd) {
		
		w = wd;
		
	}
//	Element
	By username = By.name ("user_name_entry_field");
	By password = By.name ("password");
	By loginbtn = By.name ("SubmitUser");
	By logoutbtn = By.linkText("Logout");
//	set of action
	public void ClearUsername() {
		w.findElement(username).clear();
	}
	public void EnterUername(String user) {
		w.findElement(username).sendKeys(user);
	}
	public void ClearPassword() {
		w.findElement(password).clear();
	}
	public void EnterPassword(String pass) {
		w.findElement(password).sendKeys(pass);
	}
	public void Login() {
		w.findElement(loginbtn).click();
	}
	public void Logout() {
		w.findElement(logoutbtn).click();
	}
}
