package POM;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hybridDrivenFramWork {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver w = new ChromeDriver();
		w.get("https://www.myntra.com/");
		HybridFrameWorkRepo r = new HybridFrameWorkRepo(w);
		FileInputStream fis = new FileInputStream("C:\\Users\\RAMESH\\Downloads\\HybridDrivenFramwork.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		
		for (int j=1; j<=5; j++) {
			XSSFRow rowdata = sheet.getRow(j);
			XSSFCell testdata = rowdata.getCell(0);
		for(int i = 1; i<= 4; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell steps = row.getCell(1);
			switch (steps.toString()) {
			case "search":
				r.clearSearch();
				r.search(testdata.toString());
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
				w.close();
				r.switchToParent();
				break;

			default:
				System.out.println("error has been found");
				break;
			}
		}

	}

	}

}
