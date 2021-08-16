/**
 * @author Sagar.Nikam
 *
 */

package PA.GlobalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

public class FeacturenewsGP extends TestBase {

	public FeacturenewsGP() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Resources')]")
	WebElement Resourcesmenuclick;

//	@FindBy(xpath = "//a[text()=\\\"Read More\\\"]\"")
//	WebElement Readmore;
	// Actions

	public void resourcemenuclick() {
		// System.out.println("here");
		// Resourcesmenuclick.click();
		// driver.get("https://abm.report/news/featured-news");
		String url = driver.getCurrentUrl();
		String newurl = url + "news/featured-news";
		driver.get(newurl);

		String currenturl = driver.getCurrentUrl();

		System.out.println(currenturl);

	}

//	public void Watchnowlink(WebDriver driver) throws IOException, InterruptedException {
//		List<WebElement> allLinks = driver.findElements(By.xpath("//a[text()=\"Read More\"]"));
//		System.out.println("The number of links is " + allLinks.size());
//		Thread.sleep(10000);
//
//		// Traversing through the list and printing its text along with link address
//		for (WebElement link : allLinks) {
//			link.click();
//			Windowsswitch(driver);
//			// paginationcode(driver);
//		}
//		paginationclick(driver);
//	}
//
//	public void Windowsswitch(WebDriver driver) {
//		// It will return the parent window name as a String
//		String parent = driver.getWindowHandle();
//
//		Set<String> s = driver.getWindowHandles();
//
//		// Now iterate using Iterator
//		Iterator<String> I1 = s.iterator();
//
//		while (I1.hasNext()) {
//
//			String child_window = I1.next();
//
//			if (!parent.equals(child_window)) {
//				driver.switchTo().window(child_window);
//
//				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
//
//				driver.close();
//			}
//
//		}
//		// switch to the parent window
//		driver.switchTo().window(parent);
//
//	}
//
//	public void paginationclick(WebDriver driver) throws IOException, InterruptedException {
//
//		WebElement page = driver
//				.findElement(By.xpath("//li[4]//span[@class=\"show-for-sr\"and contains(text(),'page')]"));
//
//		List<WebElement> pagination = driver.findElements(By.xpath("//a[@aria-label='Next page']"));
//		// checkif pagination link exists
//
//		if (pagination.size() > 0) {
//			// System.out.println("pagination exists");
//			// click on pagination link
//
//			for (int i = 0; i < pagination.size(); i++) {
//
//				if (page.isEnabled()) {
//
//					pagination.get(i).click();
//
//					Watchnowlink(driver);
//					// WriteData(driver);
//
//				} else {
//
//					System.out.println("pagination not exists");
//					String url[] = { "https://cloud.report/resources/articles",
//							"https://channel.report/resources/articles" };
//					for (int j = 0; j < url.length; j++) {
//						driver.get(url[j]);
//						Watchnowlink(driver);
//					}
//				}
//			}
//		}
//	}

}
