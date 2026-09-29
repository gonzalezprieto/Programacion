import java.util.Scanner;
public class FichaAlumno {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre, apellido, ciclo;

        System.out.print("Escribe tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Escribe tu apellido: ");
        apellido = sc.nextLine();
        System.out.print("Introduce tu ciclo formativo: ");
        ciclo = sc.nextLine();
        
        System.out.println("Estos son tus datos: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Ciclo: " + ciclo);
    }
}
