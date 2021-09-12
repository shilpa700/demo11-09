package project;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.x.ChromeDriver;
import com.x.WebDriver;

public class Trial {
	@Test
	public void test(){
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shilp/Downloads/Offline%20Website/Offline%20Website/index.html");
	boolean pr=	driver.findElement(By.xpath("//img")) != null;
		Assert.assertTrue(pr);
	
}

}
