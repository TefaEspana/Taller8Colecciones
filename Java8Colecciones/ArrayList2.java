package Java8Colecciones;

import java.util.ArrayList;

public class ArrayList2 {
    //permite elementos duplicados
    public static void arrayListEje1(){
        ArrayList<String> frutas = new ArrayList<>();
        //ADD
        frutas.add("Uva");
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.add("Fresa");
        frutas.add("Sandia");

        // mostras la lista
        System.out.println("mi lista de frutas es: " +frutas);

        //insertar informacion en la lista

        frutas.add(1,"Mandarina");
        System.out.println("mi lista de frutas es: " +frutas);

        //Eliminar por su valor
        frutas.remove("Uva"); // si esta repetida borra la primera que encuentra
        System.out.println("mi lista de frutas es: " +frutas);
        frutas.remove("Pera");
        System.out.println("mi lista de frutas es: " +frutas);

        // Obtener el valor
        String frutaObtenida = frutas.get(2);
        System.out.println("lo que esta en la posicion 2 es: " + frutaObtenida);

        // buscar una fruta en la lista
        boolean siOno = frutas.contains("Fresa");
        System.out.println("contiene o no contiene una Fresa " + siOno);
        boolean siOno1 = frutas.contains("Pera");
        System.out.println("contiene o no contiene una Pera " + siOno1);

    }
}


