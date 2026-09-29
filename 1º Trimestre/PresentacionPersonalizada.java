import java.util.Scanner;

public class PresentacionPersonalizada {
public static void main (String[] argss) {
    Scanner sc = new Scanner(System.in);
    String nombre, localidad, estudios;

    System.out.print ("Nombre: ");
    nombre = sc.nextLine();
    System.out.print ("Localidad: ");
    localidad = sc.nextLine();
    System.out.print ("Estudios: ");
    estudios = sc.nextLine();

    System.out.println("Hola, soy " + nombre + " vivo en " + localidad + " y estudio " + estudios + ".");
    }    
}
