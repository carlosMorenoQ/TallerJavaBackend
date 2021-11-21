package ejercicio6;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder pares = new StringBuilder("2");
        StringBuilder impares = new StringBuilder("1");

        for (int i = 3; i <=100; i++) {
            if (Main.parImpar(i)){
                pares.append(",").append(i);
            }else{
                impares.append(",").append(i);
            }
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
