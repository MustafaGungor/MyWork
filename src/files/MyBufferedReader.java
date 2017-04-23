package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by MustafaGüngör on 24/04/2017.
 * BufferedReader ile dosyadan okuma
 */
public class MyBufferedReader {
    public String onRead(String path){
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String satir = bufferedReader.readLine();
            while(satir != null){
                System.out.println(satir);
                satir = bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }
    public String onReadTwo(){
        //BufferedReader classı aynı zamanda kullanıcıdan veri girişinede izin verir
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("Bir şeyler yazın : ");
            String deger = bufferedReader.readLine();
            System.out.println("Girilen : " + deger);
            bufferedReader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
