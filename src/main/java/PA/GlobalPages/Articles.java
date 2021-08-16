/**
 * @author Sagar.Nikam
 *
 */

package PA.GlobalPages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PA.base.TestBase;

public class Articles extends TestBase{

//	@FindBy(xpath = "//a[1]")
//	WebElement Resourcesmenuclick;
//	
	
	public void Linkcheck() throws InterruptedException
	{
		WebElement LastPage= driver.findElement(By.xpath("//li[9]"));
        
	       String Last=LastPage.getText();
	    
	       Last= Last.replaceAll("[^0-9]", "");
	       Last.trim();
	    
	       Integer last= Integer.valueOf(Last);

		for (int j = 0; j <= last; j++) {

			// This line will print the number of links and the count of links.
			Thread.sleep(5000);
			List<WebElement> aTag = driver.findElements(By.xpath("//a[1]"));
			System.out.println("No of links are " + aTag.size());

			// checking the links fetched.
			for (int i = 0; i < aTag.size(); i++) {
				WebElement E1 = aTag.get(i);

				String url = E1.getAttribute("href");

				verifyLinks(url);

			}
			List<WebElement> pagination = driver.findElements(By.xpath("//a[@aria-label='Next page']"));
			// check if pagination link exists

			if (pagination.size() > 0) {
				// System.out.println("pagination exists");
				// click on pagination link

				for (int i = 0; i < pagination.size(); i++) {
					pagination.get(i).click();

				}
			} else {
				System.out.println("pagination not exists");
			}

		}
			
	}
	
	public static void verifyLinks(String linkUrl) {
		String TestUrl = "https://abm.report/articles/";
		String Article = "https://abm.report/guest-articles/";
		try {

			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(4000);
			httpURLConnect.connect();
			if (linkUrl.contains(TestUrl) || linkUrl.contains(Article)) {

				if (httpURLConnect.getResponseCode() >= 400) {

					System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");

				}
				// Fetching and Printing the response code obtained
				else {
					System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());

				}
			}

		} catch (Exception e) {
		}

	}
	
}
