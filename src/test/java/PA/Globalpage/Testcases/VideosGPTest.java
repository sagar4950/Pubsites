package PA.Globalpage.Testcases;

import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Comman.Commanfunctions;
import PA.GlobalPages.VideosGP;
import PA.base.TestBase;


public class VideosGPTest extends TestBase {

	VideosGP Vid;
	Commanfunctions Cfn;

	public VideosGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		Vid = new VideosGP();
		Cfn = new Commanfunctions();
	}

	@Test(enabled = false)
	public void videoslinks() throws InterruptedException, IOException {
		Vid.resourcemenuclick();
		Cfn.Watchnowlink(driver, "Videos");
	}
	
	@Test(priority = 1)
	public void videobrokenimg() throws Exception {
		Vid.resourcemenuclick();
		Cfn.brokenimagepaginationclick(driver);
	}
	
	
}
