package Java8Colecciones;

import java.util.HashSet;
import java.util.Set;

public class SetEjem {
    //no permite duplicados
    public static void ejemplHashSet(){
        //Asistencia

        System.out.println("Bienvenidos a la clase");

        Set<String> susNombres = new HashSet<>();

        susNombres.add("Tefa");
        susNombres.add("Tati");
        susNombres.add("Mapu");
        susNombres.add("Mj");
        susNombres.add("Angela");
        susNombres.add("Dani");

        if (susNombres.contains("Tefa")){
            System.out.println("Si, si esta en clase");
        }else {
            System.out.println("No, Esta capando calse");
        }

        // Agregar

        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");
        susNombres.add("Migue");

        //Eliminar

        susNombres.remove("Dani");

        // quiero saber si esta llevo o vacio

        if (susNombres.isEmpty()){
            System.out.println("No hay nadie en clase");
        }else {
            System.out.println("Si, aun hay #"+ susNombres.size()+" learnerd");
        }

        System.out.println("entonces quien sigue en clase?...");
        for (String gente : susNombres){
            System.out.println(gente);
        }
    }
}
