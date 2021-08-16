/**
 * 
 */
package PA.Globalpage.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Comman.Commanfunctions;
import PA.GlobalPages.ArticleGP;
import PA.GlobalPages.FeacturenewsGP;
import PA.GlobalPages.InfographicsGP;
import PA.GlobalPages.TrendingnewsGP;
import PA.GlobalPages.VideosGP;
import PA.GlobalPages.WhitepapersGP;
import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class ArticleGPTest extends TestBase {
	ArticleGP Art;
	VideosGP Vid;
	WhitepapersGP Whi;
	Commanfunctions Cfn;
	InfographicsGP Info;
	FeacturenewsGP Fea;
	TrendingnewsGP Tre;

	public ArticleGPTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		initialization();
		Art = new ArticleGP();
		Vid = new VideosGP();
		Whi = new WhitepapersGP();
		Cfn = new Commanfunctions();
		Info = new InfographicsGP();
		Fea = new FeacturenewsGP();
		Tre = new TrendingnewsGP();
	}

	@Test(enabled=false)
	public void ArticlepageTest() throws IOException {
		Art.resourcemenuclick();
		Cfn.Readmorelink(driver, "Articles");
	}
	
	@Test(priority = 1)
	public void Articlebrokenimg() throws Exception {
		Art.resourcemenuclick();
		Cfn.brokenimagepaginationclick(driver);
	}

//	@Test(priority = 2)
//	public void videoslinks() throws InterruptedException, IOException {
//		Vid.resourcemenuclick();
//		Cfn.Watchnowlink(driver, "Videos");
//	}
//
//	@Test(priority = 3)
//	public void Whitepaperstest() throws InterruptedException, IOException {
//		Whi.WPresourcemenuclick();
//		Cfn.Readmorelink(driver, "Whitepapers");
//	}
//
//	@Test(priority = 4)
//	public void Infographicstest() throws IOException, InterruptedException {
//		Info.resourcemenuclick();
//		Cfn.Readmorelink(driver, "Infographics");
//	}
//
//	@Test(priority = 5)
//	public void feacturenewsTest() throws IOException, InterruptedException {
//		Fea.resourcemenuclick();
//		Cfn.Readmorelink(driver, "Feacturenews");
//	}
//
//	@Test(priority = 6)
//	public void Treadingtest() throws IOException, InterruptedException {
//		Tre.resourcemenuclick();
//		Cfn.Readmorelink(driver, "TreadingNews");
//	}
}
