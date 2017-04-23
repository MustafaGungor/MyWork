package files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Diagram on 24/04/2017.
 */
public class MyBufferedOutputStream {
    public void onWrite(String path){
        File file = new File(path);
        try{
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            bufferedOutputStream.write("Java'yı seviyorum ".getBytes());
            bufferedOutputStream.flush(); // buffer içerisindekiler dosyaya yazıldı
            bufferedOutputStream.close(); // dosya kapatıldı
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
