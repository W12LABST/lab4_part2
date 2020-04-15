package NowaWypozyczalnia;
//nowa klasa
import java.sql.Timestamp;

public class Uzytkownik {

    private String imie;
    private String nazwisko;
    private String adres;
    private int wiek;
    private Timestamp dataRejestracji;
    private StatusUzytkownika zwykly;
    private StatusUzytkownika admin;
    private boolean admintrigger;//zmienna służąca wywołaniu konstruktora przeciążonego

    public Uzytkownik(){
        this.zwykly = new StatusUzytkownika();//kompozycja
        zwykly.setStatus(false);//wykorzystanie obiektów istniejącej klasy do stworzenia nowej
        zwykly.zakladanieKonta();//
    }
    public Uzytkownik(boolean admintrigger){
        this.admin = new StatusUzytkownika();//przeciążony konstruktor służący do tworzenia administratora
        admin.setStatus(true);
    }
    //gettery i settery służące nadawania wartości danym o dostepie prywatnym oraz wyprowadania ich na konsolę w main
    public void setImie(String imie){
        this.imie = imie;
    }

    public String getImie(){
        return imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public void setAdres(String adres){
        this.adres = adres;
    }

    public String getAdres(){
        return adres;
    }

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    public int getWiek(){
        return wiek;
    }

    public void setDataRejestracji(Timestamp dataRejestracji){
        this.dataRejestracji = dataRejestracji;
    }

    public Timestamp getDataRejestracji(){
        return dataRejestracji;
    }

}
