package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Diagram on 23/04/2017.
 * FileInputStream dosya okuma
 */
public class MyFileInputStream {
    public void onRead(String path){
        File file =  new File(path);
        try {
            FileInputStream oku = new FileInputStream(file);
            byte dizi[] = new byte[(int) file.length()];
            oku.read(dizi);
            String okunan = new String(dizi);
            System.out.println(okunan);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
