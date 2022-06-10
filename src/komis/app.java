package komis;


import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz id:");
        String identifi = scanner.nextLine();
        System.out.println("id:"+ identifi);

        System.out.println("wpisz marké:");
        String marka = scanner.nextLine();
        System.out.println("marka:"+ marka);

        System.out.println("wpisz model:");
        String model = scanner.nextLine();
        System.out.println("Model:"+ model);

        System.out.println("wpisz rocznik:");
        String rocznik = scanner.nextLine();
        System.out.println("rocznik:"+ rocznik);

        samochod samochod = new samochod(identifi, marka, model, Integer.valueOf(rocznik));

    }
}
