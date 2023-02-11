package supertailsTest.mainApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
			
		String path="D:\\drivers\\chromedriver.exe";
		String url="https://supertails.com";
		// Web Driver specification
		System.setProperty("webdriver.chrome.driver", path);
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize(); 
		
		System.out.println("Page title : "+driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.id("nav--Dogs")).click();
		Thread.sleep(2000);
		
		System.out.println("Page title : "+driver.getTitle());
		
		driver.quit();
		

	}

}
