import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	

	public static void main(String[] args) {
		System.out.println("Jumping beans this is working now. ");
		//Create a new instance 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//Maximize the Browser window
		driver.manage().window().maximize();
		
		//Get the current page URL and store the value in variable 'str'
		String str = driver.getCurrentUrl();
		
		//Print the value of variable in the console
		System.out.println("The current URL is" + str);
		
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
}




