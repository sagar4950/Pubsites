/**
 * 
 */
package PA.Globalpage.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PA.GlobalPages.Homepage;
import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class Homepagetest extends TestBase {

	Homepage hp;

	public Homepagetest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		hp = new Homepage();

	}

	@Test(enabled = false)
	public void HomepagetitleTest() throws InterruptedException {
		String title = hp.validateHomepageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "ABM Report | Comprehensive Reporting on the Account Based Marketing");

		// Homepage Logo validate

		boolean flag = hp.validatelogo();
		System.out.println(flag);
		Assert.assertTrue(flag);

		// Page Scroll
		hp.homepagescroll();

		// Footer Connects with us links click
		hp.Footerlinkvalidate();
		System.out.println("Footer link Clicked");

		// Footer Advertise with us link click
		hp.AdvertiseWithUs();
		System.out.println("Advertise with us link Clicked");

		// Footer Privacy link clicked.
		// hp.FooterPrivacy();
		// hp.Homepagewelcometext();

	}

	@Test(priority = 1)
	public void h2tagprop() {
		hp.findh2tag();
		hp.findh3tag();
		hp.findh4tag();
	}

}
