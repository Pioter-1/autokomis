package komis;

import java.util.HashMap;

public class KomisSamochodow {

    //HashMap do przechowywania samochodow

    private HashMap<String,samochod> samochody = new HashMap<>();

    //metoda dodawania aut

    public void dodajSamochod(samochod Samochod) {
        samochody.put(Samochod.getId(), Samochod);


    }
}
