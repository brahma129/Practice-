package com.GenaricMethods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenaricMethods {
	
	public static WebDriver driver;
	
	public static void selectBrowser(String browserName)

	{
		 switch(browserName.toLowerCase())
		 {  
		     
		    case "firefox": 
		    	 driver=new FirefoxDriver();  
		    	 driver.manage().window().maximize();
		    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    break;  
		    
		    case "chrome":
			
				System.setProperty("webdriver.chrome.driver","C:\\Users\\MyUnit\\Documents\\CheckLinks\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			
		    case "ie":
		    	
		    	System.setProperty("webdriver.chrome.driver","C:\\Users\\MyUnit\\Documents\\CheckLinks\\IEDriverServer.exe");
		    	driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
		    	
		    default:
		    	System.out.println("Please Enter Valid BrowserName ike firefox/chrome/ie");  
		 }
	}

	public static void selectSearch(String selectSearchUrl) throws InterruptedException
	{
		switch (selectSearchUrl.toLowerCase())
		{
		case "google":
			
			driver.get("https://www.google.com/");
			Thread.sleep(5000);
			
			break;
		
		case "yahoo":
			driver.get("https://in.yahoo.com/");
			Thread.sleep(5000);
			break;

		default:
			System.out.println("Please Enter Valid String like google/yahoo");
			break;
		}
	}

	public static void checkBrokenLinks(String parseLink)
	{
		try {
			 //Use URL Class and pass the urlLink as parameter 
			 URL link = new URL(parseLink);
			 
			 // Create a connection using URL object link
			 //openConnection() Retrieves the contents of this URL connection.
			 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			 
			 //Set the timeout for 2 seconds
			 httpConn.setConnectTimeout(3000);
			
			 //connect using connect method
			 httpConn.connect();
			 //use getResponseCode() to get the response code. 
			 if(httpConn.getResponseCode()== 200) { 
			 System.out.println(parseLink+" - "+httpConn.getResponseMessage()+"Its a valid URL");
			 }
			 if(httpConn.getResponseCode()== 404) {
			 System.out.println(parseLink+" - "+httpConn.getResponseMessage()+"Its a Broken URL");
			 }
			 }
			 //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
			 catch (Exception e) {
			 e.printStackTrace();
			 }
			    
		} 
	}
	
	


