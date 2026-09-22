/*
* Este programa muestra la plantilla y cómo usar Scanner
* Autor: Alejandro González
* Fecha 22/09/2026
*/
import java.util.Scanner;
public class MiScanner {
    public static void main (String[]args) {

        Scanner sc = new Scanner (System.in);
        String cadena;
        int numero;
        System.out.print("Escribe una frase: ");
        cadena = sc.nextLine();
        System.out.print("Escribe un número: ");
        numero = sc.nextInt();
        System.out.println("Has escrito: " + cadena + " y el número "+ numero);
    }
}