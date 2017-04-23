package interfaces.exam1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class Exam1 {
    public void onStart(){
        ///Işçi Bilgileri
        Isci ucretliIsci = new Isci();
        ucretliIsci.calisanBolumu();
        ucretliIsci.ucretBelirle(1000);
        System.out.println("Maaşı : " + ucretliIsci.ucret());

        //Müdür Bilgileri
        Mudur yonetici = new Mudur();
        yonetici.calisanBolumu();
        yonetici.ucretBelirle(1600);
        System.out.println("Maaşı : " +yonetici.ucret());

        //Satış Elemanı Bilgileri
        SatisElemani satisElemani = new SatisElemani();
        satisElemani.calisanBolumu();
        satisElemani.ucretBelirle(1009);
        satisElemani.satisKomisyonuBelirle(200);
        System.out.println("Komisyon : "+satisElemani.komisyon);
        System.out.println("Maaşı : " + satisElemani.ucret());

    }
}
