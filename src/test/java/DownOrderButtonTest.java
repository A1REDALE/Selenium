import pageobjects.OrderScooter;
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
    public class DownOrderButtonTest {
        WebDriver driver;
        String firstName;
        String secondName;
        String address;
        String metroStation;
        String phoneNumber;
        String orderDate;
        public DownOrderButtonTest(String firstName, String secondName, String address, String metroStation,
                    String phoneNumber, String orderDate) {
                this.firstName = firstName;
                this.secondName = secondName;
                this.address = address;
                this.metroStation = metroStation;
                this.phoneNumber = phoneNumber;
                this.orderDate = orderDate;
        }
        @Parameterized.Parameters(name = "Тестовые данные: {1} {2} {3} {4} {5} {6}")
        public static Object[][] getTestData() {
            return new Object[][]{
                    {"Уасся", "упыпыупжызпхыпхыдуьшыоаыалызщалыщзщлаыйцвйцвйвйвйвйвйвйвйвйвеоегнлгндзалызалзыалзыалза",
                            "Комсомольский,18", "Черкизовская", "+792153490812", "08.07.2022"}
            };
        }
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(By.id("rcc-confirm-button")).click();
    }
        @Test
        public void orderWithNotCorrectValuesSuccess() {
            OrderScooter orderScooter = new OrderScooter(driver);
            orderScooter.
                    clickDownOrderButton()
                    .fillFirstOrderPage(firstName,secondName,address,metroStation,phoneNumber)
                    .clickNextButton()
                    .fillOrderDate(orderDate)
                    .fillRentalPeriod2()
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

























