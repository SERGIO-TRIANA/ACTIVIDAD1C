import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio4_1 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int money = 0;
        int of_1000 = 0;
        int of_500 = 0;
        int of_200 = 0;
        int of_100 = 0;
        int of_50 = 0;
        int of_1 = 0;
        int residue = 0;

        screen.println(" vamos a mirar una compsocion de una cantidad de dinero, ingrese la cantidad de dinero: ");
        money = keyboard.nextInt();
        of_1000 = money/1000;
        residue = money%1000;
        of_500 = residue/500;
        residue = residue%500;
        of_200 = residue/200;
        residue = residue%200;
        of_100 = residue/100;
        residue = residue%100;
        of_50 = residue/50;
        residue = residue%50;
        of_1 = residue;
        screen.println("las monedas de 1000 que se requieren son: " + of_1000 + " - las monedas de 500 que se requieren son: " +
        of_500 + " - las monedas de 200 que se requieren son: " + of_200 + " \n - las monedas de 100 que se requieren son: " +
        of_100 + " - las monedas de 50 que se requieren son: " + of_50 + " - las monedas de 1 que se requieren son: " + of_1);







    }
}
