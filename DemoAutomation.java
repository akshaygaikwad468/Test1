package UI;


import java.util.Iterator;
import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;

public class DemoAutomation {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.edge.driver", "C:\\driver\\msedgedriver.exe");	
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			String expected[]= {"English", "Dutch"};
			
		driver.get("https://jt-dev.azurewebsites.net/#/SignIn");
		driver.manage().window().maximize();
		WebElement drp= driver.findElement(By.xpath("//*[@id=\"language\"]/div[1]"));
		driver.findElement(By.id("email")).sendKeys("akshaygaikwad468@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abcd");
		
		Select sel= new Select(drp);
		List<WebElement> opt= sel.getOptions();
		for(int i=0; i<opt.size(); i++)
		{
			org.testng.Assert.assertEquals(opt.get(i).getText(),expected[i]);
		}
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[4]/div/section/div[1]/form/fieldset/div[3]/button")).click();
		Thread.sleep(2000);
		driver.close();
	}

}