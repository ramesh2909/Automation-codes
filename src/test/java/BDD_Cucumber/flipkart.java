package BDD_Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flipkart {
WebDriver w;

@Given("launch chrome browser and go to flipkart")
public void launch_chrome_browser_and_go_to_flipkart() {
//	w = new ChromeDriver();
//    w.manage().window().maximize();
//    w.get();
}

@Then("i verify the movies has been \"Showing {int} – {int} of {int} results for {string}\"")
public void i_verify_the_movies_has_been_showing_of_results_for(Integer int1, Integer int2, Integer int3, String string) {
    
}

















@Given("launch chrome browser and go to jiocenema")
public void launch_chrome_browser_and_go_to_jiocenema() {
    
}

@When("click on search option {string}")
public void click_on_search_option(String search) throws Exception {
	  Thread.sleep(2000);
	  w.findElement(By.cssSelector("input[id=\"searchInputBox\"]")).click();
    Thread.sleep(2000);
    	w.findElement(By.cssSelector("input[placeholder=\"Movies, Shows and more\"]")).sendKeys(search,Keys.ENTER);
}

@Then("i verify the movies has been \"Top Results for \"jab we met\"\"")
public void i_verify_the_movies_has_been_top_results_for_jab_we_met() throws Exception {
	Thread.sleep(2000);
	Assert.assertEquals("Top Results for \"jab we met\"", w.findElement(By.xpath("//h2[normalize-space()='Top Results for \"jab we met\"']")).getText());
}

@Then("i verify the movies has been \"Top Results for \"ismart\"\"")
public void i_verify_the_movies_has_been_top_results_for_ismart() throws Exception {
	Thread.sleep(2000);
	Assert.assertEquals("Top Results for \"ismart\"", w.findElement(By.xpath("//h2[normalize-space()='Top Results for \"ismart\"']")).getText());
}



}
