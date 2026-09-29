import java.util.Scanner;

public class DatosProducto {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombreProducto, categoriaProducto, codigoProducto, descripcionProducto;

    System.out.print("Introduce el nompre del producto: ");
    nombreProducto = sc.nextLine();
    System.out.print("Introduce la categoria del producto: ");
    categoriaProducto = sc.nextLine();
    System.out.print("Introduce el código del producto: ");
    codigoProducto = sc.nextLine();
    System.out.print("Introduce la descripción del producto: ");
    descripcionProducto = sc.nextLine();

    System.out.println("FICHA DEL PRODUCTO");
    System.out.println("Nombre: " + nombreProducto);
    System.out.println("Categoria: " + categoriaProducto);
    System.out.println("Codigo: " + codigoProducto);
    System.out.println("Descripcion: " + descripcionProducto);
    }
}
