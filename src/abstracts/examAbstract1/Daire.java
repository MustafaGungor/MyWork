package abstracts.examAbstract1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class Daire extends GeometrikSekil {
    private double yaricap;
    private double pi = Math.PI;

    public void bilgi(double yaricap){
        isimBelirle("Daire Class");
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesap() {
        return pi*Math.sqrt(yaricap);
    }
}
