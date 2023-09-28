import java.io.PrintStream;
import java.util.Scanner;

public class ejercicio4 {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int dinero = 0;
        int de_1000 = 0;
        int de_500 = 0;
        int de_200 = 0;
        int de_100 = 0;
        int de_50 = 0;
        int de_1 = 0;

        screen.println("ingrese la cantidad de dinero: ");
        dinero = keyboard.nextInt();
        de_1000 = dinero / 1000;
        de_500 = (dinero % 1000) / 500;
        de_200 = ((dinero % 1000) % 500)/ 200;
        de_100 = (((dinero % 1000) % 500) % 200)/100;
        de_50 = ((((dinero%1000)%500)%200)%100)/50;
        de_1 = (((((dinero%1000)%500)%200)%100)%50);
        screen.println(("las monedas de 1000 que se requieren son: " + de_1000 +
        " - las monedas de 500 que se requieren son: " + de_500 + " - las monedas de 200 que se requieren son: " + de_200
        + " - las monedas de 100 que se requieren son: " + de_100 + " - las monedas de 50 que se requieren son: " + de_50 +
        " - las monedas de 1 que se requieren son: " + de_1));


    }
}