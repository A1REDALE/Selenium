package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageScooter {

    WebDriver driver;

    public HomePageScooter(WebDriver driver){

        this.driver = driver;
    }
    public String getElementsText(WebElement element){
       String txt = element.getText();
       return txt;
    }



}
