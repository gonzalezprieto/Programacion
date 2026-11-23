/**
 * Solicita cuantas mediciones se van a introdicir. El numero de mediciones debe ser positivo. Posteriormente, se 
 * realizara la SUMA, MEDIA, MAXIMO y MINIMO de esas mediciones introducidas.
 * fecha 20261116
 * @author Alejandro González Prieto
 */

import java.util.Scanner; 

public class EstadisticaNumero {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, suma = 0, media = 0, maximo = 0, minimo = 0;
        int mediciones;

        do { 
            System.out.print("¿Cuantas mediciones quieres introducir? ");
            mediciones = sc.nextInt();
            if ( mediciones <= 0)
                System.out.println("El numero de mediciones debe ser positivo");
        } while (mediciones <= 0);

        for (int i = 0; i < mediciones; i++) {
            System.out.print("Introduce el valor de una medición: ");
            valor = sc.nextInt();
            
            if (i == 0) {
                minimo = valor;
                maximo = valor;
            } else {
                if ( valor > maximo)
                    maximo = valor;

                if ( valor < minimo)
                    minimo = valor;
            }
            suma += valor; 

        }
        media = suma / mediciones;
        System.out.print("La suma de todas las mediciones es " + suma + ", la media es " + media + ", el maximo es " + maximo + " y el minimo es " + minimo);
    }
}