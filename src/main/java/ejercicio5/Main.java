package ejercicio5;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        StringBuilder pares = new StringBuilder("2");
        StringBuilder impares = new StringBuilder("1");
        int contador = 3;

        while (contador <= 100) {
            if (Main.parImpar(contador)) {
                pares.append(",").append(contador);
            } else {
                impares.append(",").append(contador);
            }
            contador++;
        }
        Main.mostrarResultado(pares,impares);
    }

    public static boolean parImpar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarResultado(StringBuilder pares, StringBuilder impares) {
        JOptionPane.showMessageDialog(null,
                "Numeros pares del 1 al 100:" +
                "\n"+pares +
                "\n\nNumero impares del 1 al 100:" +
                "\n"+ impares + "\n\n");
    }

}
