package NowaWypozyczalnia;
//Komentarze będą dotyczyć tylko i wyłącznie wprowadzonych zmian. Opis starej części kodu w programie z lab2
import java.io.IOException;
import java.util.Scanner;
import java.sql.Timestamp;

public class NowaWypozyczalnia {
    public static void main(String[] args) throws IOException {
        //Obiekty utworzone tylko i wyłącznie za pomocą konstruktorów:
        //-------------------------
        Ksiazka Mechanika = new Ksiazka(481759, 2012, "Jan Kowalski", "Mechanika", "Pwr", 50,2, 350);
        PlytaMuzyczna BestHits = new PlytaMuzyczna(719765, 1985, "The Band", "Best Hits", "EMI", 200,2, 46.35, "rock");
        Film Documentary = new Film(581476, 2019, "BBC", "Dokument przyrodniczy", "BBC", 50,2, 123.58, "Dokument");
        Audiobook Wojna = new Audiobook(493285, 2020, "Marcin Maliniak", "Wojna", "eKsiążka", 20,2, 452.47, 15);
        Ebook Historia = new Ebook(189327, 2015, "Adam Baranowski", "Historia", "eKsiążka", 20,2, 45, 500);
        //-------------------------
            Filia nr1 = new Filia("ul. Zielona 4/56", Timestamp.valueOf("1956-05-28 12:00:00.00"));//tworzenie instancji klasy Filia
            nr1.obecnyAdministratorWypozyczalni();//wywołanie metody tworzącej administratora
            Timestamp defaultTime = Timestamp.valueOf("2000-01-01 00:00:00.00");
            double karyFinansowe = 0;
            //Dane o wypożyczeniach tym razem przechowywane są w tablicach:
            boolean tablica[] = new boolean[10];
            Timestamp tablica2[] = new Timestamp[5];
            zerowanie(tablica, tablica2);
            Scanner scan = new Scanner(System.in);
                System.out.println("Rejestracja użytkownika.");
                Uzytkownik u1 = new Uzytkownik();//Tworzenie nowego obiektu klasy użytkownik, rodzaju zwykłe
                System.out.println("Podaj swoje imię:");
                u1.setImie(scan.nextLine());
                System.out.println("Podaj swoje nazwisko:");
                u1.setNazwisko(scan.nextLine());
                System.out.println("Podaj swój adres:");
                u1.setAdres(scan.nextLine());
                System.out.println("Podaj swój wiek:");
        Timestamp dataRejestracji = new Timestamp(System.currentTimeMillis());
        u1.setDataRejestracji(dataRejestracji);
                try {//obsługa wyjątku
                    u1.setWiek(scan.nextInt());
                } catch (Exception e) {
                    e.printStackTrace();
                    u1.setWiek(0);
                }
        while (true) {//lekko zmodyfikowany moduł sprawdzający, dane dot. wypożyczeń w tablicach:
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                defaultTime = timestamp;
                if ((roznicaCzasow(defaultTime, tablica2[0])) && tablica[0] && !tablica[5]) {
                    tablica[5] = true;
                    karyFinansowe = karyFinansowe + 10;
                }
                if ((roznicaCzasow(defaultTime, tablica2[1])) && tablica[1] && !tablica[6]) {
                    tablica[6] = true;
                    karyFinansowe = karyFinansowe + 10;
                }
                if ((roznicaCzasow(defaultTime, tablica2[2])) && tablica[2] && !tablica[7]) {
                    tablica[7] = true;
                    karyFinansowe = karyFinansowe + 10;
                }
                if ((roznicaCzasow(defaultTime, tablica2[3])) && tablica[3] && !tablica[8]) {
                    tablica[8] = true;
                    karyFinansowe = karyFinansowe + 10;
                }
                if ((roznicaCzasow(defaultTime, tablica2[4])) && tablica[4] && !tablica[9]) {
                    tablica[9] = true;
                    karyFinansowe = karyFinansowe + 10;
                }
                cls();//wywołanie funkcji czyszczącej konsolę
                System.out.println("\t\t\t\t\tWitaj w wypożyczalni multimedialnej " + u1.getImie() + "!\n\n");
                if (karyFinansowe > 0) {
                    System.out.println("\t\t\t\t\tKonto zablokowane, opłać kary finansowe oraz oddaj pozycje.");
                }

                System.out.print("\t\t\t\t\t\t  \n\n\t\t\t\t\tAby wejść na swoje konto wciśnij enter:");
                System.in.read();
                while (true) {
                    cls();
                    System.out.println("\t\t\t\t\t   Jesteś na koncie klienta.");
                    System.out.print("Wypożyczone pozycje:\t");
                    if (tablica[0]) {
                        Mechanika.wyswietlanieTytylu();
                    }
                    if (tablica[1]) {
                        BestHits.wyswietlanieTytylu();
                    }
                    if (tablica[2]) {
                        Documentary.wyswietlanieTytylu();
                    }
                    if (tablica[3]) {
                        Wojna.wyswietlanieTytylu();
                    }
                    if (tablica[4]) {
                        Historia.wyswietlanieTytylu();
                    }
                    if (!tablica[0] && !tablica[1] && !tablica[2] && !tablica[3] && !tablica[4]) {
                        System.out.print("brak");
                    }
                    System.out.println("\nZaległosci finansowe:\t" + karyFinansowe + "\tPLN");
                    System.out.println("Data utworzenia konta: " + dataRejestracji);
                    if (karyFinansowe > 0) {
                        System.out.println("Konto zablokowane, opłać kary finansowe oraz oddaj pozycje.");
                    }
                    System.out.println("\nWciśnij:\n(z + enter) aby skorzystać z zasobów wypożyczalni\n(o + enter) aby" +
                            " oddać pozycje oraz opłacić ew. kary\n(u + enter) informacje o użytkowniku\n(i + enter) informacje o wypożyczalni.\n\n\n");
                    System.out.println("[back] - (b + enter)");
                    char wyborKlienta = scan.next().charAt(0);
                    Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
                    defaultTime = timestamp1;
                    if ((roznicaCzasow(defaultTime, tablica2[0])) && tablica[0] && !tablica[5]) {
                        tablica[5] = true;
                        karyFinansowe = karyFinansowe + 10;
                    }
                    if ((roznicaCzasow(defaultTime, tablica2[1])) && tablica[1] && !tablica[6]) {
                        tablica[6] = true;
                        karyFinansowe = karyFinansowe + 10;
                    }
                    if ((roznicaCzasow(defaultTime, tablica2[2])) && tablica[2] && !tablica[7]) {
                        tablica[7] = true;
                        karyFinansowe = karyFinansowe + 10;
                    }
                    if ((roznicaCzasow(defaultTime, tablica2[3])) && tablica[3] && !tablica[8]) {
                        tablica[8] = true;
                        karyFinansowe = karyFinansowe + 10;
                    }
                    if ((roznicaCzasow(defaultTime, tablica2[4])) && tablica[4] && !tablica[9]) {
                        tablica[9] = true;
                        karyFinansowe = karyFinansowe + 10;
                    }
                    if (wyborKlienta == 'z' && karyFinansowe == 0) {
                        while (true) {
                            cls();
                            System.out.println("\t\t\t\t\t   Zasoby wypożyczalni:");
                            System.out.print("\t\t\t\t\t   (1)");
                            Mechanika.wyswietlanieZawartosci();
                            System.out.print("\n\t\t\t\t\t   (2)");
                            BestHits.wyswietlanieZawartosci();
                            System.out.print("\n\t\t\t\t\t   (3)");
                            Documentary.wyswietlanieZawartosci();
                            System.out.print("\n\t\t\t\t\t   (4)");
                            Wojna.wyswietlanieZawartosci();
                            System.out.print("\n\t\t\t\t\t   (5)");
                            Historia.wyswietlanieZawartosci();
                            System.out.println("\n\t\t\t\t\t   (6)Wyjście do menu klienta");
                            System.out.print(" Wciśnij (nr opcji + enter) aby wypożyczyć daną pozycję lub powrócić do menu klienta: ");
                            char wyborKlienta2 = scan.next().charAt(0);
                            Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
                            defaultTime = timestamp2;
                            if ((roznicaCzasow(defaultTime, tablica2[0])) && tablica[0] && !tablica[5]) {
                                tablica[5] = true;
                                karyFinansowe = karyFinansowe + 10;
                            }
                            if ((roznicaCzasow(defaultTime, tablica2[1])) && tablica[1] && !tablica[6]) {
                                tablica[6] = true;
                                karyFinansowe = karyFinansowe + 10;
                            }
                            if ((roznicaCzasow(defaultTime, tablica2[2])) && tablica[2] && !tablica[7]) {
                                tablica[7] = true;
                                karyFinansowe = karyFinansowe + 10;
                            }
                            if ((roznicaCzasow(defaultTime, tablica2[3])) && tablica[3] && !tablica[8]) {
                                tablica[8] = true;
                                karyFinansowe = karyFinansowe + 10;
                            }
                            if ((roznicaCzasow(defaultTime, tablica2[4])) && tablica[4] && !tablica[9]) {
                                tablica[9] = true;
                                karyFinansowe = karyFinansowe + 10;
                            }
                            if (wyborKlienta2 == '1' && tablica[0] || wyborKlienta2 == '2' && tablica[1] || wyborKlienta2 == '3' && tablica[2] ||
                                    wyborKlienta2 == '4' && tablica[3] || wyborKlienta2 == '5' && tablica[4]) {
                                cls();
                                System.out.println("Ta pozycja już została przez ciebie wypożyczona.");
                                System.in.read();
                            }
                            if (wyborKlienta2 == '1' && !tablica[0] && karyFinansowe == 0) {
                                cls();
                                Mechanika.setiloscKopii(Mechanika.getiloscKopii() - 1);//odejmowanie od ilości kopii
                                                                // jednego egzemplarza w przypadku jego wypożyczenia
                                tablica[0] = true;
                                Timestamp wypozyczenie1 = new Timestamp(System.currentTimeMillis());
                                tablica2[0] = wypozyczenie1;
                                System.out.println("\t\t\t\t\t   Wypożyczono pozycje nr 1.");
                                System.in.read();
                            }
                            if (wyborKlienta2 == '2' && !tablica[1] && karyFinansowe == 0) {
                                cls();
                                BestHits.setiloscKopii(BestHits.getiloscKopii() - 1);
                                tablica[1] = true;
                                Timestamp wypozyczenie2 = new Timestamp(System.currentTimeMillis());
                                tablica2[1] = wypozyczenie2;
                                System.out.println("\t\t\t\t\t   Wypożyczono pozycje nr 2.");
                                System.in.read();
                            }
                            if (wyborKlienta2 == '3' && !tablica[2] && karyFinansowe == 0) {
                                cls();
                                Documentary.setiloscKopii(Documentary.getiloscKopii() - 1);
                                tablica[2] = true;
                                Timestamp wypozyczenie3 = new Timestamp(System.currentTimeMillis());
                                tablica2[2] = wypozyczenie3;
                                System.out.println("\t\t\t\t\t   Wypożyczono pozycje nr 3.");
                                System.in.read();
                            }
                            if (wyborKlienta2 == '4' && !tablica[3] && karyFinansowe == 0) {
                                cls();
                                Wojna.setiloscKopii(Wojna.getiloscKopii() - 1);
                                tablica[3] = true;
                                Timestamp wypozyczenie4 = new Timestamp(System.currentTimeMillis());
                                tablica2[3] = wypozyczenie4;
                                System.out.println("\t\t\t\t\t   Wypożyczono pozycje nr 4.");
                                System.in.read();
                            }
                            if (wyborKlienta2 == '5' && !tablica[4] && karyFinansowe == 0) {
                                cls();
                                Historia.setiloscKopii(Historia.getiloscKopii() - 1);
                                tablica[4] = true;
                                Timestamp wypozyczenie5 = new Timestamp(System.currentTimeMillis());
                                tablica2[4] = wypozyczenie5;
                                System.out.println("\t\t\t\t\t   Wypożyczono pozycje nr 5.");
                                System.in.read();
                            }
                            if (wyborKlienta2 == '6') break;
                            else if (karyFinansowe != 0) break;
                        }
                    } else if (wyborKlienta == 'o') {
                        karyFinansowe = 0;
                        if (tablica[0]) {//przywracanie domyslnej ilości kopii, instrukcje warunkowe zastosowane po to
                            // aby uniemożliwić oddanie pozycji nie posiadanej przez użytkownika, a co za tym idzie
                            //zwiększyć ilości kopii w wypożyczalni
                            Mechanika.setiloscKopii(Mechanika.getiloscKopii() + 1);
                        }
                        if (tablica[1]) {
                            BestHits.setiloscKopii(BestHits.getiloscKopii() + 1);
                        }
                        if (tablica[2]) {
                            Documentary.setiloscKopii(Documentary.getiloscKopii() + 1);
                        }
                        if (tablica[3]) {
                            Wojna.setiloscKopii(Wojna.getiloscKopii() + 1);
                        }
                        if (tablica[4]) {
                            Historia.setiloscKopii(Historia.getiloscKopii() + 1);
                        }
                        zerowanie(tablica, tablica2);
                    } else if(wyborKlienta == 'i'){//wyświetlane danych dot. administratora i filii
                            cls();
                            System.out.println("Adres filii:\n" + nr1.getAdresFilii() + "\nData utworzenia filii:\n" + nr1.getDatautworzenia());
                            System.out.println("\nDane administratora: \n" + nr1.getImie()  + " " + nr1.getNazwisko() +
                                    "\nData objęcia stanowiska:\n" + nr1.getDataRejestracji());
                            System.out.println("Aby wyjść wciśnij enter.");
                            System.in.read();

                    } else if(wyborKlienta == 'u'){//wyswietlane danych dot. zarejestrowanego użytkownika
                        cls();
                        if(u1.getWiek() == 0){
                        System.out.println("Informacje o użytkowniku:\nImię: " + u1.getImie() +"\nNazwisko: "+
                                u1.getNazwisko() +"\nAdres zamieszkania: "+ u1.getAdres() + "\nWiek: Podano błędny typ wartości"
                                + "\nData rejestracji w systemie wypożyczalni: " +  u1.getDataRejestracji());}
                        else{
                            System.out.println("Informacje o użytkowniku:\nImię: " + u1.getImie() +"\nNazwisko: "+
                                    u1.getNazwisko() +"\nAdres zamieszkania: "+ u1.getAdres() + "\nWiek: " + u1.getWiek()
                                    + "\nData rejestracji w systemie wypożyczalni: " +  u1.getDataRejestracji());
                        }
                        System.out.println("Aby wyjść wciśnij enter.");
                        System.in.read();
                    } else if(wyborKlienta == 'b'){ break;}
                }
            }
    }
    private static boolean roznicaCzasow(Timestamp t1, Timestamp t2) {
        if((t1.getTime() - t2.getTime()) > 10000){
            return true;
        } else {return false;}
    }
    //Funkcja czyszcząca konsolę:
    private static void cls(){
        for (int i = 0; i < 20; i++) System.out.println(" ");
    }
    //Funkcja zerująca zmienne takie jak status wypożyczenia, czas wypozyczenia itp:
    private static void zerowanie(boolean tab[], Timestamp tab1[]){
        for(int i = 0; i<10; i++){
            tab[i] = false;
        }
        for(int j = 0; j<5; j++){
            tab1[j] = Timestamp.valueOf("2000-01-01 00:00:00.00");
        }
    }
}
