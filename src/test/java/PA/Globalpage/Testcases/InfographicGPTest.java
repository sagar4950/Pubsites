/**
 * 
 */
package PA.Globalpage.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Comman.Commanfunctions;
import PA.GlobalPages.InfographicsGP;
import PA.base.TestBase;


/**
 * @author sagar.nikam
 *
 */
public class InfographicGPTest extends TestBase {
	InfographicsGP Info;
	Commanfunctions Cfn;

	public InfographicGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		Info = new InfographicsGP();
		Cfn = new Commanfunctions();

	}

	@Test(enabled =false)
	public void Infographicstest() throws IOException, InterruptedException {
		Info.resourcemenuclick();
		Cfn.Readmorelink(driver, "Infographics");
	}

	@Test(priority = 1)
	public void brokeninfo() throws Exception
	{
		Info.resourcemenuclick();
		Cfn.brokenimagepaginationclick(driver);
	}

}
