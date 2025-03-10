package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//Get is use to navigate to the WebPage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);
		
		//GetTitle Returns the title of the Page.
		String pagetitlr = driver.getTitle();
		System.out.println(pagetitlr);
		
		//GetCurrent URL Return the page URL
		String Link = driver.getCurrentUrl();
		System.out.println(Link);
		
		//Get PageSource
		//String PageSource = driver.getPageSource();
		//System.out.println(PageSource);
		
		//Get WindowHandle
		String Wind = driver.getWindowHandle();
		System.out.println("Window ID"+Wind);
		
		//Get WindowHandles
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> winhandels = driver.getWindowHandles();
		System.out.println("Window Handles are: - "+winhandels);
		
		
		driver.quit();
	}

}
