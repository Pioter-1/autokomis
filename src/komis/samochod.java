package komis;  // obiekt samochodu z danymi - kontruktor

public class samochod {
    private String id;
    private String marka;
    private String model;
    private int rocznik;

    //kazdy samochod ma id marke model rocznik
    public samochod(String id, String marka, String model, int rocznik) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
    }

    //gettery

    public String getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRocznik() {
        return rocznik;
    }


}
