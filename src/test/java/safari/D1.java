package safari;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class D1 {
	static WebDriver dr;

	public static void main(String[] args) {
		
		dr=new SafariDriver();
		dr.get("https://www.youtube.com/");
		String title=dr.getTitle();
		System.out.println(title);
		
	
		
		

	}

}
