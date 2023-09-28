import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio9 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        long time = 0;
        long distance = 0;
        long speed = 0;
        screen.println(" vamos a calcular cuanta velocidad se requiere para recorrer x distancia en x tiempo, por favor ingrese el tiempo en horas: ");
        time = keyboard.nextLong();
        screen.println("ingrese la distancia en kilometros: ");
        distance = keyboard.nextLong();
        speed = distance/time;
        screen.println("velocidad necesaria para recorrer la distancia en ese tiempo es de " + speed +" KM/H");






    }
}
