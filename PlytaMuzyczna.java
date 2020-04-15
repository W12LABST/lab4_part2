package NowaWypozyczalnia;

public class PlytaMuzyczna extends Zbior {

    private String gatunek;
    private double dlugoscOdtwarzania;

    public PlytaMuzyczna(int id, int dataWydania, String autor, String tytul, String wydawnictwo, double wartosc, int iloscKopii, double dlugoscOdtwarzania, String gatunek) {
        super(id, dataWydania, autor, tytul, wydawnictwo, wartosc, iloscKopii);
        this.dlugoscOdtwarzania = dlugoscOdtwarzania;
        this.gatunek = gatunek;
    }
}
