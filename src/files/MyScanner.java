package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Diagram on 24/04/2017.
 */
public class MyScanner {
    public void onRead(String path){
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException E){
            System.out.println("Dosyaya Bağlanırken Hata Oluştu");
        }
    }
}
