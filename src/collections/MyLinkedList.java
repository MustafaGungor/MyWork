package collections;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;

/**
 * Created by Diagram on 23/04/2017.
 * LinkedList (Bağlı Liste)
 */
public class MyLinkedList {
    public  MyLinkedList(){
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(4);
        linkedList.addLast(0);

        System.out.println("Listenin tüm elemanları : "+linkedList);
        System.out.println("Listenin ilk elemanı : " + linkedList.getFirst());
        System.out.println("Listenin son elemanı : " + linkedList.getLast());
    }

}
