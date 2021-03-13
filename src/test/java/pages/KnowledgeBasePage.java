package pages;

import org.openqa.selenium.WebDriver;

public class KnowledgeBasePage {

    WebDriver localDriver;

    public KnowledgeBasePage(WebDriver globalDriver){
        this.localDriver = globalDriver;
    }


    public void knowledgebasePageMethodOne(){
        System.out.println("This is KnowledgeBasePage Page Method One !!!!");
    }


    public void knowledgebasePageMethodTwo(){
        System.out.println("This is KnowledgeBasePage Page Method Two !!!!");
    }



    public void knowledgebasePageMethodThree(){
        System.out.println("This is KnowledgeBasePage Page Method Three !!!!");
    }



    public void knowledgebasePageMethodFour(){
        System.out.println("This is KnowledgeBasePage Page Method Four  !!!!");
    }
}
