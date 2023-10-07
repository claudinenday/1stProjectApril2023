package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnLocator {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		// delete cookies
		driver.manage().deleteAllCookies();
		
		// get the browser
		driver.get("https://www.objectspy.space/");

		// manage the window
		driver.manage().window().maximize();
		
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLocators() {

		//driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("datepicker")).sendKeys("09/23/2023");
	

		// upload file-->need to provide the path to the file, name and extension of the file.
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\claud\\OneDrive\\Documents\\QAClases\\SELENIUM classes\\Session 1.pptx");
		
		// Robot class is used if the tag is different than <input>
		
		// link text/ copy the link 
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		driver.navigate().back();// will take you back to the previous page
		
		driver.findElement(By.partialLinkText("TF-API")).click();
		
		driver.navigate().back();// will take you back to the previous page

		// CSS Selector
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Mahoro");
	//	driver.findElement(By.cssSelector("input[ name='Password']")).sendKeys("ubumwe012");
		driver.findElement(By.cssSelector("input[name= 'firstname']")).sendKeys("Mark");
		driver.findElement(By.cssSelector("input#exp-5")).click();
		
		
		//driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/']")).click();

		// absolute xPath to password 
	//	driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("made it");
		
		
		//relative xPath to password 
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("whatever");
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Manual Tester']")).click();
		
		//xPath to a link use = or contains
		
		driver.findElement(By.xpath("//strong[text() ='Link Test : Page Change']")).click();
		driver.findElement(By.xpath("//strong[text() ='Link Test : Page Change']")).click();
		//driver.findElement(By.xpath("//strong[contains(text(),'New Page')]")).click();

	}

}
