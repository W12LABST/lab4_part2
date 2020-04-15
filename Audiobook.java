package NowaWypozyczalnia;

public class Audiobook extends Zbior {

    private int wagaPlikuAudiobook;
    private double czasTrwaniaAudiobook;

    public Audiobook(int id, int dataWydania, String autor, String tytul, String wydawnictwo, double wartosc, int iloscKopii, double czasTrwaniaAudiobook, int wagaPlikuAudiobook) {
        super(id, dataWydania, autor, tytul, wydawnictwo, wartosc, iloscKopii);
        this.czasTrwaniaAudiobook = czasTrwaniaAudiobook;
        this.wagaPlikuAudiobook = wagaPlikuAudiobook;
    }
}
