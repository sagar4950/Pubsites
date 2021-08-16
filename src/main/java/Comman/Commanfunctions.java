/**
 * @author Sagar.Nikam
 *
 */

package Comman;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

public class Commanfunctions extends TestBase {

	int cell = 0;
	int RowNum = 0;

	public Commanfunctions() {
		PageFactory.initElements(driver, this);
	}

	// Readmorelink Click Function

	public void Readmorelink(WebDriver driver, String SheetName) throws IOException {
		// int SheetNo=0;
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[text()=\"Read More\"]"));
		System.out.println("The number of links is " + allLinks.size());
		Actions actions = new Actions(driver);
		// Traversing through the list and printing its text along with link address
		for (WebElement link : allLinks) {
			actions.moveToElement(link).click().build().perform();
			Windowsswitch(driver, RowNum, SheetName);

			RowNum = RowNum + 1;
			// paginationcode(driver);

		}
		paginationclick(driver, SheetName);
	}

	// Watch Now Click function

	public void Watchnowlink(WebDriver driver, String SheetName) throws IOException, InterruptedException {
//		WebDriverWait w= new WebDriverWait(driver,50);

		List<WebElement> allLinks = driver.findElements(By.xpath("//a[contains(text(),'Watch Now')]"));
		System.out.println("The number of links is " + allLinks.size());
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Watch
		// Now')]")));

		// Thread.sleep(10000);
		Actions actions = new Actions(driver);

		// Traversing through the list and printing its text along with link address
		for (WebElement link : allLinks) {
			actions.moveToElement(link).click().build().perform();
			// link.click();
			Windowsswitch(driver, RowNum, SheetName);
			RowNum = RowNum + 1;
			// paginationcode(driver);
		}
		paginationclickvideos(driver, SheetName);
	}

	// Windows Switch Function
	public void Windowsswitch(WebDriver driver, int RowNum, String SheetName) throws IOException {

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				String linkUrl = driver.switchTo().window(child_window).getCurrentUrl();
				System.out.println(linkUrl);

				Exceldata exe = new Exceldata();
				exe.createsheet(driver, linkUrl, RowNum, SheetName);

				// Servererrorexcel(driver,linkUrl,RowNum);
				// Objecterrorexcel(driver,linkUrl,RowNum);
				// RowNum= RowNum+1;

				driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);

	}

	// Pagination Click
	public void paginationclick(WebDriver driver, String SheetName) throws IOException {

		List<WebElement> pagination = driver.findElements(By.xpath("//a[@aria-label='Next page']"));
		// checkif pagination link exists

		if (pagination.size() > 0) {
			// System.out.println("pagination exists");
			// click on pagination link

			for (int i = 0; i < pagination.size(); i++) {
				pagination.get(i).click();

				Readmorelink(driver, SheetName);
				// WriteData(driver);
			}
		} else {

			System.out.println("pagination not exists");

		}
	}

	public void paginationclickvideos(WebDriver driver, String SheetName) throws IOException, InterruptedException {

		List<WebElement> pagination = driver.findElements(By.xpath("//a[@aria-label='Next page']"));
		// checkif pagination link exists

		if (pagination.size() > 0) {
			// System.out.println("pagination exists");
			// click on pagination link

			for (int i = 0; i < pagination.size(); i++) {
				pagination.get(i).click();

				Watchnowlink(driver, SheetName);
				// WriteData(driver);
			}
		} else {
			System.out.println("pagination not exists");
		}
	}

	// Check broken image pagination click and get the page no.
	public void brokenimagepaginationclick(WebDriver driver) throws Exception {

		WebElement LastPage = driver.findElement(By.xpath("//li[9]"));
		String Last = LastPage.getText();

		Last = Last.replaceAll("[^0-9]", "");
		Last.trim();

		Integer last = Integer.valueOf(Last);
		for (int j = 0; j <= last; j++) {
			System.out.println("Page no is" + j);

			// check if pagination link exists
			brokenimagecode(driver);
			List<WebElement> pagination = driver.findElements(By.xpath("//a[@aria-label='Next page']"));
			if (pagination.size() > 0) {

				for (int i = 0; i < pagination.size(); i++) {
					pagination.get(i).click();
					// WriteData(driver);
				}
			} else {
				System.out.println("pagination not exists");
				driver.close();
			}
		}
	}

	// Broken image code
	public void brokenimagecode(WebDriver driver) throws Exception {

		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		Thread.sleep(1000);

		List<WebElement> links = driver.findElements(By.xpath("/html/body/*/div/*//a/img"));
		Thread.sleep(1000);
		List<WebElement> srctext = driver.findElements(By.xpath("html/body/*/div/*//a/h4"));

		Iterator<WebElement> it = links.iterator();
		Iterator<WebElement> txt = srctext.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("src");

			String text = txt.next().getText();

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty" + url);
				continue;
			}

			if ((!url.contains("jpg")) && (!url.contains("png")) && (!url.contains("JPG")) && (!url.contains("PNG"))
					&& (!url.contains("bmp")) && (!url.contains("jpeg")) && (!url.contains("dib"))) {
				System.out.println("Broken images are:" + url);
				System.out.println(text);
			}

			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				respCode = huc.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
					System.out.println(text);

				} else {
					// System.out.println(url + " is a valid link");
				}

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
