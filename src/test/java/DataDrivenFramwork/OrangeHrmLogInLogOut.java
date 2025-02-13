package DataDrivenFramwork;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogInLogOut {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver w = new ChromeDriver();
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream fis = new FileInputStream("C:\\Users\\RAMESH\\Downloads\\automation data files\\OrangeHrmcredentials.xlsx");
		XSSFWorkbook search = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = search.getSheet("sheet1");
		for (int i = 1; i <=4; i++) {
			XSSFRow row = sheet1.getRow(i);
			XSSFCell UserName = row.getCell(0);
			XSSFCell Password = row.getCell(1);
			Thread.sleep(2000);
			w.findElement(By.name("username")).sendKeys(UserName.toString());
			w.findElement(By.name("password")).sendKeys(Password.toString());
			Thread.sleep(2000);
			w.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
			
			try {
				Thread.sleep(2000);
				w.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(2000);
				w.findElement(By.linkText("Logout")).click();
			} catch(Exception e) {
				w.navigate().refresh();
			}
		}

	}

}
