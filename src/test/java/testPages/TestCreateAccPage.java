package testPages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.CreateNewAccPage;
import pages.HomePage;
import utility.Excel_handling;

public class TestCreateAccPage extends BaseClass {

	public TestCreateAccPage() throws IOException {
		super();
		
	}
	
	HomePage homePage;
	CreateNewAccPage createAccPg;
	String sheetName="customers_details";
	
	@BeforeMethod
	public void launchBrowser() throws IOException, InterruptedException {
		initialBrowser();
		homePage = new HomePage();
		createAccPg = new CreateNewAccPage();
		homePage.verifyCreateAcc();
	}
	
	@DataProvider
	public void getTestData() throws EncryptedDocumentException, IOException {
		Object [][] accData = Excel_handling. getTestData(sheetName);
	}
	
	@Test
	public void testCreateAccount_Homepage() {
		
	}
	
	@Test
    public void testCreateAccount_Loginpage() {
		
	}

}
