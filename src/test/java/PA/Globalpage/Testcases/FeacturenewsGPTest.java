/**
 * 
 */
package PA.Globalpage.Testcases;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Comman.Commanfunctions;
import PA.GlobalPages.FeacturenewsGP;
import PA.GlobalPages.TrendingnewsGP;
import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class FeacturenewsGPTest extends TestBase {
	FeacturenewsGP Fea;
	Commanfunctions Cfn;
	TrendingnewsGP Tre;

	public FeacturenewsGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		Fea = new FeacturenewsGP();
		Tre = new TrendingnewsGP();
		Cfn = new Commanfunctions();

	}
		

	@Test(priority = 1)
	public void feacturenewsTest() throws IOException, InterruptedException {
		Fea.resourcemenuclick();

		Cfn.Readmorelink(driver, "Feacturenews");
		// fn.Watchnowlink(driver);
		// rp.WriteData(driver);
	}
}
