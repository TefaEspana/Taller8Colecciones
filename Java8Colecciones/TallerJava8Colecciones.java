package Java8Colecciones;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class TallerJava8Colecciones {
    //#1 Crear y gestionar una lista de tareas
    static ArrayList<String> tareas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void agregarTarea() {
        System.out.print("Ingrese la nueva tarea: ");
        String nuevaTarea = scanner.nextLine();
        tareas.add(nuevaTarea);
        System.out.println("Tarea '" + nuevaTarea + "' agregada.");
    }

    public static void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
        } else {
            System.out.println("\n--- Lista de Tareas ---");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ") " + tareas.get(i));
            }
            System.out.println("-----------------------\n");
        }
    }

    public static void marcarCompletada() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }
        System.out.print("Ingrese el # de la tarea completada: ");
        if (scanner.hasNextInt()) {
            int indice = scanner.nextInt();
            scanner.nextLine();
            if (indice >= 1 && indice <= tareas.size()) {
                String tareaCompletada = tareas.remove(indice - 1);
                System.out.println("Tarea '" + tareaCompletada + "' completada (eliminada).");
            } else {
                System.out.println("# de tarea inválido.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
            scanner.nextLine();
        }
    }
    public static void mostrarTareasPendientes() {
        System.out.println("Quedan: #" + tareas.size()+" tareas pendientes");
    }

    //#2 Crear una lista de libros únicos en una biblioteca.
    static Set <String> listaLibros = new HashSet<>();

    public static void agregarLibro(){
        System.out.print("Ingrese el nuevo libro: ");
        String nuevoLibro = scanner.nextLine();
        listaLibros.add(nuevoLibro);
        System.out.println("'" + nuevoLibro + "' agregado.");

    }
    public static void mostrarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No tenemos libros.");
        } else {
            System.out.println("--- Libros Disponibles ---");
            int contador =1;
            for (String libro : listaLibros){
                System.out.println((contador++)+") "+libro);
            }
            System.out.println("-----------------------\n");

        }
    }
    public static void verificarLibro() {
        System.out.print("Que libro que desea buscar: ");
        String libroABuscar = scanner.nextLine();
        if (listaLibros.contains(libroABuscar)) {
            System.out.println("El libro '" + libroABuscar + "' lo tenemos en la biblioteca.");
        } else {
            System.out.println("El libro '" + libroABuscar + "' no esta en la biblioteca.");
        }
    }
    public static void librosExistentes() {
        System.out.println("Tenemos: #" + listaLibros.size()+" libros en existencia");
    }

}
