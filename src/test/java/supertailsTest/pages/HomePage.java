package supertailsTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By dogpage=By.id("nav--Dogs");
	By catpage=By.id("nav--Cats");
	
	
	public HomePage(WebDriver dri) {
		this.driver=dri;
	}
	
	public String getPageTitle() {
		return this.driver.getTitle();
	}
	
	public void openDogPage() {
		this.driver.findElement(dogpage).click();
	}
	

	public void openCatPage() {
		this.driver.findElement(catpage).click();
	}

}
