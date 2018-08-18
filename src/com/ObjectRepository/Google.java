package com.ObjectRepository;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.GenaricMethods.GenaricMethods;

public class Google extends GenaricMethods {
	
	
	public static WebElement getElement;
	public static String url;
	

	public static void homePage()
	{
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in Google home page: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);   
        }
	}
    //https://www.google.com/gmail/about/#
    
    public static void gmailPage() throws InterruptedException
	{
    	driver.get("https://www.google.com/gmail/about/#");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in Gmail page: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
	}
    public static void imagesPage() throws InterruptedException
	{
    	driver.get("https://www.google.co.in/imghp?hl=en&tab=wi");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in Images page: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
    
	}

    public static void googleApps() throws InterruptedException
	{
    	driver.get("https://www.google.com/");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.xpath("//div[@id='gbwa']/div[2]/ul/li/a"));
	System.out.println("Total Number of links avilable in GoogleApps: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);  
        }
    
	}
    public static void accontPage() throws InterruptedException
	{
    	driver.get("https://myaccount.google.com/intro?utm_source=OGB&utm_medium=app");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in AccountsPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);    
        }
    
	}
    public static void searchPage() throws InterruptedException
	{
    	driver.get("https://www.google.co.in/webhp?tab=pw");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in SearchPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
    
	}
    public static void mapsPage() throws InterruptedException
	{
    	driver.get("https://www.google.co.in/maps/@20.9857003,73.7876856,5z?hl=en");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in MapsPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);   
        }
    
	}
    
    public static void youtubePage() throws InterruptedException
	{
    	driver.get("https://www.youtube.com/?gl=IN");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in YoutubePage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
    
	}
    
    public static void playPage() throws InterruptedException
	{
    	driver.get("https://play.google.com/store?hl=en&tab=p8");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in PlayPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
    
	}
    
    public static void newsPage() throws InterruptedException
	{
    	driver.get("https://news.google.com/?hl=en-IN&gl=IN&ceid=IN:en");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in NewsPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
                
        }
    
	}
    
    public static void contactsPage() throws InterruptedException
	{
    	driver.get("https://accounts.google.com/ServiceLogin/signinchooser?passive=1209600&osid=1&continue=https%3A%2F%2Fcontacts.google.com%2F%3Fhl%3Den%26tab%3DpC&followup=https%3A%2F%2Fcontacts.google.com%2F%3Fhl%3Den%26tab%3DpC&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in ContactsPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
    
	}
    public static void drivePage() throws InterruptedException
	{
    	driver.get("https://www.google.com/intl/en/drive/");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in DrivePage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
                
        }
    
	}
    public static void calenderPage() throws InterruptedException
	{
    	driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=cl&passive=1209600&osid=1&continue=https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Frender%3Ftab%3Dpc&followup=https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Frender%3Ftab%3Dpc&scc=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in CalenderPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
    
	}
    public static void googlePlusPage() throws InterruptedException
	{
    	driver.get("https://plus.google.com/discover");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in GooglePlusPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
                
        }
    
	}
    
    public static void translatePage() throws InterruptedException
	{
    	driver.get("https://translate.google.co.in/?hl=en&tab=pT");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in TranslatePage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
                
        }
    
	}
    
    public static void photosPage() throws InterruptedException
	{
    	driver.get("https://www.google.com/photos/about/");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in PhotosPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
                
        }
    
	}
    public static void docsPage() throws InterruptedException
	{
    	driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=wise&passive=1209600&continue=https%3A%2F%2Fdocs.google.com%2Fdocument%2F%3Fusp%3Ddocs_alc&followup=https%3A%2F%2Fdocs.google.com%2Fdocument%2F%3Fusp%3Ddocs_alc&ltmpl=docs&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in DocsPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
                
        }
    
	}
    
    public static void booksPage() throws InterruptedException
	{
    	driver.get("https://books.google.co.in/bkshp?hl=en&tab=wp");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in BooksPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);   
        }
    
	}
    public static void bloggerPage() throws InterruptedException
	{
    	driver.get("https://www.blogger.com/about/?r=1-null_user");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in BloggerPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);  
        }
    
	}
    
    public static void hangoutsPage() throws InterruptedException
	{
    	driver.get("https://hangouts.google.com/webchat/start");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in HangoutPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);
        }
    
	}
    
    public static void keepPage() throws InterruptedException
	{
    	driver.get("https://accounts.google.com/ServiceLogin/signinchooser?passive=1209600&continue=https%3A%2F%2Fkeep.google.com%2F&followup=https%3A%2F%2Fkeep.google.com%2F&ltmpl=keep&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in KeepPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
        System.out.println(getElement);
        url=getElement.getAttribute("href");
        System.out.println(url);
        checkBrokenLinks(url);   
        }
    
	}
    
    public static void earthPage() throws InterruptedException
	{
    	driver.get("https://earth.google.com/web/");
    	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total Number of links avilable in EarthPage: "+links.size());
    
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        getElement = it.next();
       // System.out.println(getElement);
        url=getElement.getAttribute("href");
        //System.out.println(url);
        checkBrokenLinks(url);
        }
    
    
	}
    
}
	
