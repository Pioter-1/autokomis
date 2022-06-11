package komis;


import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        KomisSamochodow komisSamochodow = new KomisSamochodow();


        String identyfikator = odczytajparametr ("identyfikator");
        String marka = odczytajparametr("marka");
        String model = odczytajparametr("model");
        String rocznik = odczytajparametr("rocznik");
        samochod Samochod =
                new samochod(identyfikator, marka, model, Integer.valueOf(rocznik));
        komisSamochodow.dodajSamochod(Samochod); //odczytanie danych i dodanie do komisu

        komisSamochodow.wyswietlWszystkieSamochody();
    }

    private static String odczytajparametr(String nazwaParametru){
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz " + nazwaParametru + ":");
        String wartosc = scanner.nextLine();
        System.out.println("wpisano " + nazwaParametru + ": " + wartosc);
        return wartosc;
    }
}

