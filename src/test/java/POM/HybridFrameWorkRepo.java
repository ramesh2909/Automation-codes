package POM;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridFrameWorkRepo {
	WebDriver w;
	String parentG;
	public HybridFrameWorkRepo(WebDriver wd) {
		PageFactory.initElements(wd, this);
		w = wd;
	}
	@FindBy(css = "input[placeholder=\"Search for products, brands and more\"]")
	WebElement search;
	@FindBy(className = "product-product") WebElement product;
	@FindBy(className = "size-buttons-unified-size") WebElement size;
	@FindBy(css = "div.pdp-add-to-bag.pdp-button.pdp-flex.pdp-center") WebElement addToBag;
	public void search(String product) {
		search.sendKeys(product, Keys.ENTER);
}
	public void Selectproduct() {
		product.click();
}
	public void clearSearch() {
		search.clear();
}
	public void SelectSize() {
		size.click();
}
	public void AddToBag() {
		addToBag.click();
}
	public void windowHandle() {
		String parent = w.getWindowHandle();
		parentG = parent;
		Set<String> child = w.getWindowHandles();
		for (String c : child) {
			if(!c.equals(parent)) {
				w.switchTo().window(c);
			}
		}
}
	public void switchToParent() {
		w.switchTo().window(parentG);
	}
}
