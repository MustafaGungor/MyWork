package maths;

import maps.MyMapAndHashMap;

/**
 * Created by Diagram on 23/04/2017.
 */
public class MyMath {
    public MyMath(){
        // Pi Sayısı
        double pi = Math.PI;
        System.out.println("Pi : " + pi);

        // Karekök
        double karekok = Math.sqrt(16);
        System.out.println("Karekok 16 : " + karekok);

        // Mutlak Değer
        double mutlakDeger = Math.abs(-10);
        System.out.println("Mutlak Değer -10 : " + mutlakDeger);

        // Tavana Yuvarla
        double tavanayuvarla = Math.ceil(11.3);
        System.out.println("Tavana Yuvarla 11.3 : " + tavanayuvarla);

        // Tabana Yuvarla
        double tabanayuvarla = Math.floor(11.7);
        System.out.println("Tabana Yuvarla 11.7 : " + tabanayuvarla);

        // Üst Alma
        double ussu = Math.pow(2, 4);
        System.out.println("Üst Alma 2 üzeri 4 : " + ussu);

        // Rasgele Sayı Üretme Math Sınıfı ile
        // Math.random() 0 ile 1 arasında sayı üretir.
        // Biz Math.random()  dan gelen sayıyı 100 ile çarparak 1 ile 100 arasında
        // Küsüratlı bir sayı üretiriz. Bunu int e cast attiğimizde
        // Küsürat gider. Not : herdefasında farklı sayı üretecektir.
        int rasgele = (int) (Math.random() * 100);
        System.out.println("0 ile 100 arasında rasgele Sayı : " + rasgele);

        System.out.println();

        // Trigonometrik fonksiyonlar
        double sin = Math.sin((Math.PI / 6));// 30
        System.out.println("Sin Pi/6 : " + sin);
        double sin2 = Math.sin((Math.PI / 4));// 45
        System.out.println("Sin Pi/4 : " + sin2);
        double cos = Math.cos(Math.PI / 6);// 30
        System.out.println("Cos Pi/6 : " + cos);
        double cos2 = Math.cos(Math.PI / 4);// 45
        System.out.println("Cos Pi/4 : " + cos2);
        double tan = Math.tan(Math.PI / 6);// 30
        System.out.println("Tan Pi/6 : " + tan);
        double tan2 = Math.tan(Math.PI / 4);// 45
        System.out.println("Tan Pi/4 : " + tan2);

        System.out.println();

        // Not Biz burada bulunan açıları Radian cinsindende bulabilirdik
        // Örnek Pi/6 yani sin 30 u bulalım
        double rderece = Math.toRadians(30);
        double sinr = Math.sin(rderece);// 30
        System.out.println("Radyan Sin : (Pi/6) | (30) : " + sinr);

        //İstediğimiz dereceyi yapabiliriz
        double rderece2 = Math.toRadians(45);
        double sinr2 = Math.sin(rderece2);// 45
        System.out.println("Radyan Sin : (Pi/4) | (45) : " + sinr2);

        System.out.println();

        //Logaritmik fonksiyonlar
        double ustel = Math.exp(4); // e üzeri 4
        System.out.println("e üzeri 4 : " + ustel);
        double logaritma = Math.log(16) / Math.log(2); // return 4
        System.out.println("Logaritma 2 tabanında 16 : " + logaritma);
        double logaritma10 = Math.log10(100);
        System.out.println("Logaritma 100 : " + logaritma10);

        System.out.println();

        // İki sayıdan büyüğünü döndürme
        int sayimax = Math.max(5, 7);
        System.out.println("Max 5,7 : " + sayimax);
        // İki sayıdan en küçüğü döndürme
        int sayimin = Math.min(5, 7);
        System.out.println("Mix 5,7 : " + sayimin);
    }
}
