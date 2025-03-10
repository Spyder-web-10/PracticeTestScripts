package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//Tag Class
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("Phone");
		
		//Tag attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("GFRSf");
		
		//Tag class attribute
		driver.findElement(By.cssSelector("input.form-control[placeholder='Search']")).sendKeys("Hgtg");
	}

}
