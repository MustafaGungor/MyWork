package files;

import java.io.File;
import java.io.IOException;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyNewFileCreate {

    public String onCreate(String path){
        //Belirtilen path de ismiyle beraber dosyayı oluşturdu
        File file = new File(path);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Dosya yolunu öğrenme
        System.out.println(file.getAbsolutePath());
        //Delete metodu dosyayı siler
        //exists olup olmadığını kontrol eder
        // file.delete();
        // file.exists();

        //Eğer dosya değil direk klasör oluşturulmak istenirse mkdir metodu kullanılır
        //file.mkdir()

        //Dosya adını değiştirmek istenirse file.renameTo(değişiklik);



        return "Değer döndürüldü";
    }
}
