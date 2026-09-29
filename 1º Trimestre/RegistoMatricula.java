import java.util.Scanner;

public class RegistoMatricula {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String nombre, prApellido, segApellido, ciclo, grupo;
    int curso;
    
    System.out.print("Nombre: ");
    nombre = sc.nextLine();
    System.out.print("Primer apellido: ");
    prApellido = sc.nextLine();
    System.out.print("Segundo apellido: ");
    segApellido = sc.nextLine();
    System.out.print("Ciclo: ");
    ciclo = sc.nextLine();
    System.out.print("Curso: ");
    curso = sc.nextInt();
    sc.nextLine();
    System.out.print("Grupo: ");
    grupo = sc.nextLine();

    System.out.println(nombre + " " + prApellido + " " + segApellido + "se matricula en el ciclo " + ciclo + " con el grupo " + grupo + " en el curso " + curso);
    
    }
}
