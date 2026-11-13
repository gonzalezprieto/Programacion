/**
 * Solicita dos valores numericos, el primer valor debe ser menor o igual al segundo valor
 * si no se cumple esta condicion se vuelve a solicitar los valores hasta que se cumpla dicha
 * condición. A continuación calcula la suma de los números comprendidos estrictamente entre
 * ambos extremos que sean multiplos de 3. En caso de no haber ninguno, la suma debe ser 0.
 * @author Alejandro González Prieto
 */
import java.util.Scanner;
public class SumaDeMultiplos {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B, suma = 0;

    do {
        System.out.print("Introduzca un valor numerico: ");
        A = sc.nextInt();
        System.out.print("Introduzca un segundo valor numerico: ");
        B = sc.nextInt();

        if (A > B)
            System.out.println("ERROR: El segundo valor debe ser mayor o igual al primer valor");

    } while (B < A);

    for(int i = A+1; i <= B-1; i++) {
        if(i%3 == 0)
            suma += i;
        }
    System.out.println("La suma de los numeros multiplos de 3 comprendidos entre " + A + " y " + B + " es " + suma);
    }
}