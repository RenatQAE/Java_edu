package ru.inno.todo;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForTim {
    static HttpClient client;

    @BeforeEach
    public void setUp(){
    client = HttpClientBuilder.create().build();
    }
    private final static String URL = "https://todo-app-sky.herokuapp.com/";

    @Test
    public void shouldReturn200OnGetTasks() throws IOException {
        // Создать клиента

        // HttpClient httpClient = HttpClientBuilder.create().build();

        // Отправить запрос
        HttpGet getRequest = new HttpGet(URL);
        // Получить  Ответ
        HttpResponse response = client.execute(getRequest);
        // Сравнить статус код == 200
        assertEquals(200, response.getStatusLine().getStatusCode());
    }

    @Test
    public void contentTypeShouldBeJson() throws IOException {
        HttpGet getRequest = new HttpGet(URL);
        HttpResponse response = client.execute(getRequest);
        Header contentType = response.getFirstHeader("Content-Type");
        assertEquals("application/json; charset=utf-8 ",contentType.getValue());

    }
}

