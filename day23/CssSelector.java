/*
 * CSS Selectors
 * tag id					tag#id
 * tag class				tag.classname
 * tag attribute			tag[attribute="value']
 * tag class attribute		tag.classname[attribute="Value"]
 */
package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone");
		
		//tag class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("TV");
		
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Yoo");
		
		//tag class attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("GHG");
	}

}
