package zad1;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pozdrav");

        Brod b1 = new Brod(1, 0, 0, 0);
        System.out.println(b1.toString());
        double[] koordinate = new double[3];
        System.out.println("Unesite koordinate:");
        for(int i=0; i<koordinate.length; i++)
            koordinate[i] = sc.nextDouble();

        Brod b2 = new Brod(2, koordinate[0], koordinate[1], koordinate[2]);
        System.out.println(b2.toString());

        System.out.println("Udaljenost broda " + b1.toString() + " i " + b2.toString() + " je: " + b1.udaljenost(b2));

        Niz niz = new Niz("JEEJ");
    }
}
