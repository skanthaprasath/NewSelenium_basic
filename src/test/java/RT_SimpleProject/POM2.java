package RT_SimpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {
	WebDriver driver;
	POM2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span") WebElement section;
	@FindBy(xpath = "//*[@id=\"Men\"]/div/ul/li[2]/a") WebElement subsection;
	@FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/a") WebElement addtocart;
	
	void selct() throws InterruptedException {
		section.click();
		subsection.click();
		//Thread.sleep(5000);
	}
	
	void hovr() throws InterruptedException
	{

		WebElement elementToHover = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/a")); // Change selector as needed
        // Create an Actions object
      Actions actions = new Actions(driver);
     // Perform hover action`
	     actions.moveToElement(elementToHover).perform();
		addtocart.click();
	}
}
