package supertailsTest.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import supertailsTest.config.TestSetup;
import supertailsTest.pages.HomePage;

public class HomePageTest {
	WebDriver driver;
	HomePage page;
	
	
	@BeforeClass
	public void config() {
		TestSetup.driverConfig();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(TestSetup.URI);
		page=new HomePage(driver);
		
	}
	
	@Test
	public void homepageTest() {
		System.out.println("Title "+page.getPageTitle());
		Assert.assertTrue(page.getPageTitle().contains("Online pet store"));
	}
	
	@AfterClass
	public void cleanup() {
		driver.quit();
	}
	
	

}
