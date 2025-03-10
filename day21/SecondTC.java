package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTC {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		if(title.equals("DemoApps | Qspiders")) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		driver.quit();

	}

}
