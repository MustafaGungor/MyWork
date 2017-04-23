package abstracts.examAbstract1;

/**
 * Created by Diagram on 24/04/2017.
 */
public class ExamAbstract1 {
    public void onStart(){
        Daire daire = new Daire();
        Dikdortgen dikdortgen = new Dikdortgen();
        Ucgen ucgen = new Ucgen();

        daire.bilgi(5.0);
        dikdortgen.bilgi(5,5);
        ucgen.bilgi(5,5);

        System.out.println(daire.isimGetir()+ " : " + daire.alanHesap());
        System.out.println(dikdortgen.isimGetir()+ " : " + dikdortgen.alanHesap());
        System.out.println(ucgen.isimGetir()+ " : " + ucgen.alanHesap());

    }
}
