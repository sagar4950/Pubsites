/**
 * @author Sagar.Nikam
 *
 */

package PA.GlobalPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

public class WebinarsGP extends TestBase {

	int cell = 0;
	int RowNum = 0;

	public WebinarsGP() {
		PageFactory.initElements(driver, this);
	}

	// Locators of Webinars page
	@FindBy(xpath = "/html/body/app-root/div/app-resources/app-globel-resources/*//a/img")
	WebElement imagegroup;

	public void webinatrsmenuclick() {
		String url = driver.getCurrentUrl();
		String newurl = url + "resources/webinars";
		driver.get(newurl);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

	// Broken images excelsheet data store
	public void Brokenimagesheet(WebDriver driver, String url, int RowNum, String SheetName) throws IOException {
		int cell = 0;

		String File = "D:\\Pubsites Automation\\AutoPubsites\\Testdata\\Brokenimagesheet.xlsx";
		File file = new File(File);
		FileInputStream inputStream = new FileInputStream(file);
		// Workbook wb= WorkbookFactory.create(new File(inputStream));
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet(SheetName);
		sheet.createRow(RowNum).createCell(cell);
		Row row = sheet.getRow(RowNum);
		Cell Cell = row.getCell(cell);
		// System.out.println(RowNum + "row no " + cell + "Cell no");
		Cell.setCellValue(url);
		FileOutputStream outputStream = new FileOutputStream(File);
		wb.write(outputStream);
	}

	// Check broken image pagination click and get the page no.

}
