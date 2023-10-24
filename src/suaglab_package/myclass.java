package suaglab_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myclass extends suaglab_package {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);

	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
		Loginfunction(StandardUserName,passWord );
 
		Thread.sleep(3000);

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		Loginfunction(ProblemUserName,passWord );
	
	
		Thread.sleep(3000);

	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		Loginfunction(PerformanceUserName,passWord );
		Thread.sleep(3000);

		
	}
	

	@AfterTest
	public void myPostTesting() {

	}

}
