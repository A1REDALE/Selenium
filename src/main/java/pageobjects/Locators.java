package PageObjects;

import org.openqa.selenium.By;

public class Locators {

    //Лого Яндекс в верхнем левом углу страницы
    private final By YaLogo = By.className("Header_LogoYandex__3TSOI");
    //Лого "Самокат" в верхнем левом углу страницы
    private final By scooterLogo = By.className("Header_LogoScooter__3lsAR");
    //Кнопка "Заказать" в верхней правой части страницы
    private final By topOrderButton = By.xpath(".//button[@class='Button_Button_ra12g']");
    //Кнопка "Статус заказа" в верхней правой части страницы
    private final By orderStatusButton = By.className("Header_Link__1TAG7");
    // Кнопка "Заказать" в нижней части страницы
    private final By downOrderButton = By.cssSelector(".Button_UltraBig__UU3Lp");
    //Кнопка "Сколько это стоит? И как оплатить?"
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
    //Поле ввода "Имя"
    private final By inputFirstName = By.xpath(".//input[@placeholder='* Имя']");
    //Поле ввода "Фамилия"
    private final By inputSecondName = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле ввода "Адрес:куда привезти заказ"
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле ввода "Станция метро"
    private final By inputMetroStation = By.xpath(".//input[@placeholder='* Станция метро']");
    //Поле ввода "Телефона: на него позвонит курьер"
    private final By inputPhoneNumber = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private final By nextButton = By.xpath("//*[@id='root']/div/div[2]/div[3]/button");
    //Поле ввода "Когда привезти самокат"
    private final By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Поле ввода "Срок аренды"
    private final By inputRentalPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");
    //Кнопка "Заказать" формы Про Аренду
    private final By confirmOrderButton = By.xpath("//*[@id='root']/div/div[2]/div[3]/button[1]");
    //Кнопка "Назад"
    private final By BackButton = By.xpath("//*[@id='root']/div/div[2]/div[3]/button[2]");
    //Кнопка "Да" окна подтверждения заказа
    private final By yesButton = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]");
    //Всплывающее окно с информацией о заказе
    private final By orderConfirmation = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");







}