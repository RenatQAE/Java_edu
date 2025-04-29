package ru.inno.todo.Selenium.webdriver.starting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetDemo {
    private static String URL = "https://the-internet.herokuapp.com/";
    private static String endpointAlerts = "javascript_alerts";

    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void getUrl() {

        driver.get(URL+endpointAlerts);
        List<WebElement> buttons = driver.findElements(By.cssSelector("ul li button"));
        buttons.get(2).click();
        String mustBeAlert ="I am a JS prompt";
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        System.out.println(text);
        Assertions.assertEquals(mustBeAlert,text);
    }

}
