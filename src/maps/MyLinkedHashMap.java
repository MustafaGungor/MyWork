package maps;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyLinkedHashMap {
    public MyLinkedHashMap(){
        LinkedHashMap linkedHashMap = new LinkedHashMap();

        //ASCII tablosundaki 65-90 arasındaki değerleri ve anahtarları mapimize koyuyoruz
        for (int i=65;i<=90;i++)
            linkedHashMap.put((char)i,i);

        Set anahtarlar =linkedHashMap.keySet();
        System.out.println("LinkedHashMap Öğeleri");
        System.out.println(linkedHashMap);
        System.out.println("LinkedHashMap öğesinin anahtarları");
        System.out.println(anahtarlar);

    }
}
