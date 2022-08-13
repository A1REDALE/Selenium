import pageobjects.HomePageScooter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

    @RunWith(Parameterized.class)
     public class HomePageTest {
        WebDriver driver;
        private final String expected;
        private final String questionText;
        public HomePageTest(String questionText, String expected) {
            this.expected = expected;
            this.questionText = questionText;
        }
        @Parameterized.Parameters(name = "Тестовые данные: {1} {2}")
        public static Object[][] getTextData() {
            return new Object[][]{
                    {"Сколько это стоит? И как оплатить?", "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    {"Хочу сразу несколько самокатов! Так можно?", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                    {"Как рассчитывается время аренды?", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                    {"Можно ли заказать самокат прямо на сегодня?", "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                    {"Можно ли продлить заказ или вернуть самокат раньше?", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                    {"Вы привозите зарядку вместе с самокатом?", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                    {"Можно ли отменить заказ?", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                    {"Я жизу за МКАДом, привезёте?", "Да, обязательно. Всем самокатов! И Москве, и Московской области."}
            };
        }
        @Before
        public void setUp(){
            driver = new ChromeDriver();
            driver.get("https://qa-scooter.praktikum-services.ru/");
            driver.findElement(By.id("rcc-confirm-button")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }
        @Test
        public void CheckAnswerText() {
            HomePageScooter objHomePage = new HomePageScooter(driver);
            WebElement element = driver.findElement(By.xpath("//*[text()='" + questionText + "']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            element.click();
            WebElement element2 = driver.findElement(By.xpath("//*[text()='" + expected + "']"));
            String answerText = objHomePage.getElementsText(element2);
            assertEquals(expected, answerText);
        }
        @After
        public void Teardown() {
            driver.quit();
        }
    }








