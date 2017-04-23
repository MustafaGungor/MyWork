package collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Diagram on 23/04/2017.
 * HashSet Collection
 */
public class MyHashSet {
    public MyHashSet(){
        //HashSet Object descriptions
        HashSet hashSet = new HashSet();

        //HashSet collections add
        hashSet.add("Mustafa");
        hashSet.add("Güngör");
        hashSet.add("Yaş :25");
        hashSet.add("Ankara");

        //HashSet to Iterator bağımlı hale geldi
        Iterator iterator = hashSet.iterator();

        while (iterator.hasNext()){
            //Öğeler tek tek ekrana yazılıyor
            System.out.println("Küme Elemanı : " + iterator.next());
        }
    }
    public Iterator HashSetTwo(){

        //String bir dizi tanımlandı
        String[] objectValue = {"Mustafa","Ahmet","Yunus Emre","Sinan","Ahmet"};
        //true veya false karşılaştırması için
        boolean value;
        //HashSet tanımlandı
        HashSet hashSetT = new HashSet();
        //For ile dizi içerisindeki elemanlar hashSet içerisine add edildi
        for(String s : objectValue){
            value = hashSetT.add(s);
            //Eğer aynı eleman varsa hata mesajı için yazılım yapıldı
            if(!value)
                System.out.println("Kopya Eleman Bulundu : "+s);
        }
        //İterator tanımlanarak sıralı bir şekilde ekrana basılmnası sağlandı
        Iterator iteratorT = hashSetT.iterator();

        while (iteratorT.hasNext()){
            System.out.println("Küme Elemanı 2 : "+ iteratorT.next());
        }
        return iteratorT;
    }
}
