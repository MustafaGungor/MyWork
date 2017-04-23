package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by Diagram on 23/04/2017.
 * LinkedHashSet : ögeler birbirine çift yönlü bağlıdır
 * Kopya eleman bulundurmaz
 */
public class MyLinkedHashSet {
    public MyLinkedHashSet(){
        //LinkedHashSet koleksiyon ögesi oluşturuldu
        LinkedHashSet lhs = new LinkedHashSet();
        //Elemanlar koleksiyona eklendi
        lhs.add("LinkedHashSet1"); //same
        lhs.add("SecondObject");
        lhs.add("ThirdObject");
        lhs.add("FourObject");
        lhs.add("LinkedHashSet1"); //same

        //koleksiyon iteratör öğesine bağlandı
        Iterator iterator = lhs.iterator();

        while(iterator.hasNext()){
            System.out.println("LinkedHashSet Collection : "+ iterator.next());
        }

    }



}
