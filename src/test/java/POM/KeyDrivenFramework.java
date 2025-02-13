package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyDrivenFramework {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver w = new ChromeDriver();
		w.get("https://www.myntra.com/");
		KeyDrivenFrameworkRepo r = new KeyDrivenFrameworkRepo(w);
		FileInputStream fis = new FileInputStream("C:\\Users\\RAMESH\\Downloads\\KeyDrivenFramwork.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for(int i = 1; i<= 4; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell steps = row.getCell(0);
			switch (steps.toString()) {
			case "search":
				r.search("Egoss");
				break;
			case "Select product":
				r.Selectproduct();
				break;
			case "Select Size":
				r.windowHandle();
				r.SelectSize();
				break;
			case "Click on add to bag":
				r.AddToBag();
				break;

			default:
				System.out.println("error has been found");
				break;
			}
		}

	}

}
