/**
 * 
 */
package PA.Globalpage.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Comman.Commanfunctions;
import PA.GlobalPages.UpcomingconferenceGP;
import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class UpcomingconferenceGPTest extends TestBase {

	UpcomingconferenceGP Upco;
	Commanfunctions Cfn;

	public UpcomingconferenceGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		Upco = new UpcomingconferenceGP();
		Cfn = new Commanfunctions();
	}

	@Test
	public void Upcomingconferencesbrokenimg() throws Exception {
		Upco.resourcemenuclick();
		Cfn.brokenimagepaginationclick(driver);
	}
}
