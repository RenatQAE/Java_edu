package JavaRush;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class les2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\greencard\\21.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Desktop");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
