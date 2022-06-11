package komis;  // obiekt samochodu z danymi - kontruktor

public class samochod {
    private String identyfikator;
    private String marka;
    private String model;
    private int rocznik;

    //kazdy samochod ma id marke model rocznik
    public samochod(String identyfikator, String marka, String model, int rocznik) {
        this.identyfikator = identyfikator;
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
    }

    //gettery

    public String getIdentyfikator() {
        return identyfikator;
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

    //metoda
    @Override
    public String toString() {
        return "samochod{" +
                "identyfikator='" + identyfikator + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rocznik=" + rocznik +
                '}';
    }
}
