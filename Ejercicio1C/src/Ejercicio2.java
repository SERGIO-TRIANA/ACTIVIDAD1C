import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio2 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long celular = 0;
        long respuesta = 0;

        screen.println("vamos a hallar el prefijo de un celular, por favor ingrese el numero de celular: ");
        celular = keyboard.nextLong();
        respuesta = celular/10000000;

        screen.println("el prefijo es el: " + respuesta);
    }
}
