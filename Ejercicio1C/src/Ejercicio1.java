import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio1 {

    public static PrintStream screen = System.out;// para configurar la salida por pantalla

    public static Scanner keyboard = new Scanner(System.in); //para configurar la entrada por teclado


    public static void main(String[] args) {// aca empieza el codigo
        int num = 0; //para ingresar las entradas en este caso es el numero a ingresar
        int res = 0; //para ingresar las entradas en este caso es la respuesta

        screen.println("ingrese un numero entero"); //para mostrar lo que se debe de ingresar
        num = keyboard.nextInt(); //para que detecte el metodo de entrada en este caso por teclado y
        // en este caso la entrada para la respuesta

        res = num % 2; //esta es para mostrar el residuo de la division

        screen.println("el residuo de dividir " + num +" entre 2 es " + res); //para mostrar la respuesta del problema



    }
}