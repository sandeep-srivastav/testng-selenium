package pages;

import objRepo.AnnouncementsPageLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WebPageOperation;

public class AnnouncementsPage {

    private WebDriver localDriver;
    WebPageOperation webPageOperation;

    public AnnouncementsPage(WebDriver globalDriver){
        this.localDriver = globalDriver;
        webPageOperation = new WebPageOperation(localDriver);
    }


    public void announcementPageMethodOne(){
        //localDriver.findElement(By.xpath("//a[contains(text(),'Announcements')]")).click();
        //System.out.println("This is AnnouncementsPage Page Method One !!!!");
        webPageOperation.clickOnWebElement(AnnouncementsPageLocator.announcementPageButton);
    }


    public void announcementPageMethodTwo(){
        String text = localDriver.findElement(By.xpath("//small[contains(text(),'All the latest from PHPTRAVELS')]")).getText();
        System.out.println("This is AnnouncementsPage Page Method Two !!!!" + text);
    }



    public void announcementPageMethodThree(){
        System.out.println("This is AnnouncementsPage Page Method Three !!!!");
    }



    public void announcementPageMethodFour(){
        System.out.println("This is AnnouncementsPage Page Method Four  !!!!");
    }
}
