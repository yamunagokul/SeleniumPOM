package base;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver; 
	
	@Parameters({"url","browser"}) 
	@BeforeMethod
	public void preCondition(String url, String lang) 
	{
		if(lang.equals("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
		}
		else if(lang.equals("edge")) {
		EdgeOptions option = new EdgeOptions();
			option.addArguments("--disable-notifications");
			driver = new EdgeDriver(option);
		}
		
		else if(lang.equals("firefox")) {
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--disable-notifications");
			driver = new FirefoxDriver(option);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	}

	@AfterMethod
	public void postCondition() {
            driver.quit();
       
	}
}
