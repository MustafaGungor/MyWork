import collections.*;
import files.MyFileInputStream;
import files.MyFileReader;
import files.MyFileWriter;
import files.MyNewFileCreate;
import maps.MyHashMap;
import maps.MyLinkedHashMap;
import maps.MyMapAndHashMap;
import maps.MyTreeMap;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //1-) MyHashSet
        //MyMapAndHashMap myVector = new MyMapAndHashMap();
        //MyNewFileCreate myNewFileCreate = new MyNewFileCreate();
        //myNewFileCreate.onCreate("C:\\Users\\Diagram\\deneme.txt");
        //MyFileReader myFileReader = new MyFileReader();
        //myFileReader.onRead("C:\\Users\\Diagram\\deneme.txt");
        //MyFileWriter myFileWriter = new MyFileWriter();
        //myFileWriter.onWrite("C:\\Users\\Diagram\\deneme.txt");
        MyFileInputStream myFileInputStream = new MyFileInputStream();
        myFileInputStream.onRead("C:\\Users\\Diagram\\deneme.txt");
    }

}
