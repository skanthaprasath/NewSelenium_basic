package seleniumwebdriver_Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String title=driver.getTitle();
		if(title.equals("Your Store"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Failed");
		}
		System.out.println(title);
		
		driver.quit();
		
	}

}
