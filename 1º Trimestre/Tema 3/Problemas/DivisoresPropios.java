/**
 * Lee un entero positivo y muestra sus divisores propios, excluyendo el propio numero introducido. En caso de no haber divisores propios
 * distintos a 1, el programa lo indicara claramente. Ademas de mostrar dichos divisores, se mostrara su suma.
 * fecha 20261117
 * @author Alejandro González Prieto
 */
import java.util.Scanner;

public class DivisoresPropios {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, divisores = 0, suma = 0;

        do {
            System.out.print("Introduzca un numero positivo: ");
            n = sc.nextInt();
            if (n < 0)
                System.out.println("ERROR: El numero debe ser positivo");
        } while (n < 0);

        System.out.println("Los divisores propios son: ");

        for(int i = 2; i < n; i++) {
            if (n%i==0) {
                divisores++;
                System.out.println(i);
                suma += i; }

        }
        if (divisores == 0)
            System.out.println("No hay divisores propios distintos a 1.");
        System.out.println("La suma de los divisores propios es " + suma);
    }
}