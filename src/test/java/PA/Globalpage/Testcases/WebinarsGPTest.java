/**
 * 
 */
package PA.Globalpage.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Comman.Commanfunctions;
import PA.GlobalPages.WebinarsGP;
import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class WebinarsGPTest extends TestBase {

	WebinarsGP web;
	Commanfunctions Cfn;

	public WebinarsGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		web = new WebinarsGP();
		Cfn = new Commanfunctions();
	}

	@Test(enabled = false)
	public void WebinarsTest() throws Exception {
		web.webinatrsmenuclick();
		// web.brokenimagepaginationclick(driver);
		Cfn.brokenimagepaginationclick(driver);

		// Cfn.brokenimagepaginationclick(driver);

	}

}
