/**
 * @author Sagar.Nikam
 *
 */

package PA.GlobalPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PA.base.TestBase;

public class Homepage extends TestBase {

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"navbar\"]/div/div[1]/a/img")
	WebElement Homelogo;

	@FindBy(xpath = "/html/body/app-root/app-footer/footer/div[1]/app-scroll-top/div/button")
	WebElement Scroll;

	@FindBy(xpath = "/html/body/app-root/app-footer/footer/div[1]/div[2]/div[4]/a[1]")
	WebElement FBlink;

	@FindBy(xpath = "/html/body/app-root/app-footer/footer/div[1]/div[2]/div[4]/a[2]")
	WebElement Twitterlink;

	@FindBy(xpath = "/html/body/app-root/app-footer/footer/div[1]/div[2]/div[4]/a[3]")
	WebElement Linkedinlink;

	@FindBy(xpath = "//p[contains(text(),'Advertise With Us')]")
	WebElement Footeradvwithus;

	@FindBy(xpath = "//p[contains(text(),'Privacy')]")
	WebElement FooterPrivacylink;

	@FindBy(xpath = "//p[contains(text(),'WELCOME TO The Manufacturing Report')]")
	WebElement Welcometitle;

	@FindBy(xpath = "//h2[contains(text(),'Spotlight')]")
	WebElement Spotlight;

	@FindBy(xpath = "//h2")
	WebElement h2tag;

	// Actions

	public String validateHomepageTitle() {
		return driver.getTitle();
	}

	public boolean validatelogo() {
		return Homelogo.isDisplayed();
	}

	public void homepagescroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// Scroll.click();
		System.out.println("Page is scroll down");
	}

	public void Footerlinkvalidate() throws InterruptedException {
		FBlink.click();
		System.out.println(driver.getCurrentUrl());
		Twitterlink.click();
		System.out.println(driver.getCurrentUrl());
		Linkedinlink.click();
		System.out.println(driver.getCurrentUrl());
	}

	public void AdvertiseWithUs() {
		Footeradvwithus.click();
	}

	public void Homepagewelcometext() {
		// String texts = driver.getTitle();
		// System.out.println(Welcometitle);
	}

	public void HomeSpotlight() {
		String ht = Spotlight.getCssValue("background-colour");
		System.out.println(ht);

	}

	public void findh2tag() {

		String TagToWorkWith = "h2"; // here simply change the tag name on which you want to work
		List<WebElement> myTags = driver.findElements(By.tagName(TagToWorkWith));

		// now extracting the vale
		// this for loop will print/extract all the values for tag 'H2'.
		System.out.println("-------------------- H2 Tags Property-----------------");
		for (int i = 0; i < myTags.size(); i++) {
			// extracting tags text

			System.out.println(TagToWorkWith + " value is : " + myTags.get(i).getText() + " Font Size is: "
					+ myTags.get(i).getCssValue("font-size") + " Font Family is: "
					+ myTags.get(i).getCssValue("font-family") + " Font Wetight is: "
					+ myTags.get(i).getCssValue("font-weight") + " Text Transform is: "
					+ myTags.get(i).getCssValue("text-transform"));

		}
	}

	public void findh3tag() {
		String TagToWorkWith = "h3"; // here simply change the tag name on which you want to work
		List<WebElement> myTags = driver.findElements(By.tagName(TagToWorkWith));

		// now extracting the vale
		// this for loop will print/extract all the values for tag 'H3'.
		System.out.println("-------------------- H3 Tags Property-----------------");
		for (int i = 0; i < myTags.size(); i++) {
			// extracting tags text
			System.out.println(TagToWorkWith + " value is : " + myTags.get(i).getText() + " Font Size is: "
					+ myTags.get(i).getCssValue("font-size") + " Font Family is: "
					+ myTags.get(i).getCssValue("font-family") + " Font Wetight is: "
					+ myTags.get(i).getCssValue("font-weight") + " Text Transform is: "
					+ myTags.get(i).getCssValue("text-transform"));

		}
	}

	public void findh4tag() {
		String TagToWorkWith = "h4"; // here simply change the tag name on which you want to work
		List<WebElement> myTags = driver.findElements(By.tagName(TagToWorkWith));

		// now extracting the vale
		// this for loop will print/extract all the values for tag 'H3'.
		System.out.println("-------------------- H4 Tags Property-----------------");
		for (int i = 0; i < myTags.size(); i++) {
			// extracting tags text
			System.out.println(TagToWorkWith + " value is : " + myTags.get(i).getText() + " Font Size is: "
					+ myTags.get(i).getCssValue("font-size") + " Font Family is: "
					+ myTags.get(i).getCssValue("font-family") + " Font Wetight is: "
					+ myTags.get(i).getCssValue("font-weight") + " Text Transform is: "
					+ myTags.get(i).getCssValue("text-transform"));

		}
	}
}
