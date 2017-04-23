package abstracts.examAbstract1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class Ucgen extends GeometrikSekil {
    private double yukseklik;
    private double taban;
    public void bilgi(double yukseklik,double taban){
        isimBelirle("Üçgen Class");
        this.yukseklik = yukseklik;
        this.taban = taban;
    }
    @Override
    public double alanHesap() {
        return (taban*yukseklik)/2;
    }
}
