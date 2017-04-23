package abstracts.examAbstract1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class Dikdortgen extends GeometrikSekil {
    private double uzunKenar;
    private double kisaKenar;

    public void bilgi(double uzunKenar,double kisaKenar){
        isimBelirle("Dikdörtgen Class");
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alanHesap() {
        return uzunKenar*kisaKenar;
    }
}
