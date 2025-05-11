package Java8Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void listaProductos(){
        ArrayList<String> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1 Agregar");
            System.out.println("2 Eliminar");
            System.out.println("3 Mostrar Carrito");
            System.out.println("4 Buscar");
            System.out.println("5 Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer

            switch (opcion){
                case 1:
                    String nuevoProducto;
                    System.out.println("agregar tu producto: ");
                    nuevoProducto = scanner.nextLine();
                    productos.add(0,nuevoProducto);
                    System.out.println("Producto '" + nuevoProducto + "' agregado."); // Feedback al usuario
                    System.out.println(productos);
                    break;
                case 2:
                    String elimiarProducto;
                    System.out.println("elimina un producto");
                    elimiarProducto = scanner.nextLine();
                    productos.remove(elimiarProducto);
                    System.out.println("Este producto fue eliminado ("+elimiarProducto+")");
                    System.out.println(productos);
                    break;
                case 3:
                    System.out.println("Este es tu carrito hasta el momento");
                    System.out.println(productos);
                    break;
                case 4:
                    String buscarProducto;
                    System.out.print("¿Qué producto quieres buscar? ");
                    buscarProducto = scanner.nextLine();
                    boolean encontrado = productos.contains(buscarProducto); //.contains() dice ti tiene o no
                    if (encontrado) { // La condición del if evalúa directamente el boolean
                        System.out.println("Sí tenemos '" + buscarProducto + "' en el carrito.");
                    } else {
                        System.out.println("No tenemos '" + buscarProducto + "' en el carrito.");
                    }
                    break;
                case 5:
                    System.out.println("gracias por venir");
                    break;
                default:
                    System.out.println("Opción NO valida");
            }
        } while (opcion!=5);
        scanner.close();
    }

}
