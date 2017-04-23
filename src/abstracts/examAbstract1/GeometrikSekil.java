package abstracts.examAbstract1;

/**
 * Created by Diagram on 24/04/2017.
 */
public abstract class GeometrikSekil {
    private String isim;

    public void isimBelirle(String isim) {
        this.isim = isim;
    }
    //Şeklin ismini döndüren metod
    public String isimGetir(){
        return this.isim;
    }
    //soyut metod tanımlandı
    public abstract double alanHesap();
}
