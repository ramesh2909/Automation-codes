package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryRepoFrontAccounting {
	
	public PageFactoryRepoFrontAccounting(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	
	@FindBy(name = "user_name_entry_field")// find element with any attribute
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "SubmitUser") 
	WebElement loginbtn;
	@FindBy(linkText = "Logout")
	WebElement logoutbtn;
	
	public void ClearUsername() {
		username.clear();
	}
	public void EnterUsername() {
		username.sendKeys("demouser");
	}
	public void Clearpassword() {
		password.clear();
	}
	public void EnterPasword() {
		password.sendKeys("password");
	}
	public void login() {
		loginbtn.click();
	}
	public void logout() {
		logoutbtn.click();
	}
}
