package PA.Globalpage.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Comman.Commanfunctions;
import Comman.Exceldata;
import PA.GlobalPages.ArticleGP;
import PA.GlobalPages.WhitepapersGP;
import PA.base.TestBase;

public class WhitepapersGPTest extends TestBase {
	ArticleGP Art;
	WhitepapersGP Whi;
	Commanfunctions Cfn;
	Exceldata Exc;

	public WhitepapersGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		initialization();
		Cfn = new Commanfunctions();
		Art = new ArticleGP();
		Whi = new WhitepapersGP();
		Exc = new Exceldata();

	}

	@Test(enabled = false)
	public void Whitepaperstest() throws InterruptedException, IOException {
		Whi.WPresourcemenuclick();
		Cfn.Readmorelink(driver, "Whitepapers");
	}
	
	@Test(priority = 1)
	public void Whitepapertestbrokenimg() throws Exception {
		Whi.WPresourcemenuclick();
		Cfn.brokenimagepaginationclick(driver);
	}
}
