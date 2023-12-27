package testPages;

	import java.io.IOException;

	import org.testng.Assert;
	import org.testng.annotations.*;

	import baseClass.BaseClass;
	import pages.HomePage;

	public class TestHomePg extends BaseClass {
		
		HomePage homePage = new HomePage();
		public TestHomePg() throws IOException {
			super();
			
		}
		
		@BeforeMethod
		public void launchBrowser() {
			initialBrowser();
		}
		
		@AfterMethod
		public void browserClose() throws InterruptedException {
			closeBrowser();
		}
		
		@Test
		public void testPageTitle() {
			Assert.assertEquals(homePage.verifyPageTitle(), "Magento 2 Commerce (Enterprise) B2B Demo - Magebit");
		}
		
		@Test
		public void testPageLogo() {
			Assert.assertTrue(homePage.verifyLogo());
		}
		@Test
		public void testSignIn() {
			homePage.verifySignIn();
		}
		@Test
		public void testCreateAccount() throws IOException, InterruptedException {
			homePage.verifyCreateAcc();
		}
		
	}


