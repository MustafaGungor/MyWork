package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyFileReader {

    public String onRead(String path){

        File file = new File(path);
        char veriler[] = new char[(int)file.length()];
        try{
            FileReader fileReader = new FileReader(file);
            fileReader.read(veriler);
            String okunan = new String(veriler);
            System.out.println(okunan);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
