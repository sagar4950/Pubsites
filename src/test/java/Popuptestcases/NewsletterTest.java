/**
 * 
 */
package Popuptestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PA.base.TestBase;
import Popup.Newsletter;

/**
 * @author sagar.nikam
 *
 */
public class NewsletterTest extends TestBase {
	
	Newsletter news;

	public NewsletterTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		news = new Newsletter();
	}

//	@Test
//	public void newsletterpopvalidtest()
//	{
//		news.newsletterpopclick();
//		news.newsletteremailsend();
//		news.newsterms();
//		news.newssubmit();
//	}
	
	@Test(priority=1)
	public void newsletterpopwithouttandc()
	{
	news.newsletterpopclick();
	news.newsletteremailsend();
	news.newssubmit();
	}

	
}
