package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		//id
		boolean logoiddisplayed  = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println("Logo is Displayed: - "+logoiddisplayed);
		//LinkText
		/*for(int i = 0; i<=5; i++) {
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Laptops & Notebooks")).click();
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.linkText("Software")).click();
		driver.findElement(By.linkText("Phones & PDAs")).click();
		driver.findElement(By.partialLinkText("Cameras")).click();
		}
		//Class name
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total numbers of header links: - "+headerLinks.size());
		*/ 
		//Tag name
		//List<WebElement> Links = driver.findElements(By.tagName("a"));
		//System.out.println("Total number of links: - "+Links.size());
		
		//Image
		List<WebElement> ImageLinks = driver.findElements(By.tagName("img"));
		System.out.println("Total  number of images are: - "+ImageLinks.size());
		
		driver.quit();

	}

}
