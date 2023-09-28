import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio5 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {

        float peso = 0;
        float dolar = 0;
        float euro = 0;

        screen.println("ingrese los pesos ");
        peso = keyboard.nextFloat();
        dolar = peso/4063;
        euro = peso/4378;
        screen.println("la cantidad de dolares son: " + dolar+" - la cantidad de euros son: "+ euro);

    }
}
