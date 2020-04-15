package NowaWypozyczalnia;

public class Zbior {
    private int id;
    private int dataWydania;
    private String autor;
    private String tytul;
    private String wydawnictwo;
    private double wartosc;
    private int iloscKopii;//nowy atrybut

    public Zbior(int id, int dataWydania, String autor, String tytul, String wydawnictwo, double wartosc, int iloscKopii){
        this.id = id;
        this.dataWydania = dataWydania;
        this.autor = autor;
        this.tytul = tytul;
        this.wydawnictwo = wydawnictwo;
        this.wartosc = wartosc;
        this.iloscKopii = iloscKopii;
    }

    public void wyswietlanieZawartosci(){
        System.out.print("\tqty: " + iloscKopii + "\t\t" + dataWydania +"\t\t"+ tytul +"\t\t\t\t"+ autor);
    }

    public void wyswietlanieTytylu(){
        System.out.print(tytul + "\t");
    }

    public int getiloscKopii(){
        return iloscKopii;
    }

    public void setiloscKopii(int iloscKopii){
        this.iloscKopii = iloscKopii;
    }
}
