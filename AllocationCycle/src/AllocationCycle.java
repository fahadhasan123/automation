import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AllocationCycle {

	 Logger logger;
		@Test
		public static void LaunchApplication() throws InterruptedException, FileNotFoundException, IOException {
		org.apache.log4j.BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);
		getResourceAsStream("path_to_your_exe_file");
		FileUtils.getFile("/AllocationCycle/lib/chromedriver.exe", "/AllocationCycle/lib/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","/AllocationCycle/lib/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		DOMConfigurator.configure("log4j.xml");
		Logger logger = Logger.getLogger("AllocationCyle.class");
		
		
		chromeDriver.get("https://adminauto.meteorapp.com");
		logger.info("Application Launched");
		chromeDriver.manage().window().maximize();
		Thread.sleep(10000);

		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys("fahad@greenviewsf.com");
		logger.info("Username: fahad@greenviewsf.com");

		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[1]/div[2]/div/input")).sendKeys("hassan1234");
		logger.info("Password: hassan1234");
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[2]/div[2]/input")).click();
		Thread.sleep(50000);
		
		//Click on Process Allocation Cycle
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[1]/ul[2]/li[3]/a/span")).click();
		logger.info("Clicked on Process Allocation Cycle");

		Thread.sleep(8000);
		
		
		//Click on Allocation-Cycle-- For Example - December 2017
		chromeDriver.findElement(By.xpath(".//*[@id='allocation_cycle_buildings']/tbody/tr/td[9]/a[1]/i")).click();
		logger.info("Clicked on Month Allocation Cycle - October 2017 Allocation Cycle");

		Thread.sleep(8000);

		//Search Building
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/input")).sendKeys("902");
		logger.info("Search building address 902");

		Thread.sleep(8000);		

		//Click on Allocations Bill Already Generated - Building name: 902 Divisadero Street
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[2]/table/tbody/tr/td[10]/a[1]/i")).click();
		logger.info("Clicked on Building name: 902 Divisadero Street");

		Thread.sleep(8000);

		
		Thread.sleep(8000);  //Enter Utility  Bill 1
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[4]/div/div[1]/div/div[1]/div/div/form/div[6]/div/input")).clear(); 

		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[4]/div/div[1]/div/div[1]/div/div/form/div[6]/div/input")).sendKeys("9900.88");
		logger.info("Enter Utility Bill 9900.88 in Gas - Occupancy utiliy");

		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor)chromeDriver;
		js1.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(8000);  //Enter Utility  Bill 2
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[4]/div/div[1]/div/div[2]/div/div/form/div[6]/div/input")).sendKeys("7800.57");
		logger.info("Enter Utility Bill 7800.57 in Gas - (Sq -Ft)");

		Thread.sleep(4000);
		JavascriptExecutor js2 = (JavascriptExecutor)chromeDriver;
		js2.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(8000);  
		
		//Enter Utility  Bill 3
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[4]/div/div[1]/div/div[3]/div/div/form/div[6]/div/input")).sendKeys("5679.89");
		logger.info("Enter Utility Bill 5679.89 in Internet");

		
		Thread.sleep(4000);
		JavascriptExecutor js3 = (JavascriptExecutor)chromeDriver;
		js3.executeScript("window.scrollBy(0,250)", "");
		
		Thread.sleep(8000);  
		
		//Enter Utility  Bill 4
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[4]/div/div[1]/div/div[4]/div/div/form/div[6]/div/input")).sendKeys("3583.27");
		logger.info("Enter Utility Bill 3583.27 in Sewer - Occupancy");

		Thread.sleep(4000);
		JavascriptExecutor js4 = (JavascriptExecutor)chromeDriver;
		js4.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(8000);  
		
		//Click on Generate Allocation Button
		chromeDriver.findElement(By.xpath("html/body/div[3]/div/div[3]/div/div[2]/div/div/div[4]/button[1]")).click();
		logger.info("Click on Generate Allocation Table");
		logger.info("Allocation Cycle has been created successfully");

		

	}
		private static void getResourceAsStream(String string) {
			// TODO Auto-generated method stub
			
		}

}
