package interfaces.exam1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class SatisElemani implements Calisan {
    double ucretSabiti;
    double komisyon;
    final double komisyonOran = 0.3;
    @Override
    public double ucret() {
        return ((ucretSabiti*oran)+komisyon);
    }

    @Override
    public void calisanBolumu() {
        System.out.println("Satış Elemanı");
    }

    @Override
    public void ucretBelirle(double ucretSabiti) {
        this.ucretSabiti = ucretSabiti;
    }
    //satış elemanının komisyonunu belirleyen metod
    public void satisKomisyonuBelirle(int adet){
        komisyon = adet*komisyonOran;
    }
}
