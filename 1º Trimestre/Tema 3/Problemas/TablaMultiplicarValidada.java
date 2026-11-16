/**
 * Solicita al usuario un valor numerico del 1 al 10, si no esta en el rango solicitado lo pide de nuevo.
 * Una vez solicitao el valor se imprime una tabla de multiplicar del 1 al 10 con el formato "3 * 2 = 6"
 * con el valor numerico solicitado.
 * fecha 20261116
 * @author Alejandro González Prieto
 */

import java.util.Scanner;

public class TablaMultiplicarValidada {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, resultado = 0;

        do {
            System.out.print("Introduce un número del 1 al 10: ");
            A = sc.nextInt();

            if (A > 10 || A < 1)
                System.out.println("ERROR: El numero introducido debe estar entre el 1 y 10");

        } while (A > 10 || A < 1);

        for (int i = 1; i <= 10; i++) {
            resultado = A * i;
            System.out.println(A + " * " + i + " = " + resultado);
        }
    }
}