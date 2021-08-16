/**
 * @author Sagar.Nikam
 *
 */

package PA.GlobalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

public class TrendingnewsGP extends TestBase {

	public TrendingnewsGP() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Resources')]")
	WebElement Resourcesmenuclick;

	@FindBy(xpath = "/html/body/*/div/*//a/img")
	WebElement newsimg;

	// Actions

	public void resourcemenuclick() {
		// driver.get("https://abm.report/news/trending-news");
		String url = driver.getCurrentUrl();
		String newurl = url + "news/trending-news";
		driver.get(newurl);
		System.out.println(newurl);
	}
}
