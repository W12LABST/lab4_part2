package NowaWypozyczalnia;

public class Film extends Zbior {

    private String gatunekFilmu;
    private double dlugoscOdtwarzaniaFilmu;

    public Film(int id, int dataWydania, String autor, String tytul, String wydawnictwo, double wartosc, int iloscKopii, double dlugoscOdtwarzaniaFilmu, String gatunekFilmu) {
        super(id, dataWydania, autor, tytul, wydawnictwo, wartosc, iloscKopii);
        this.dlugoscOdtwarzaniaFilmu = dlugoscOdtwarzaniaFilmu;
        this.gatunekFilmu = gatunekFilmu;
    }
}
