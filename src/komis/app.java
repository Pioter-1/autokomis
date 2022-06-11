package komis;


import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        KomisSamochodow komisSamochodow = new KomisSamochodow();


        String identyfikator = odczytajparametr (nazwaParametru: "identyfikator");
        String marka = odczytajparametr(nazwaParametru:"marka");
        String model = odczytajparametr(nazwaParametru:"model");
        String rocznik = odczytajparametr(nazwaParametru:"rocznik");

        samochod Samochod =
                new samochod(identyfikator, marka, model, Integer.valueOf(rocznik));

        System.out.println(Samochod);

        komisSamochodow.dodajSamochod(Samochod);

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

