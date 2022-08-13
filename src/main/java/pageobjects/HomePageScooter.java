package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageScooter {
    WebDriver driver;
    private final By firstQuestion = By.id("accordion__heading-0");
    //Поле "Хочу сразу несколько самокатов! Так можно?"
    private final By secondQuestion = By.id("accordion__heading-1");
    //Поле "Как рассчитывается время аренды?"
    private final By thirdQuestion = By.id("accordion__heading-2");
    //Поле "Можно ли заказать самокат прямо на сегодня?"
    private final By fourthQuestion = By.id("accordion__heading-3");
    //Поле "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By fifthQuestion = By.id("accordion__heading-4");
    //Поле"Вы привозите зарядку вместе с самокатом?"
    private final By sixthQuestion = By.id("accordion__heading-5");
    //Поле "Можно ли отменить заказ?"
    private final By seventhQuestion = By.id("accordion__heading-6");
    //Поле "Я жизу за МКАДом, привезёте?"
    private final By eighthQuestion = By.id("accordion__heading-7");

    public HomePageScooter(WebDriver driver){
        this.driver = driver;
    }
    public String getElementsText(WebElement element){
       String txt = element.getText();
       return txt;
    }
}
