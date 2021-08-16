/**
 * 
 */
package PA.GlobalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class UpcomingconferenceGP extends TestBase {

	public UpcomingconferenceGP() {
		PageFactory.initElements(driver, this);
	}

	// Locators for video page
	@FindBy(xpath = "//span[contains(text(),'Resources')]")
	WebElement Resourcesmenuclick;

	// Actions

	public void resourcemenuclick() {
		// System.out.println("here");
		//Resourcesmenuclick.click();
		// driver.get("https://abm.report/resources/videos");
		String url = driver.getCurrentUrl();
		String newurl = url + "resources/videos";
		driver.get(newurl);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}
	
//	// Broken image code
//		public void brokenimagecode(WebDriver driver) throws Exception {
//
//			String url = "";
//			HttpURLConnection huc = null;
//			int respCode = 200;
//			Thread.sleep(1000);
//
//			List<WebElement> links = driver.findElements(By.xpath("/html/body/*/div/*//a/img"));
//			Thread.sleep(1000);
//			List<WebElement> srctext = driver.findElements(By.xpath("html/body/*/div/*//a/h4"));
//			
//			List<WebElement> texturl=driver.findElements(By.xpath("/html/body/*/div/*//a//img//parent::a//@href"));
//			
//
//			Iterator<WebElement> it = links.iterator();
//			Iterator<WebElement> txt = srctext.iterator();
//			Iterator<WebElement> urltxt = texturl.iterator();
//
//			while (it.hasNext()) {
//
//				url = it.next().getAttribute("src");
//
//				String text = txt.next().getText();
//				
//				
//		   String  url1=it.next().getText();
//				
//			
//				
//				if (url == null || url.isEmpty()) {
//					System.out.println("URL is either not configured for anchor tag or it is empty" + url);
//					continue;
//				}
//
//				if ((!url.contains("jpg")) && (!url.contains("png")) && (!url.contains("JPG")) && (!url.contains("PNG"))
//						&& (!url.contains("bmp")) && (!url.contains("jpeg")) && (!url.contains("dib"))) {
//					System.out.println("Broken images are:" + url);
//					System.out.println(text);
//					//System.out.println(ttext);
//				}
//
//				try {
//					huc = (HttpURLConnection) (new URL(url).openConnection());
//
//					huc.setRequestMethod("HEAD");
//
//					huc.connect();
//
//					respCode = huc.getResponseCode();
//
//					if (respCode >= 400) {
//						System.out.println(url + " is a broken link");
//						System.out.println(text);
//						System.out.println(url1);
//
//					} else {
//						// System.out.println(url + " is a valid link");
//					}
//
//				} catch (MalformedURLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//		
//		// Check broken image pagination click and get the page no.
//		public void brokenimagepaginationclick(WebDriver driver) throws Exception {
//
//			WebElement LastPage = driver.findElement(By.xpath("//li[9]"));
//			String Last = LastPage.getText();
//
//			Last = Last.replaceAll("[^0-9]", "");
//			Last.trim();
//
//			Integer last = Integer.valueOf(Last);
//			for (int j = 0; j <= last; j++) {
//				System.out.println("Page no is" + j);
//
//				// check if pagination link exists
//				brokenimagecode(driver);
//				List<WebElement> pagination = driver.findElements(By.xpath("//a[@aria-label='Next page']"));
//				if (pagination.size() > 0) {
//
//					for (int i = 0; i < pagination.size(); i++) {
//						pagination.get(i).click();
//						// WriteData(driver);
//					}
//				} else {
//					System.out.println("pagination not exists");
//					driver.close();
//				}
//			}
//		}


}
