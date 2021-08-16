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
public class Newsletter extends TestBase {

	public Newsletter() {
		PageFactory.initElements(driver, this);
	}

	// NEWSLETTER POPUP LOCATORS

	@FindBy(id = "opennewsletterPopupButton")
	WebElement Newspop;

	@FindBy(xpath = "//input[@id='txtEmailNewsLetter']")
	WebElement Newsemail;

	@FindBy(xpath = "//input[@id='newsAcceptTerms']")
	WebElement Newsterms;

	@FindBy(xpath = "//*[@id=\"exampleModalCenter\"]/div/div/div/form/button")
	WebElement Newssubmit;

	public void newsletterpopclick() {
		Newspop.click();
	}

	// Newsletter send email filed data
	public void newsletteremailsend() {
		Newsemail.sendKeys("Sagar@nathanark.com");
	}

	// Newsletter terms and condition click
	public void newsterms() {
		Newsterms.click();
	}

	// Newsletter click on submit button.
	public void newssubmit() {
		Newssubmit.click();
	}
}
