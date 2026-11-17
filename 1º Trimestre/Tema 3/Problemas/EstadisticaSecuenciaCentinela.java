/**
 * Lee valores enteros hasta introducir 0, este no forma parte de la secuencia de valores. Se mostrara la candidad de datos introducidos,
 * su suma y la cantidad de positivos y negativos. Si se intoduce mas al menos un valor tambien mostrara la media.
 * fecha 20261116
 * @author Alejandro González Prieto
 */

import java.util.Scanner;

public class EstadisticaSecuenciaCentinela {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int positivo = 0, negativo = 0, suma = 0, numDatos = 0;
        double media= 0;
        final int CENTINELA = 0;
        
        System.out.print("Introduce un valor, para terminar, introduce " + CENTINELA + ": ");
        int valor = sc.nextInt();

        while (valor != CENTINELA) {
            numDatos++;
            suma += valor;
            
            if (valor < 0)
                negativo++;
            else
                positivo++;

            if (numDatos > 0)
                media = (double)suma / numDatos;

        System.out.print("Introduce un valor, para terminar, introduce " + CENTINELA + ": ");
        valor = sc.nextInt();
        }

        System.out.println("Cantidad de datos introducidos: " + numDatos);
        System.out.println("Suma de datos intoroducidos: " + suma);
        System.out.println("Cantidad de datos positovos introducidos: " + positivo);
        System.out.println("Cantidad de datos negativos introducidos: " + negativo);

        if (media > 0)
            System.out.println("Media de la suma de los datos introducidos: " + media);
    }
}