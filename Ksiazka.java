package NowaWypozyczalnia;

public class Ksiazka extends Zbior {

    private int liczbaStron;
    private Zbior Mechanika;

    public Ksiazka(int id, int dataWydania, String autor, String tytul, String wydawnictwo, double wartosc, int iloscKopii, int liczbaStron) {
        super(id, dataWydania, autor, tytul, wydawnictwo, wartosc, iloscKopii);
        this.liczbaStron = liczbaStron;
    }
}
