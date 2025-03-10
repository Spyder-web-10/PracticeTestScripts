package day21;


import org.openqa.selenium.chrome.ChromeDriver;

/*
 * TC
 * Launch browser (Chrome)
 * Open URL https://demo.opencart.com
 * Validate title should be "Your  Store"
 * Close  Browser
 */
public class FirstTC {

	public static void main(String[] args) {
		//Launch browser (Chrome)\
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		String act_title = driver.getTitle();
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Its  wrong");
		}
		
		//driver.manage().window().minimize();
		driver.quit();

	}

}
