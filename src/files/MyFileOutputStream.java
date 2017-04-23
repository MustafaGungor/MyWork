package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Diagram on 24/04/2017.
 */
public class MyFileOutputStream {
    public String onWrite(String path){
        File file = new File(path);
        try {
            //yazma işlemleri
            FileOutputStream stream = new FileOutputStream(file);
            String metin = "FileOutputStream ile Yazdırnma";
            byte veriler[] = metin.getBytes();
            stream.write(veriler);
            stream.close();
            //okuma işlemleri
            char okunacak[] = new char[(int) file.length()];
            FileReader fileReader = new FileReader(file);
            fileReader.read(okunacak); // dizi dolduruldu
            String okunan = new String(okunacak);
            System.out.println(okunan);
        }catch(IOException e){
            e.printStackTrace();
        }
        return "";
    }
}
