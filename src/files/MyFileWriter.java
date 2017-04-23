package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyFileWriter {
    public String onWrite(String path){
        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(file);
            String writerString = "Bu bir deneme yazısıdır";
            writer.write(writerString);
            writer.close(); //bağlantı kapatıldı
            //okuma işlemleri
            char veriler[] = new char[(int) file.length()];
            FileReader fileReader = new FileReader(file);
            fileReader.read(veriler);
            String okunan = new String(veriler);
            System.out.println(okunan);
        }catch (IOException e){
            e.printStackTrace();
        }

        return "";
    }
}
