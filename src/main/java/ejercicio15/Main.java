package ejercicio15;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String opcionSeleccionada;
        do {
            opcionSeleccionada = menu();
            if(!validarOpcionCorrecta(opcionSeleccionada))
                JOptionPane.showMessageDialog(null,"Opcion incorrecta");
        } while (validarSalir(opcionSeleccionada));
    }

    public static String menu() {
        String texto = """
                ****** GESTION CINEMATOGRAFICA *****
                1-NUEVO ACTOR
                2-BUSCAR ACTOR
                3-ELIMINAR ACTOR
                4-MODIFICAR ACTOR
                5-VER TODOS LOS ACTORES
                6-VER PELICULAS DE LOS ACTORES
                7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                8-SALIR""";

        return JOptionPane.showInputDialog(texto);

    }

    public static boolean validarSalir(String opcionSeleccionada) {
        return !opcionSeleccionada.equals("8");
    }

    /*
     * Si la opcion esta dentro del menu retorna true de lo contrario retorna false
     **/
    public static boolean validarOpcionCorrecta(String opcionSeleccionada) {
        return switch (opcionSeleccionada) {
            case "1", "2", "3", "4", "5", "6", "7", "8" -> true;
            default -> false;
        };
    }


}
