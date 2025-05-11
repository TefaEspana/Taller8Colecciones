package Java8Colecciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapEj {
    //no puede tener claves repetidas (valor si pero clave NO)
    public  static void ejemploHashMap() {
        Map<String, Double> inventario = new HashMap<>();
        System.out.println("Bienvenidos a las fruteria");

        //Agrear
        inventario.put("Manzana", 1.40);
        inventario.put("Mandarina", 2.40);
        inventario.put("Uva", 5.40);
        inventario.put("Papaya", 3.40);
        inventario.put("Sandia", 7.40);
        System.out.println("Nuestro inventaio es: ");
        for (String fruta : inventario.keySet()) {// .keySet() guarda las claves en un arreglo
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        //el cliente se acerca y pide
        String frutaCliente = "Mandarina";
        System.out.println("El cliente pidio " + frutaCliente);

        if (inventario.containsKey(frutaCliente)) {
            System.out.println("Si Tenemos, " + frutaCliente);
        } else {
            System.out.println("No Tenemos, " + frutaCliente);
        }

        System.out.println("Compro Mandarina");
        inventario.remove("Mandarina");

        System.out.println("Inventario Actual");
        for (String fruta : inventario.keySet()) {// .keySet() guarda las claves en un arreglo
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        System.out.println(inventario.size());

    }
}
