package inno;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class CreateNewTaskDemo {
    private final static String URL = "https://todo-app-sky.herokuapp.com/";

    public static void main(String[] args) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        String json = """
                {
                "title": "HTTP Client demo",
                "completed":false
                }
                """;
        HttpEntity regBody = new StringEntity(json);

        HttpPost createNewTaskRequest = new HttpPost(URL);
        createNewTaskRequest.setEntity(regBody);
        createNewTaskRequest.addHeader(new BasicHeader("Content-Type","application/json"));

        HttpResponse createNewTaskResponce = client.execute(createNewTaskRequest);
        String bodyResp = EntityUtils.toString(createNewTaskResponce.getEntity());
        System.out.println(createNewTaskResponce.getStatusLine());
        System.out.println(bodyResp);
    }
}
