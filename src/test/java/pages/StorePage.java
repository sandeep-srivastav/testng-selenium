package pages;

import org.openqa.selenium.WebDriver;

public class StorePage {

    private WebDriver localDriver;

    public StorePage(WebDriver globalDriver){
        this.localDriver = globalDriver;
    }


    public void storePageMethodOne(){
        System.out.println("This is Store Page Method One !!!!");
    }


    public void storePageMethodTwo(){
        System.out.println("This is Store Page Method Two !!!!");
    }



    public void storePageMethodThree(){
        System.out.println("This is Store Page Method Three !!!!");
    }



    public void storePageMethodFour(){
        System.out.println("This is Store Page Method Four  !!!!");
    }
}
