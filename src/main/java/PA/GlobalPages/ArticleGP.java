/**
 * @author Sagar.Nikam
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
public class ArticleGP extends TestBase {

	// Page factory @FindBy annotation by OR
	int cell = 0;
	int RowNum = 0;
	@FindBy(xpath = "//span[contains(text(),'Resources')]")
	WebElement Resourcesmenuclick;

	@FindBy(xpath = "//a[text()=\\\"Read More\\\"]\"")
	WebElement Readmore;

	@FindBy(xpath = "//body[contains(text(),'The remote server returned an error: (500) Internal Server Error.')]")
	WebElement servererror;

	// Intilalize the page Objects
	public ArticleGP() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void resourcemenuclick() {
		Resourcesmenuclick.click();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

}
