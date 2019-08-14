import com.epam.Sergei_Skorobogatov.java.module_2.Aircrafts.Boeing737;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Boeing737 boeing737 = new Boeing737(1987, 10000, 150, 2600, "Boeing-737");
        try {
            FileOutputStream fos = new FileOutputStream("test.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(boeing737);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
