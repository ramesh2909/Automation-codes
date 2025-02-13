package BDD_Cucumber;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FrontAccounting {

	WebDriver w;
	
		
		@Given("open chrome browser and go to provided site")
		public void open_chrome_browser_and_go_to_provided_site() {
			w = new ChromeDriver();
			w.get("https://demo.frontaccounting.eu/");
		}

		@Given("user should login")
		public void user_should_login() {
		  w.findElement(By.name("SubmitUser")).click();
		}

		@When("user click on sales quotation option")
		public void user_click_on_sales_quotation_option() {
		   w.findElement(By.linkText("Sales Quotation Entry")).click();
		}

		@When("user click on cancel quotation button")
		public void user_click_on_cancel_quotation_button() {
		    w.findElement(By.name("CancelOrder")).click();
		}

		@When("user click on ok on alert window")
		public void user_click_on_ok_on_alert_window() {
		    Alert alt = w.switchTo().alert();
		    alt.accept();
		}

		@Then("validate cancel option has been clicked And move to the another page")
		public void validate_cancel_option_has_been_clicked_and_move_to_the_another_page() {
		   Assert.assertEquals("This sales quotation has been cancelled as requested.",
				   w.findElement(By.className("note_msg")).getText());
		}

	}


