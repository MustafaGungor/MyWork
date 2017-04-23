package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyArrayList {
    public MyArrayList(){
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        ListIterator iterator = arrayList.listIterator();

        System.out.println("ArrayList i Baştan sona doğru taşıyoruz");
        while (iterator.hasNext()){
            System.out.print(iterator.nextIndex()+".ncı eleman : ");
            System.out.println(iterator.next());
        }

        System.out.println("ArrayList i sondan başa doğru taşıyoruz");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previousIndex()+ ".ncı eleman : ");
            System.out.println(iterator.previous());
        }
    }
    //String elemanda olsa int elemanda olsa aynı şekilde sıralayarak döngüye girer.
    //Aynı eleman olması indisi değiştirmediği için indis olarak istediğin kadar aynı eleman eklenir.
    public void exampleTwo(){
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add("String değişken");

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            System.out.print(listIterator.hasNext() +".ncı eleman : ");
            System.out.println(listIterator.next());
        }

    }
    public void exampleThree(){
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(11);
        arrayList.add(2,3);
        arrayList.add(3,6);
        arrayList.set(3,1);

        System.out.print("Dizinin tüm elemanları : ");
        System.out.println(arrayList);
        System.out.print("Listenin indis numarası 3 olan elemanı : ");
        System.out.println(arrayList.get(3));
    }

}
