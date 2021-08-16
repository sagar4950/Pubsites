/**
 * @author Sagar.Nikam
 *
 */


package Comman;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

public class Exceldata extends TestBase {

	public Exceldata() throws IOException {
		PageFactory.initElements(driver, this);

	}

	// Server 500 error function
	public void Servererrorexcel(WebDriver driver, String linkUrl, int RowNum) throws IOException {
		String expectedHeading = "The remote server returned an error: (500) Internal Server Error.";
		// WebElement e= driver.findElement(By.xpath("//body[contains(text(),'The remote
		// server returned an error: (500) Internal Server Error.')]"));
		WebElement e = driver.findElement(By.xpath("//body"));
		// System.out.print(driver.getPageSource());
		// e.getText();
		String s = e.getText();
		// System.out.println(s);
		if (s.contains(expectedHeading)) {
			System.out.println(linkUrl + "Fail URL");

			int cell = 0;

			String File = "D:\\Pubsites Automation\\AutoPubsites\\Testdata\\Articles.xlsx";
			File file = new File(File);
			FileInputStream inputStream = new FileInputStream(file);
			// Workbook wb= WorkbookFactory.create(new File(inputStream));
			XSSFWorkbook wb = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = wb.getSheet("Servererror");
			sheet.createRow(RowNum).createCell(cell);

			Row row = sheet.getRow(RowNum);

//			 Row rowHeading = sheet.createRow(0);
//		     rowHeading.createCell(0).setCellValue("URL");

			Cell Cell = row.getCell(cell);
			System.out.println(RowNum + "row no " + cell + "Cell no");
			Cell.setCellValue(linkUrl);
			FileOutputStream outputStream = new FileOutputStream(File);
			wb.write(outputStream);
			// wb.close();
		} else {
			System.out.println(linkUrl + "Pass URL");
		}

	}

	// Create Excelsheet data
	public void createsheet(WebDriver driver, String linkUrl, int RowNum, String SheetName) throws IOException {
		int cell = 0;

		String File = "D:\\Pubsites Automation\\AutoPubsites\\Testdata\\Articles.xlsx";
		File file = new File(File);
		FileInputStream inputStream = new FileInputStream(file);
		// Workbook wb= WorkbookFactory.create(new File(inputStream));
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet(SheetName);
		sheet.createRow(RowNum).createCell(cell);

		Row row = sheet.getRow(RowNum);

//		 Row rowHeading = sheet.createRow(0);
//	     rowHeading.createCell(0).setCellValue("URL");

		Cell Cell = row.getCell(cell);
		System.out.println(RowNum + "row no " + cell + "Cell no");
		Cell.setCellValue(linkUrl);
		FileOutputStream outputStream = new FileOutputStream(File);
		wb.write(outputStream);
		// wb.close();

	}

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

//		 Row rowHeading = sheet.createRow(0);
//	     rowHeading.createCell(0).setCellValue("URL");

		Cell Cell = row.getCell(cell);
		System.out.println(RowNum + "row no " + cell + "Cell no");
		Cell.setCellValue(url);
		FileOutputStream outputStream = new FileOutputStream(File);
		wb.write(outputStream);
		// wb.close();

	}

	// Objecterorr data sheet
//	private void Objecterrorexcel(WebDriver driver, String linkUrl, int RowNum) throws IOException {
//		// TODO Auto-generated method stub
//		String ojbecturl = "The remote server returned an error: (500) Internal Server Error.";
//		// WebElement e= driver.findElement(By.xpath("//body[contains(text(),'The remote
//		// server returned an error: (500) Internal Server Error.')]"));
//		WebElement e = driver.findElement(By.xpath("//body"));
//		// System.out.print(driver.getPageSource());
//		// e.getText();
//		String s = e.getText();
//		// System.out.println(s);
//		if (s.contains(ojbecturl)) {
//			System.out.println(linkUrl + "Fail URL");
//
//			int cell = 0;
//
//			String File = "D:\\Pubsites Automation\\AutoPubsites\\Testdata\\Articles.xlsx";
//			File file = new File(File);
//			FileInputStream inputStream = new FileInputStream(file);
//			// Workbook wb= WorkbookFactory.create(new File(inputStream));
//			XSSFWorkbook wb = new XSSFWorkbook(inputStream);
//			XSSFSheet sheet = wb.getSheet("Ojjecturl");
//			sheet.createRow(RowNum).createCell(cell);
//
//			Row row = sheet.getRow(RowNum);
//
////			 Row rowHeading = sheet.createRow(0);
////		     rowHeading.createCell(0).setCellValue("URL");
//
//			Cell Cell = row.getCell(cell);
//			System.out.println(RowNum + "row no " + cell + "Cell no");
//			Cell.setCellValue(linkUrl);
//			FileOutputStream outputStream = new FileOutputStream(File);
//			wb.write(outputStream);
//			// wb.close();
//
//		} else {
//			System.out.println(linkUrl + "Pass URL");
//		}
//
//	}

}
