package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  {

    WebDriver localDriver;

    public HomePage(WebDriver globalDriver){
        this.localDriver = globalDriver;
    }




    public void homePageMethodOne(){
        System.out.println("This is Home Page Method One !!!!");
        localDriver.findElement(By.xpath("//body/section[@id='main-menu']/nav[@id='nav']/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
    }


    public void homePageMethodTwo(){
        System.out.println("This is Home Page Method Two !!!!");
        localDriver.findElement(By.xpath("//*[@name='username']")).clear();
        localDriver.findElement(By.xpath("//*[@name='username']")).sendKeys("sandeep");
    }



    public void homePageMethodThree(){
        System.out.println("This is Home Page Method Three !!!!");
    }



    public void homePageMethodFour(){
        System.out.println("This is Home Page Method Four  !!!!");
    }
}
