import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio3 {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        float horas = 0;
        float valorhora = 0;
        float porcentajeretencion = 0;
        float salariobruto = 0;
        float retencionenlafuente = 0;
        float salarioneto = 0;

        screen.println("ingrese las horas trabajadas ");
        horas = keyboard.nextFloat();
        screen.println("ingrese el valor por hora ");
        valorhora = keyboard.nextFloat();
        screen.println("ingrese el % de retencion ");
        porcentajeretencion = keyboard.nextFloat();
        salariobruto = horas * valorhora;
        retencionenlafuente = salariobruto * (porcentajeretencion/100);
        salarioneto = salariobruto - retencionenlafuente;
        screen.println(" el salario bruto es " + salariobruto +
        " la retencion en la fuente es " + retencionenlafuente +
        " el salario neto es " + salarioneto);
    }


}
