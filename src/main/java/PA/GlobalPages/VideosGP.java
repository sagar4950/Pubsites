/**
 * @author Sagar.Nikam
 *
 */

package PA.GlobalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

public class VideosGP extends TestBase {

	public VideosGP() {
		PageFactory.initElements(driver, this);
	}

	// Locators for video page
	@FindBy(xpath = "//span[contains(text(),'Resources')]")
	WebElement Resourcesmenuclick;

	// Actions

	public void resourcemenuclick() {
		// System.out.println("here");
		Resourcesmenuclick.click();
		// driver.get("https://abm.report/resources/videos");
		String url = driver.getCurrentUrl();
		String newurl = url + "resources/videos";
		driver.get(newurl);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}
}