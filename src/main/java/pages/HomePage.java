package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@class = 'logo']/img") WebElement logoImg;
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]") WebElement signIn;
	@FindBy(xpath = "(//span[text()='Create an Account'])[1]") WebElement createAccount;
	@FindBy(xpath = "(//a[text()='Create New Customer'])[1]") WebElement createCustomer;
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		return logoImg.isDisplayed();
	}
	
	public LoginPage verifySignIn() {
		 signIn.click();
		 return new LoginPage();
	}
	
	public CreateNewAccPage verifyCreateAcc() throws IOException, InterruptedException {
		Thread.sleep(3000);
		createAccount.click();
		createCustomer.click();
		Thread.sleep(3000);
		return new CreateNewAccPage();
	}

}
