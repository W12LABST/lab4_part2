package NowaWypozyczalnia;
//te same komentarze dotyczą każdej klasy dziedziczącej po zbiorze
public class Ebook extends Zbior {
    //Poprawiona enkapsulacja:
    private int wagaPlikuEbook;
    private int iloscStronEbook;
    //Słowo kluczowe "super" potrzebne do wywołania metody klasy bazowej.
    //Słowo kluczowe "this" potrzebne do nadania wartości atrybutom klasy podczas tworzenia nowych obiektów:
    public Ebook(int id, int dataWydania, String autor, String tytul, String wydawnictwo, double wartosc, int iloscKopii, int wagaPlikuEbook, int iloscStronEbook) {
        super(id, dataWydania, autor, tytul, wydawnictwo, wartosc, iloscKopii);
        this.wagaPlikuEbook = wagaPlikuEbook;
        this.iloscStronEbook = iloscStronEbook;
    }
}
