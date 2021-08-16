/**
 * @author Sagar.Nikam
 *
 */

package PA.GlobalPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;


public class WhitepapersGP extends TestBase {

	public WhitepapersGP() {
		PageFactory.initElements(driver, this);
	}
    
	// Locators of Whitepaper page
	@FindBy(xpath = "//span[contains(text(),'Resources')]")
	WebElement Resourcesmenuclick;

//	@FindBy(xpath = "//a[text()=\\\"Read More\\\"]\"")
//	WebElement Readmore;
	// Actions

	public void WPresourcemenuclick() {
		// System.out.println("here");
		Resourcesmenuclick.click();
		// driver.get("https://abm.report/resources/whitepapers");
		String url = driver.getCurrentUrl();
		String newurl = url + "resources/whitepapers";
		driver.get(newurl);

		String currenturl = driver.getCurrentUrl();

		System.out.println(currenturl);

	}
}
