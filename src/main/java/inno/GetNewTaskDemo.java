package inno;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GetNewTaskDemo {
    private final static String URL = "https://todo-app-sky.herokuapp.com/";

    public static void main(String[] args) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();

        HttpGet request = new HttpGet(URL);


        HttpResponse responce = client.execute(request);
        System.out.println(responce.getStatusLine().getStatusCode());
        System.out.println(responce.getStatusLine().getReasonPhrase());
        System.out.println(responce.getStatusLine().getProtocolVersion());

        String string = EntityUtils.toString(responce.getEntity());
        System.out.println(string);

//        Header[] headers = responce.getHeaders("Content-Type");
        Header[] headers = responce.getAllHeaders();
        for (Header header : headers) {
            System.out.println(header);
        }

    }

}

