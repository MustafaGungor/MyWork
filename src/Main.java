import abstracts.examAbstract1.ExamAbstract1;
import collections.*;
import files.*;
import interfaces.exam1.Exam1;
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
        /////////////////////////////////////////
        //MyNewFileCreate myNewFileCreate = new MyNewFileCreate();
        //myNewFileCreate.onCreate("C:\\Users\\Diagram\\deneme.txt");
        /////////////////////////////////////////
        //MyFileReader myFileReader = new MyFileReader();
        //myFileReader.onRead("C:\\Users\\Diagram\\deneme.txt");
        /////////////////////////////////////////
        //MyFileWriter myFileWriter = new MyFileWriter();
        //myFileWriter.onWrite("C:\\Users\\Diagram\\deneme.txt");
        /////////////////////////////////////////
        //MyFileInputStream myFileInputStream = new MyFileInputStream();
        //myFileInputStream.onRead("C:\\Users\\Diagram\\deneme.txt");
        /////////////////////////////////////////
        //MyFileOutputStream myFileOutputStream = new MyFileOutputStream();
        //myFileOutputStream.onWrite("C:\\Users\\Diagram\\deneme.txt");
        /////////////////////////////////////////
        //MyBufferedReader myBufferedReader = new MyBufferedReader();
        //myBufferedReader.onRead("C:\\Users\\Diagram\\deneme.txt");
        //myBufferedReader.onReadTwo();
        /////////////////////////////////////////
        //MyBufferedWriter myBufferedWriter = new MyBufferedWriter();
        //try {
        //    myBufferedWriter.onWrite("C:\\Users\\Diagram\\deneme.txt");
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}
        ////////////////////////////////////////////
        //Exam1 exam1 = new Exam1();
        //exam1.onStart();
        ////////////////////////////////////////////
        ExamAbstract1 examAbstract1 = new ExamAbstract1();
        examAbstract1.onStart();
    }

}
