package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fhjj {
	
	static WebDriver driver;
	
	public void launchurl()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.amazon.in");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Fhjj obj=new Fhjj();
	obj.launchurl();
			
		

	}

}
