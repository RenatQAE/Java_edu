package ru.inno.todo.Selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Start {
    public static String URL = "https://www.labirint.ru/";

    @Test
    public void getTitle() {
        WebDriver driver = new ChromeDriver();

        String titleMustBe = "Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры";
        driver.get(URL);
        String title = driver.getTitle();
        System.out.println(title);
        Assertions.assertEquals(titleMustBe, title);
        driver.quit();

    }
}
