package POM;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoSaucedemoFlowTask {

	public RepoSaucedemoFlowTask(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	
//	Elements
	@FindBy(name = "user-name") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "login-button") WebElement loginbutton;
	@FindBy(name = "add-to-cart-sauce-labs-backpack") WebElement Addtocart;
	@FindBy(className = "shopping_cart_link") WebElement Cart;
	@FindBy(name = "checkout") WebElement checkout;
	@FindBy(name = "firstName") WebElement firstName;
	@FindBy(name = "lastName") WebElement lastName;
	@FindBy(name = "postalCode") WebElement postalCode;
	@FindBy(name = "finish") WebElement finish;
	@FindBy(name = "continue") WebElement continue1;
	@FindBy(linkText = "Logout") WebElement Logout;
	@FindBy(id = "react-burger-menu-btn") WebElement burgermenu;
	
	
	
	public void EnterUsername() {
		username.sendKeys("standard_user");
	}
	public void Enterpassword() {
		password.sendKeys("secret_sauce");
	}
	public void ClickonLogin() {
		loginbutton.click();
	}
	public void ClickonAddToCart() {
		Addtocart.click();
	}
	public void ClickonCart() {
		Cart.click();
	}
	public void ClickonChecout() {
		checkout.click();
	}
	public void Enterfirstname() {
		firstName.sendKeys("ram");
	}
	public void EnterlastName() {
		lastName.sendKeys("patil");
	}
	public void Enterpostalno() {
		postalCode.sendKeys("123311");
	}
	public void ClickonContinue() {
		continue1.click();
	}
	public void ClickonFinish() {
		finish.click();
	}
	public void ClickonBergerMenu() {
		burgermenu.click();
	}
	public void ClickonLogout() {
		Logout.click();
	}
	
}
