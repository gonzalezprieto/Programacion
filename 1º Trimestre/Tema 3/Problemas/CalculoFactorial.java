/**
 * Se solicita u nnumero entero positivo, comperendido entre  1 y 20 ambos incluidos. El programa calcula el facrotial de dicho númeor solicitado
 * fecha 20261127
 * @author Alejandro González Prieto
 */
import java.util.Scanner;
public class CalculoFactorial {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSolicitado;
        long resultadoFactorial = 1;

        do {
            System.out.print("Introduce un valor entero comprendido entre 1 y 20 ambos incluidos: ");
            numeroSolicitado = sc.nextInt();
        } while(numeroSolicitado < 0 || numeroSolicitado > 20);
        
        for (int i = 2; i<= numeroSolicitado; i++)
            resultadoFactorial *= i;
        System.out.println("El factorial de " + numeroSolicitado + " es " + resultadoFactorial);
    }
}