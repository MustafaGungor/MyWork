package collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyQueue {
    public MyQueue(){
        Queue kuyruk = new LinkedList();

        //add metoduyla eleman eklerken hata alırsak uygulama exception fırlatır
        kuyruk.add(10);
        kuyruk.add(55);
        kuyruk.add(7);
        //offer metoduyla eleman eklerken hata alırsak geriye false döner
        kuyruk.offer(66);

        while (!kuyruk.isEmpty()){
            System.out.println("Sırada bekleyen eleman : " + kuyruk.peek());
            System.out.println("Sırada bekleyen elemanı getir : " + kuyruk.poll());
        }
    }
}
