package sunNext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Base {
	WebDriver dr;
	@Test
	void opneBrowser() {
		dr=new SafariDriver();
		dr.get("https://www.facebook.com");
		
		dr.findElement(By.id("email")).sendKeys("9292418652");
		dr.findElement(By.id("pass")).sendKeys("Sh1$1234");
		dr.findElement(By.name("login")).click();
		
	}

}
