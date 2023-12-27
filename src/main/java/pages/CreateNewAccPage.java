package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class CreateNewAccPage extends BaseClass {

	public CreateNewAccPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="firstname") WebElement firstName;
	@FindBy(id = "lastname") WebElement lasName;
	@FindBy (id ="email_address") WebElement emailAdrress;
	@FindBy (id="password") WebElement pasword;
	@FindBy (id = "password-confirmation") WebElement confirmPassword;
	@FindBy (xpath = "(//span[text()='Create an Account'])[3]") WebElement createAccountbtn;
	
	public void verifyCreateAccount(String fName, String lName, String emailId, String password) {
		
		firstName.sendKeys("fName");
		lasName.sendKeys("lName");
		emailAdrress.sendKeys("emailId");
		pasword.sendKeys("password");
		confirmPassword.sendKeys("password");
		
		createAccountbtn.click();
				
		
	}
	

}
