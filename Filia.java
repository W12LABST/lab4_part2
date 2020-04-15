package NowaWypozyczalnia;
//nowa klasa
import java.sql.Timestamp;

public class Filia {

    private String adresFilii;
    private Timestamp dataUtworzenia;
    private StatusUzytkownika admin;
    private Uzytkownik uzytkownikAdministrator;

    public Filia(String adresFilii, Timestamp dataUtworzenia){
        this.adresFilii = adresFilii;
        this.dataUtworzenia = dataUtworzenia;
    }

    public void obecnyAdministratorWypozyczalni(){
        this.uzytkownikAdministrator = new Uzytkownik(true);//kompozycja, kolejne wykorzystanie obiektu do
        uzytkownikAdministrator.setImie("Jan");                          //stworzenia nowej klasy.
        uzytkownikAdministrator.setNazwisko("Malinowski");               //korzystam z konstruktora przeciążonego
        uzytkownikAdministrator.setAdres("ul. Miejska 12");              //aby stworzyć użytkownika typu administrator
        uzytkownikAdministrator.setWiek(60);//ustawianie poszczególnych wartości nowego obiektu będącego częścią klasy Filia
        uzytkownikAdministrator.setDataRejestracji(Timestamp.valueOf("1998-10-05 12:00:00.00"));
    }
    //gettery słuzące do pobrania danych o dostepie prywatnym dot. utworzonego obiektu klasy Filia przy pomocy obiektu
    //klasy Uzytkownik
    public String getImie(){
        return uzytkownikAdministrator.getImie();
    }
    public String getNazwisko(){
        return uzytkownikAdministrator.getNazwisko();
    }
    public String getAdres(){
        return uzytkownikAdministrator.getAdres();
    }
    public int getWiek(){
        return uzytkownikAdministrator.getWiek();
    }
    public Timestamp getDataRejestracji(){
        return uzytkownikAdministrator.getDataRejestracji();
    }

    public String getAdresFilii(){
        return adresFilii;
    }

    public Timestamp getDatautworzenia(){
        return dataUtworzenia;
    }

}
