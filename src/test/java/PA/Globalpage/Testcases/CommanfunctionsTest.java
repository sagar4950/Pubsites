/**
 * 
 */
package PA.Globalpage.Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import Comman.Commanfunctions;
import Comman.Exceldata;
import PA.GlobalPages.ArticleGP;
import PA.GlobalPages.VideosGP;
import PA.GlobalPages.WhitepapersGP;
import PA.base.TestBase;

/**
 * @author sagar.nikam
 *
 */
public class CommanfunctionsTest extends TestBase {
	ArticleGP Art;
	VideosGP Vid;
	WhitepapersGP Whi;
	Commanfunctions Cfn;
	Exceldata Exc;

	public CommanfunctionsTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		initialization();
		Art = new ArticleGP();
		Vid = new VideosGP();
		Whi = new WhitepapersGP();
		Exc = new Exceldata();
	}

}
