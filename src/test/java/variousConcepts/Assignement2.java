package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignement2 {
	
	WebDriver driver;

	 

		@Before

		public void init() {

	 

			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().deleteAllCookies();

			driver.get("http://www.techfios.com/billing/?ng=admin/");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 

		}

	 

		@Test

		public void browser() throws InterruptedException {

	 

			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

			driver.findElement(By.name("password")).sendKeys("abc123");

			driver.findElement(By.name("login")).click();

			WebDriverWait wait = new WebDriverWait(driver, 1);
			
			//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.loader-overlay.loaded")));

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Bank & Cash")))).click();

	 

			driver.findElement(By.linkText("New Account")).click();

			driver.findElement(By.id("account")).sendKeys("Claudine1");

			driver.findElement(By.cssSelector("input#description")).sendKeys("Checking");

			driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("12000");

			driver.findElement(By.cssSelector("input[id='account_number']")).sendKeys("10101010");

			driver.findElement(By.xpath("//input[@name='contact_person']")).sendKeys("");

			driver.findElement(By.cssSelector("input[name='contact_phone']")).sendKeys("4032134444");

			driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-primary']")).click();
			
			Thread.sleep(10000);
	 }

		

		@After

		public void teardown() {

			driver.close();

			driver.quit();

			

		}

			

}
