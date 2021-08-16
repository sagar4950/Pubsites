/**
 * 
 */
package PA.Globalpage.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Comman.Commanfunctions;
import PA.GlobalPages.TrendingnewsGP;
import PA.GlobalPages.WebinarsGP;
import PA.base.TestBase;
/**
 * @author sagar.nikam
 *
 */
public class TrendingnewsGPTest extends TestBase {
	TrendingnewsGP Tre;
	Commanfunctions Cfn;
	WebinarsGP web;

	public TrendingnewsGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		Tre = new TrendingnewsGP();
		Cfn = new Commanfunctions();
		
	}

	@Test(enabled=false)
	public void Treadingtest() throws Exception {
		Tre.resourcemenuclick();
		Cfn.Readmorelink(driver, "TreadingNews");
//		web.brokenimagecode(driver);
//		web.brokenimagepaginationclick(driver);
		
	}
	
	@Test()

	public void Trendingborken() throws Exception
	{
		Tre.resourcemenuclick();
		Cfn.brokenimagepaginationclick(driver);
		//web.brokenimagepaginationclick(driver);
	
	}
}
