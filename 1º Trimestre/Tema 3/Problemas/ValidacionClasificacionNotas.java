/**
 * Solicita una nota ente 1 y 10 (ambos incluidos), repitiendo la solicitud mientras el valor este fuera del intervalo. Una vez validado
 * se clasificara la nota segun los siguientes criterios: Desde el 0 al 5: Insuficiente. Del 5 al 6: Suficiente. Del 6 al 7: Bien.
 * Del 7 al 9: Notable. Del 9 al 10: Sobresaliente.
 * fecha 20261117
 * @author Alejandro González Prieto 
 */

import java.util.Scanner;

public class ValidacionClasificacionNotas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Intoduce la nota: ");
            nota = sc.nextDouble();

        if (nota > 10 || nota < 0)
            System.out.println("ERROR: El rango de nota valido es de 0 a 10");
        } while (nota > 10 || nota < 0);
        
        if (nota < 5)
            System.out.println("Insuficiente");
            else if (nota < 6)
                System.out.println("Suficiente");
                else if (nota < 7)
                    System.out.println("Bien");
                    else if (nota < 9)
                        System.out.println("Notable");
                        else
                            System.out.println("Sobresaliente");
    }
}