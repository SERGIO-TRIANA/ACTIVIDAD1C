import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio6_2 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int seconds = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int residue = 0;
        int seconds2 = 0;

        screen.println("vamos a calcular los dias, horas, minutos y segundos de determinados segundos, por favoringrese los segundos");
        seconds = keyboard.nextInt();
        day = seconds/86400;
        residue = seconds%86400;
        hour = residue/3600;
        residue = residue%3600;
        minute = residue/60;
        seconds2 = residue%60;
        screen.println("los dias son: "+ day + " - las horas son: " + hour + " - los minutos son: " + minute +
        " - los segundos son: " + seconds2);
    }
}
