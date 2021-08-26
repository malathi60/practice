package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.WebSiteUtility;
public class ComposeMailViaAutoIt
{
	
	public RemoteWebDriver driver;
	public FluentWait<RemoteWebDriver> wait;
	public WebSiteUtility wu;
	public LoginPage lp;
	@BeforeClass
	public void openbrowser() throws Exception
	{
		wu=new WebSiteUtility();
		driver=wu.openBrowser("chrome");
		wait=wu.defineWait(driver);	
	}
	@Test
	public void composeMail() throws Exception
	{
		wu.launchSite(driver,"url");
		lp=new LoginPage(driver,wait);
		lp.filluid("learnsdet21@gmail.com");
		lp.clickNext();
		lp.fillpwd("Learn@1");
		lp.clickNext();
		lp.clickCompose();
		lp.fillto("msdet21@yahoo.com");
		lp.fillsub("hi");
		lp.attachFile();
		Thread.sleep(5000);
		lp.clicksend();
		
	}
}
