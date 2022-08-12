import PageObjects.OrderScooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;



@RunWith(Parameterized.class)
public class TopOrderButtonTest {

    WebDriver driver;
    String firstName;
    String secondName;
    String address;
    String metroStation;
    String phoneNumber;
    String orderDate;


    public TopOrderButtonTest(String firstName, String secondName, String address, String metroStation,
                              String phoneNumber, String orderDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.orderDate = orderDate;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Олег", "Иванов", "Усачева,3", "Черкизовская", "+79215645656", "15.08.2022"}


        };

    }
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();

    }

    @Test
    public void orderWithCorrectValuesSuccess() {

        OrderScooter orderScooter = new OrderScooter(driver);
            orderScooter
                .clickTopOrderButton()
                .fillFirstOrderPage(firstName,secondName,address,metroStation,phoneNumber)
                .clickNextButton()
                .fillOrderDate(orderDate)
                .fillRentalPeriod1()
                .clickConfirmOrderButton()
                .clickYesButton();
        boolean result = orderScooter.isConfirmationDisplayed();
        assertTrue(result);

    }

    @After
    public void Teardown() {
        driver.quit();
    }

}


