/**
 * 
 */
package Popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class Memberlogin extends TestBase {

	public Memberlogin() {
		PageFactory.initElements(driver, this);
	}

	// Memeber login popup locators
	@FindBy(xpath = "//a[contains(text(),'Member Login')]")
	WebElement Memberlogin;

	@FindBy(id = "txtEmailLogin")
	WebElement MemberEmail;

	@FindBy(id = "txtPasswordLogin")
	WebElement MemberPassword;

	@FindBy(xpath = "//span[contains(text(),'Sign Up')]")
	WebElement Memberpopsignuplink;

	// Member login popup open
	public void memberloginlinkclick() {
		Memberlogin.click();
	}

	public void memberemail() {
		MemberEmail.sendKeys("Sagar@nathanark.com");
	}

	public void memberpassword() {
		MemberPassword.sendKeys("12345678");
	}

	public void memberpopsignuplink() {
		Memberpopsignuplink.click();
	}
}
