import java.util.Scanner;

public class FichaEquipoInformatico {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String fabricante, modelo, sistemaOperativo, nombreEquipo, usuarioPrincipal;

    System.out.print ("Fabricante del equipo: ");
    fabricante = sc.nextLine();
    System.out.print ("Modelo: ");
    modelo = sc.nextLine();
    System.out.print ("Sistema Operativo: ");
    sistemaOperativo = sc.nextLine();
    System.out.print ("Nombre del equipo: ");
    nombreEquipo = sc.nextLine();
    System.out.print ("Usuario principal: ");
    usuarioPrincipal = sc.nextLine();

    System.out.println ("FICHA COMPLETA DEL EQUIPO");
    System.out.println ("Fabricante: " + fabricante);
    System.out.println ("Modelo: " + modelo);
    System.out.println ("Sistema operativo: " + sistemaOperativo);
    System.out.println ("Nombre del equipo: " + nombreEquipo);
    System.out.println ("Usuario principal: " + usuarioPrincipal);
    }
}