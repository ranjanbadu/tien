package Basedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializer() throws IOException  {
		
		 prop= new Properties();
		 FileInputStream fis;
	
			fis = new FileInputStream("F:\\Java_Eclipse_Program\\Spicejetairways\\src\\main\\resources\\data.properties");
			prop.load(fis);
			String browsername =prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "F:\\Java_Eclipse_Program\\chrme\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 
		 return driver;
	}
	public void getScreenShot(String result) throws IOException {
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File("E:\\Java_Eclipse_Program\\"+result+"screenshot.png" ));
	}

}
