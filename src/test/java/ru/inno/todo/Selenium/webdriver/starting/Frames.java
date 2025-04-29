package ru.inno.todo.Selenium.webdriver.starting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    private static String URL = "https://the-internet.herokuapp.com/nested_frames";
    private WebDriver driver;


    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }


    @Test
    public void getUrl(){

        driver.get(URL);
        driver.switchTo().frame("frame-bottom");
        WebElement body = driver.findElement(By.cssSelector("body"));
        System.out.println(body.getText());
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement body2 = driver.findElement(By.cssSelector("body"));
        System.out.println(body2.getText());
    }
}
