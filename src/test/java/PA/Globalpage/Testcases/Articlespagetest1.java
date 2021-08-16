package PA.Globalpage.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PA.GlobalPages.Articles;
import PA.base.TestBase;
public class Articlespagetest1 extends TestBase{
	
	Articles ar;
	
	public Articlespagetest1() {
		super();
	}

	@BeforeMethod
	public void Setup() {
		initialization();
		ar = new Articles();

	}
	
	@Test(priority = 1)
	public void articlelinks() throws InterruptedException
	{
		ar.Linkcheck();
		
	}
    

}
