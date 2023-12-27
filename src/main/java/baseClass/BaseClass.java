package baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	Properties prop;
	FileInputStream finput;
	public BaseClass () throws IOException {
		 prop = new Properties();
		 finput = new FileInputStream("../STP_magento/src/main/java/utility/config.properties");
		 prop.load(finput);
	}
	
	
	public void initialBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("baseURL"));
		
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
