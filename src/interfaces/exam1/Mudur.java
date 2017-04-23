package interfaces.exam1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class Mudur implements Calisan {
    double ucretSabiti;
    @Override
    public double ucret() {
        return ucretSabiti;
    }

    @Override
    public void calisanBolumu() {
        System.out.println("Yönetici");
    }

    @Override
    public void ucretBelirle(double ucretSabiti) {
        this.ucretSabiti = ucretSabiti;
    }
}
