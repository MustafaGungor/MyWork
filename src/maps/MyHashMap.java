package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Diagram on 23/04/2017.
 * Map arayüzü , elemanlarının anahtar değerlerle eşleştirilerek saklanmasını sağlar
 */
public class MyHashMap {
    public MyHashMap(){
        //Başlangıç sığası 10 , yükleme katsayısı 0.75 olan HashMap öğesi oluşturduk
        HashMap hashMap = new HashMap(10, 0.75f);

        hashMap.put("Bir",1);
        hashMap.put("İki",2);
        hashMap.put("Üç",3);
        hashMap.put("Dört",4);

        Set veri = hashMap.entrySet();
        Set anahtar = hashMap.keySet();

        System.out.println("HashMap ögesinin verileri");
        Iterator iterator = veri.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("HashMap ögesinin anahtarları : ");
        Iterator iterator1 = anahtar.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        //Dizi şeklinde çıktı verir
        System.out.print("HashMap ögeleri : " + hashMap);


    }
}
