package collections;

import java.util.Vector;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyVector {
    public MyVector(){
        final int kapasite = 3;
        final int artisMiktari = 4;

        Vector v = new Vector(kapasite,artisMiktari);

        v.add(1);
        v.add(15);
        v.add(19);

        System.out.println("Vector'un kapasitesi : " + v.capacity());
        System.out.println("İlk eleman : " + v.firstElement());
        System.out.println("Son eleman : " + v.lastElement());
        v.add(6);
        System.out.println("Vectorun kapasitesi : " + v.capacity());
        System.out.println("3.eleman : " + v.elementAt(2));
    }
}
