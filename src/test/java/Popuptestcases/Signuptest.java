/**
 * 
 */
package Popuptestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PA.base.TestBase;
//import NA.pages.Articles;
//import NA.pages.TrendingnewsPage;
import Popup.Signup;

/**
 * @author sagar.nikam
 *
 */
public class Signuptest extends TestBase {

	Signup sign;

	public Signuptest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		sign = new Signup();
	}
	
	@Test
	public void clickonsignupmodel()
	{
		sign.Signupclick();
		sign.Signupdata();
		sign.ValidateSignuppoptext();
		sign.Popupclose();
		sign.Signupclick();
	}
}
