package PageObjects;
import org.openqa.selenium.*;
import PageObjects.Locators;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class OrderScooter {
    public OrderScooter(WebDriver driver) {
        this.driver  = driver;
    }
    WebDriver driver;

    private final By topOrderButton = By.cssSelector(".Header_Nav__AGCXC > button:nth-child(1)");
    private final By downOrderButton = By.cssSelector(".Button_UltraBig__UU3Lp");
    private final By inputFirstName = By.xpath(".//input[@placeholder='* Имя']");
    private final By inputSecondName = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    private final By inputMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By inputPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By nextButton = By.xpath("//*[@id='root']/div/div[2]/div[3]/button");
    private final By inputOrderDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    private final By inputRentalPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");

    private final By oneDayPeriod = By.xpath(".//div[@class='Dropdown-option'][1]");

    private final By threeDaysPeriod = By.xpath(".//div[@class='Dropdown-option'][3]");
    private final By confirmOrderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    private final By yesButton = By.xpath("//div[@class='Order_Modal__YZ-d3']//button[2]");

    private final By orderConfirmation = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");




    public OrderScooter clickTopOrderButton() {
        driver.findElement(topOrderButton).click();
        return this;
    }

    public OrderScooter clickDownOrderButton() {
        WebElement element = driver.findElement(downOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(downOrderButton).click();
        return this;
    }

    public OrderScooter fillFirstName(String firstName) {
        driver.findElement(inputFirstName).sendKeys(firstName);
        return this;
    }

    public OrderScooter fillSecondName(String secondName) {
        driver.findElement(inputSecondName).sendKeys(secondName);
        return this;
    }

    public OrderScooter fillAddress(String address) {
        driver.findElement(inputAddress).sendKeys(address);
        return this;
    }

    public OrderScooter fillMetroStation(String metroStation) {
        driver.findElement(inputMetroStation).sendKeys(metroStation + Keys.ARROW_DOWN + Keys.ENTER);
        return this;
    }

    public OrderScooter fillPhoneNumber(String phoneNumber){
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
        return this;
    }

    public OrderScooter fillFirstOrderPage(String firstName, String secondName, String address, String metroStation,
                                   String phoneNumber){
                fillFirstName(firstName);
                fillSecondName(secondName);
                fillAddress(address);
                fillMetroStation(metroStation);
                fillPhoneNumber(phoneNumber);
                return this;
    }


    public OrderScooter clickNextButton (){
        driver.findElement(nextButton).click();
        return this;
    }

    public OrderScooter fillOrderDate(String orderDate){
        driver.findElement(inputOrderDate).sendKeys(orderDate + Keys.ENTER);
        return this;
    }


    public OrderScooter fillRentalPeriod1(){
        driver.findElement(inputRentalPeriod).click();
        driver.findElement(threeDaysPeriod).click();
        return this;
    }

    public OrderScooter fillRentalPeriod2(){
        driver.findElement(inputRentalPeriod).click();
        driver.findElement(oneDayPeriod).click();
        return this;
    }

    public OrderScooter clickConfirmOrderButton(){
        driver.findElement(confirmOrderButton).click();
        return this;
    }

    public OrderScooter clickYesButton(){
        driver.findElement(yesButton).click();
        return this;
    }
    public boolean isConfirmationDisplayed() {
        return driver.findElement(orderConfirmation).isDisplayed();

    }


}


