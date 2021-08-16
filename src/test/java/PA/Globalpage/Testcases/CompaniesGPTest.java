/**
 * 
 */
package PA.Globalpage.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PA.GlobalPages.CompaniesGP;
import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class CompaniesGPTest extends TestBase {
	
	CompaniesGP Comp;
	public CompaniesGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		initialization();
			Comp = new CompaniesGP();
	}

	
	@Test
	public void companiestest() throws Exception
	{
		Comp.Companiesmeuclick();
		Comp.brokenimagepaginationclick(driver);
	}
}
