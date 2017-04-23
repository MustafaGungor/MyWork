package files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Diagram on 24/04/2017.
 * Dosya okuma için alternatif diğer class
 */
public class MyBufferedInputStream {
    public void onRead(String path){
        File file = new File(path);
        byte dizi[] = new byte[1000];
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int readed = 0;
            while ((readed=bufferedInputStream.read(dizi))!=-1){
                String data = new String(dizi,0,readed);
                System.out.println(data);
            }
            bufferedInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
