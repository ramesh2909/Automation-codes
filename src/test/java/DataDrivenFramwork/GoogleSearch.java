package DataDrivenFramwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.css.model.CSSStyleSheetHeader;

public class GoogleSearch {
	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\RAMESH\\Downloads\\automation data files\\GoogleSearchData.xlsx");
		XSSFWorkbook search = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = search.getSheet("sheet1");
		for (int i = 1; i <=8; i++) {
			XSSFRow row = sheet1.getRow(i);
			XSSFCell sea = row.getCell(0);
			w.get("https://www.google.co.in/");
			Thread.sleep(2000);
			w.findElement(By.id("APjFqb")).sendKeys(sea.toString(), Keys.ENTER);
			Thread.sleep(2000);
		}
	}

}
