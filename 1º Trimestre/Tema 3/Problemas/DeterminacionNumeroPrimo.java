/** 
 * Introduce un número entero, el programa determina si es primo. Se consider aque los números menores de 2 no son primos. Si se encuentra un número
 * divisible distinto a 1 y el mismo numero el programa deja de hacer comprobaciones innecesarias.
 * fecha 20261124
 * @author Alejandro González Prieto
 */

import java.util.Scanner;

public class DeterminacionNumeroPrimo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, candidatoDivisor = 2;
        boolean flagDivisor = false;

        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt();

        while (flagDivisor == false && candidatoDivisor < numero) {
            if(numero%candidatoDivisor == 0)
                flagDivisor = true;
            else
                candidatoDivisor++;
        }

        if (flagDivisor == false || numero < 2)
            System.out.println("El número " + numero + " es primo");
        else
            System.out.println("El número " + numero + " no es primo");
    }
}