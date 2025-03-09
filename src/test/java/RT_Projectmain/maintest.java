package RT_Projectmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://automationexercise.com");
		String titletext = driver.getTitle();
		System.out.println(titletext);
	}

}
