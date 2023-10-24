package suaglab_package;
import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suaglab_package {




	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";

	static String PerformanceUserName = "performance_glitch_user";

	static String passWord = "secret_sauce";

	static WebDriver driver = new ChromeDriver();
	 static void Loginfunction(String username,String password ) {
		 WebElement userNameInputField = driver.findElement(By.id("user-name"));
			userNameInputField.sendKeys(StandardUserName);
			WebElement passWordInput = driver.findElement(By.id("password"));

			passWordInput.sendKeys(passWord);
			driver.findElement(By.name("login-button")).click();
		 
		 
	 }
	 
}

