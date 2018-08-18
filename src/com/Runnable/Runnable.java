package com.Runnable;

import com.GenaricMethods.GenaricMethods;
import com.ObjectRepository.Google;

public class Runnable extends GenaricMethods{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
GenaricMethods gm=new GenaricMethods();
Google google=new Google();
gm.selectBrowser("firefox");
gm.selectSearch("google");
google.homePage();
google.gmailPage();
google.googleApps();
google.booksPage();
google.youtubePage();
google.accontPage();
google.earthPage();
google.imagesPage();
google.hangoutsPage();
google.calenderPage();
google.googlePlusPage();
google.keepPage();
google.mapsPage();
google.newsPage();
google.photosPage();
google.playPage();
google.searchPage();
google.translatePage();


driver.close();
	}

}
