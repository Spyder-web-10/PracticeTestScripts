package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		
		//XPath with single attribute
		//driver.findElement(By.xpath("//input[@placeholder=\"Search store\"]")).sendKeys("Iphone");
		
		//XPath with multiple attribute
		//driver.findElement(By.xpath("//*[@class=\"ico-login\"]")).click();
		//driver.findElement(By.cssSelector("input.email")).sendKeys("subhadip@gmail.com");
		
		//XPath with and OR Operator
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder=\'Search store']")).sendKeys("Tshirts");
		//driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder=\'Searchxx store']")).sendKeys("Tshirts");
		
		//XPath by text()
		//driver.findElement(By.xpath("//a[text() ='Apple MacBook Pro']")).click();
		
		//String value = driver.findElement(By.xpath("//strong[text()=\"Featured products\"]")).getText();
		//System.out.println(value);
		
		//XPath with Contains method. We can search with the Substrings
		//driver.findElement(By.xpath("//input[contains(@placeholder,\"Search\")]")).sendKeys("Phones");
		//driver.findElement(By.xpath("//button[starts-with(@class,\"button-1 s\")]")).click();
		
		//Chained XPath
		driver.findElement(By.xpath("")).isDisplayed();
	}

}
