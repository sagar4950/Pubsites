package Popup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class Signup extends TestBase {

//	private static final org.testng.Assert Assert = null;

	public Signup() {
		PageFactory.initElements(driver, this);
	}

	// LOCATORS SIGNUP POPUP

	@FindBy(xpath = "//a[contains(text(),'Signup')]")
	WebElement Signup;

	@FindBy(xpath = "//input[@id='firstnameSignup']")
	WebElement Firstname;

	@FindBy(xpath = "//input[@id='lastnameSignup']")
	WebElement Lastname;

	@FindBy(xpath = "//input[@id='emailSignup']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='passwordSignup']")
	WebElement Password;

	@FindBy(xpath = "//input[@id='confirmPasswordSignup']")
	WebElement Confirmpassword;

	@FindBy(xpath = "//*[@id=\"memberSignupModalCenter\"]/div/div/div/form/div[4]/select")
	WebElement Choicedropdown;

	@FindBy(id = "accepttermsSignup")
	WebElement Termscheckbox;

	@FindBy(xpath = "//input[@id='firstnameSignup']")
	WebElement Termsofserviceclicksignup;

	@FindBy(xpath = "//input[@id='firstnameSignup']")
	WebElement Privacyploicyclicksignup;

	@FindBy(xpath = "//*[@id=\"memberSignupModalCenter\"]/div/div/div/form/button")
	WebElement Submitsignup;

	@FindBy(xpath = "//p[contains(text(),'Please use a')]")
	WebElement Signupuseralreadyexist;

	@FindBy(xpath = "//p[2][contains(text(),'Sign up')]")
	WebElement Signuppoptxt;

	@FindBy(xpath = "//app-header/app-member-signup-pop[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement popclose;

	@FindBy(xpath = "")
	WebElement Homelogo;

	public void Signupclick() {
		Signup.click();
	}

	// SIGNUP FORM DATA
	public void Signupdata() {
		Firstname.sendKeys("Sagar");
		Lastname.sendKeys("Nikam");
		Email.sendKeys("Sagar@nathanark.com");
		Password.sendKeys("12345678");
		Confirmpassword.sendKeys("12345678");
		WebElement testDropDown = Choicedropdown;
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(1);
		Termscheckbox.click();
		Submitsignup.click();
		String Signupuserexisttext = Signupuseralreadyexist.getText();
		System.out.println(Signupuserexisttext);
		String Signuppopuptext = Signuppoptxt.getText();
		System.out.println(Signuppopuptext);

	}

	// VALIDATE SIGNUP POPUP TEXT

	public void ValidateSignuppoptext() {
		String Signuppopuptext = Signuppoptxt.getText();

		String expectedresult = "Sign up to contribute and publish your news, events, brand, and content with the community for FREE";
		org.testng.Assert.assertEquals(expectedresult, Signuppopuptext);
	}

	// SIGNUP POPUP CLOSE
	public void Popupclose() {
		popclose.click();
	}
}
