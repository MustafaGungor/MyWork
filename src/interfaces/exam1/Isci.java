package interfaces.exam1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class Isci implements Calisan {
    double ucretSabiti;
    @Override
    public double ucret() {
        return ucretSabiti*oran;
    }

    @Override
    public void calisanBolumu() {
        System.out.println("Ücretli Çalışan");
    }

    @Override
    public void ucretBelirle(double ucretSabiti) {
        this.ucretSabiti = ucretSabiti;
    }
}
