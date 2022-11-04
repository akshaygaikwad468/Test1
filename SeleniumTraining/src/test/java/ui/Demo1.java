package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\AG7827\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bankofamericasb.reflexisinc.com/RWS4");
		driver.findElement(By.xpath("//input[@placeholder = 'Enter username']")).sendKeys("WFMADMIN");
        driver.findElement(By.xpath("//input[@placeholder = 'Enter password']")).sendKeys("WFMADMIN727@boa");
        driver.findElement(By.xpath("//Button[contains(@class,'login')]")).click();
        Actions actions = new Actions(driver);
      
         
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        WebElement menuOption = driver.findElement(By.xpath("//a[contains(@id, 'mh')]/img[contains(@src,'Calendar')]"));
          actions.moveToElement(menuOption).perform();
          driver.findElement(By.xpath("//a[contains(@onclick,'holidayTypes')]")).click();
          driver.findElement(By.xpath("//span[contains(@ng-click,'Add')]")).click();
          driver.findElement(By.xpath("//input[contains(@id,'categoryCode')]")).sendKeys("Test");
          driver.findElement(By.xpath("//input[contains(@id,'categoryDescription')]")).sendKeys("Test");
          driver.findElement(By.xpath("//*[contains(@name,'colorL')]")).click();
          driver.findElement(By.xpath("//span[contains(text(),'MediumSpringGreen - #00FA9A')]/parent::a/parent::li")).click();
          
          driver.findElement(By.xpath("//span[contains(@class,'ws-icon ws-iconSwitchOff pointer ws-p-lr-12 ng-scope')]")).click();
          driver.findElement(By.xpath(" //button[contains(text(),'Save')]")).click();
          driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
          driver.findElement(By.xpath("//a[text()='Test']")).click();
         driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
         driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		/*driver.get("https://rwssallybeautysb.reflexisinc.com/RWS4");
		WebElement user = driver.findElement(By.cssSelector("input[placeholder='Enter username']"));
		user.click();
		user.sendKeys("SYSADMIN");
		
		WebElement pwd = driver.findElement(By.cssSelector("input[placeholder='Enter password']"));
		pwd.click();
		pwd.sendKeys("SYSADMIN");
		
		driver.findElement(By.cssSelector(".login-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".squares")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"moduleMenuIcons\"]/div[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"RTM-SUBMENU-MODULE-50100-menudata-14\"]")).click();
		
		Thread.sleep(5000);
		
		WebElement frame= driver.findElement(By.cssSelector("iframe.how-do-div-iframe"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(@value,'Add')]")).click();
		WebElement name= driver.findElement(By.xpath(" //*[contains(@style,'width:321px')]"));
		name.click();
		name.sendKeys("ABC");
		
		WebElement desc= driver.findElement(By.xpath(" //*[contains(@style,'width:323px')]"));
		desc.click();
		desc.sendKeys("abc");
		
		/*driver.findElement(By.xpath("//input[contains(@value,'ADVANCED')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'DAY_MONDAY')]")).click();
		driver.findElement(By.xpath("//input[@name='WEEK_1']")).click();*/
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('button-t').click()");*/
		
		//driver.findElement(By.cssSelector(".button-t")).click();
	
		//Actions action=new Actions(driver);
		//action.moveToElement();
		
		Thread.sleep(5000);
		
		

		driver.quit();
	}

}
