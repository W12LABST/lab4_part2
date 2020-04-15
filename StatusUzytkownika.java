package NowaWypozyczalnia;
//nowa klasa
public class StatusUzytkownika {
//klasa służaca nadawaniu statusu tworzonym użytkownikom
    private boolean status;

    public void setStatus(boolean status){
        this.status = status;
    }

    public void zakladanieKonta(){
        if(status){
            System.out.println("Konto typu admin.");
        } else {System.out.println("Konto zwykłe.");}
    }
}
