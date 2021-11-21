package ejercicio14;

import javax.swing.*;

public class Main {

    private static StringBuilder numerosPantalla = new StringBuilder();
    private static int contador = 1;

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        numerosPantalla.append(numero);
        int inicioCiclo = numero + 2;

        for (int i = inicioCiclo; i <= 1000; i += 2) {
            Main.constructorMensajePantalla(i);
            contador++;
        }
        JOptionPane.showMessageDialog(null,
                "Numeros desde el numero ingresado hasta el numero 1000 con saltos de 2 en 2: \n\n" +
                        numerosPantalla);
    }

    /*
     * Se utilizo la funcion modulo para agregar el salto de linea,
     * existe un metodo llamado numeroModulo en donde podemos indicar cuantos numeros tendra cada linea
     * */
    public static void constructorMensajePantalla(int numeroIteracion) {
        int numeroModulo = Main.numeroModulo(contador);

        if (numeroModulo == 0) {
            numerosPantalla.append("\n").append(numeroIteracion).append(",");
        } else if (Main.moduloContador(numeroModulo)) {
            numerosPantalla.append(numeroIteracion);
        } else {
            numerosPantalla.append(",").append(numeroIteracion);
        }

    }

    public static int numeroModulo(int contador) {
        int cantidadNumerosLinea = 18;
        return contador % cantidadNumerosLinea;
    }

    /*
     * Esta porcion de codigo la separe del metodo constuctorMensajePantalla para hacer el codigo mas legible
     * */
    public static boolean moduloContador(int numeroModulo) {
        return numeroModulo == 1 && contador > 1;
    }


}
