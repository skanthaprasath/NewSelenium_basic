package RT_letcode;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC3 {
	WebDriver driver;
	@Test(priority = 1,groups= {"Testcase3"})
	void urllaunch() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL launched");
	}
	@Test(priority = 2,groups= {"Testcase3"})
	void radio() {
		WebElement rad = driver.findElement(By.xpath("//input[@value='radio1']"));
		rad.click();
		System.out.println("Radio button clicked");
	}
	@Test(priority = 3,groups= {"Testcase3"})
	void radiotext() {
		String radtext = driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/legend")).getText();
		//assert.assertEquals(radtext, "Radio Button Example");
		System.out.println(radtext);
		System.out.println("Rdio button text");
		driver.quit();
	}
}
