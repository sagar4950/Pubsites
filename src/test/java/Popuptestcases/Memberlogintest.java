/**
 * 
 */
package Popuptestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PA.base.TestBase;
import Popup.Memberlogin;

/**
 * @author sagar.nikam
 *
 */
public class Memberlogintest extends TestBase {

	Memberlogin mlogin;

	public Memberlogintest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		mlogin = new Memberlogin();
	}
	
	@Test
	public void MemebrloginTest()
	{
		mlogin.memberloginlinkclick();
		mlogin.memberemail();
		mlogin.memberpassword();
		mlogin.memberpopsignuplink();
	}
}
