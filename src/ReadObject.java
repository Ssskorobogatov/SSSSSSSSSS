import com.epam.Sergei_Skorobogatov.java.module_2.Aircrafts.Boeing737;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("test.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Boeing737 boeing737 = (Boeing737) ois.readObject();
            System.out.println(boeing737.mark);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
