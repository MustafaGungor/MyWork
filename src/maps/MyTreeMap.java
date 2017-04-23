package maps;

import java.util.TreeMap;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyTreeMap {
    public MyTreeMap(){
        TreeMap tree = new TreeMap();

        tree.put(1,"Bir");
        tree.put(3,"Üç");
        tree.put(12,"Oniki");
        tree.put(5,"Beş");
        tree.put(2,"İki");

        System.out.println("TreeSet ögeleri : " + tree);
        System.out.print("3 veya 3 den sonraki en büyük anahtar-veri çifti :");
        System.out.println(tree.ceilingEntry(3));
        System.out.print("Azalan Şekilde anahtarlar : ");
        System.out.println(tree.descendingKeySet());
        System.out.print("7 veya 7 den sonraki en küçük anahtar-veri çifti : ");
        System.out.println(tree.floorEntry(7));
        System.out.print("4 den küçük olan anahtar-veri çiftleri : ");
        System.out.println(tree.headMap(4));
        System.out.print("3 den büyük olan anahtar-veri çiftleri : ");
        System.out.println(tree.higherEntry(3));
        System.out.print("2 den küçük olan anahtar değeri : ");
        System.out.println(tree.lowerKey(2));
        System.out.print("Map içerisindeki son veri(Veri silinecek)  : ");
        System.out.println(tree.pollLastEntry());
        System.out.print("2 ile 4 arasındaki anahtar-veri çiftleri : ");
        System.out.println(tree.subMap(2,5));
        System.out.print("4 veya 4 den büyük olan anahtar-veri çiftleri : ");
        System.out.println(tree.tailMap(4));

    }
    public void treeTwo(){
        TreeMap vehicles = new TreeMap();

        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for(Object key: vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        System.out.println("Highest key: " + vehicles.lastKey());
        System.out.println("Lowest key: " + vehicles.firstKey());

        System.out.println("\nPrinting all values:");
        for(Object val: vehicles.values())
            System.out.println(val);
        System.out.println();

        // Clear all values.
        vehicles.clear();

        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}
