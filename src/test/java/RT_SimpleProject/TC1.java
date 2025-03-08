package RT_SimpleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC1 {
	WebDriver driver;
	@BeforeTest
	void launch() {
		driver= new ChromeDriver();
		driver.get("http://automationexercise.com");
		String titletext = driver.getTitle();
		System.out.println(titletext);
	}
	@AfterTest
	void exit()
	{
		driver.quit();
	}
	

}
