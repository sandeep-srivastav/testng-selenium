package pages;


import org.openqa.selenium.WebDriver;
import objRepo.NetworkPageLocator;
import util.WebPageOperation;

public class NetworkPage {

    private WebDriver localDriver;
    WebPageOperation webPageOperation;

    public NetworkPage(WebDriver globalDriver) {
        //super();
        this.localDriver = globalDriver;
        webPageOperation = new WebPageOperation(localDriver);
    }


    public void networkPageMethodOne(){
        System.out.println("This is KnowledgeBasePage Page Method One !!!!");
        webPageOperation.clickOnWebElement(NetworkPageLocator.networkStatusButton);
    }


    public void networkPageMethodTwo(){
        System.out.println("This is KnowledgeBasePage Page Method Two !!!!");
    }



    public void networkPageMethodThree(){
        System.out.println("This is KnowledgeBasePage Page Method Three !!!!");
    }



    public void networkPageMethodFour(){
        System.out.println("This is KnowledgeBasePage Page Method Four  !!!!");
    }
}
