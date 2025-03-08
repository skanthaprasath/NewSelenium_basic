package RT_letcode;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TC2 {
	WebDriver driver;
	@Test(priority = 1,groups= {"Testcase2"})
	void urllaunch() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL launched for rahulshetty");
	}
	@Test(priority = 2,groups= {"Testcase2"})
	void radio() {
		WebElement rad = driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
		rad.click();
		System.out.println("check box clicked");
		
	}
	@Test(priority = 3,groups= {"Testcase2"})
	void radiotext() {
		String radtext = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/legend")).getText();
		//assert.assertEquals(radtext, "Radio Button Example");
		System.out.println(radtext);
		System.out.println("checkbox text");
		driver.quit();
	}
}
