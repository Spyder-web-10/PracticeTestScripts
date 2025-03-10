package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//IsDisplayed
		//WebElement disp = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		//System.out.println("Logo Status: - "+disp.isDisplayed());
		
		Boolean logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		System.out.println("Logo Status:- "+logo);
		
		//IsEnabled to check enable/disable status of the element
		Boolean FirstName = driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"FirstName\"]")).isEnabled();
		System.out.println("First Name Status:- "+FirstName);
		
		//Is Selected
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		//driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();
		Boolean RadiobtnMale = driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).isSelected();
		System.out.println("Btn StatusMale:- "+RadiobtnMale);
		Boolean RadiobtnFemale = driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).isSelected();
		System.out.println("Btn StatusFemale:- "+RadiobtnFemale);
		
	}

}
