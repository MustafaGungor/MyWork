package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by Diagram on 24/04/2017.
 */
public class MyBufferedWriter {
    public void onWrite(String path) throws Exception{
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Bu bir deneme yazısıdır mybufferedWriter");
        bufferedWriter.flush(); // flush() metodu ile ekran temizlendi
        bufferedWriter.close();
    }
}
