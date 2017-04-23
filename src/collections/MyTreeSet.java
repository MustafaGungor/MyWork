package collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyTreeSet {
    public MyTreeSet(){
        TreeSet treeSet = new TreeSet();

        treeSet.add("İstanbul");
        treeSet.add("Ankara");
        treeSet.add("Konya");
        treeSet.add("Niğde");
        //Tip uyuşmazlığı nedeniyle böyle bir eleman ekleyemeyiz
        //treeSet.add(1);

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()){
            System.out.println("TreeSet Öğeleri : "+ iterator.next());
        }

    }

    //Bazı özel fonksiyonlar ile kullanım
    public TreeSet secondFunction(){
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(21);
        treeSet.add(13);
        treeSet.add(10);

        System.out.println("TreeSet ögesinin elemanları");
        System.out.println(treeSet);
        System.out.println("Koleksiyonun ilk değeri : "+ treeSet.first());
        System.out.println("Koleksiyonun son ögesi : " + treeSet.last());
        System.out.println("Koleksiyondaki 7 den küçük elemanlar : ");
        System.out.println(treeSet.headSet(7));
        System.out.println("Koleksiyondaki 6 ile 13 arasındaki ögeler : ");
        System.out.println(treeSet.subSet(6,13));
        System.out.println("Koleksiyondaki 7 ve 7 den büyük elemanlar : ");
        System.out.println(treeSet.tailSet(7));

        return treeSet;

    }
}
