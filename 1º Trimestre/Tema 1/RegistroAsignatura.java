import java.util.Scanner;

public class RegistroAsignatura {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String nombreAsignatura, ciclo, profesor, aula;
    int curso;
    
    System.out.print("Nombre de la asignatura: ");
    nombreAsignatura = sc.nextLine();
    System.out.print("Curso: ");
    curso = sc.nextInt();
    sc.nextLine();
    System.out.print("Ciclo formativo: ");
    ciclo = sc.nextLine();
    System.out.print("Profesor: ");
    profesor = sc.nextLine();
    System.out.print("Aula: ");
    aula = sc.nextLine();

    System.out.println("FICHA DE ASIGNATURA");
    System.out.println("Nombre asignatura: " + nombreAsignatura);
    System.out.println("Curso: " + curso);
    System.out.println("Ciclo: " + ciclo);
    System.out.println("Profesor: " + profesor);
    System.out.println("Aula: " + aula);
    }
}