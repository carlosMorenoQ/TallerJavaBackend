package ejercicio11;

import javax.swing.*;

public class Main {
    private static int cantidadApariciones;

    public static void main(String[] args) {

        String textoConsola = JOptionPane.showInputDialog("Ingresa una frase");
        int a, e, i, o, u;

        a = Main.contarAparicionVocal(textoConsola, "a");
        e = Main.contarAparicionVocal(textoConsola, "e");
        i = Main.contarAparicionVocal(textoConsola, "i");
        o = Main.contarAparicionVocal(textoConsola, "o");
        u = Main.contarAparicionVocal(textoConsola, "u");

        JOptionPane.showMessageDialog(null,
                "La frase original es: \n" + textoConsola +
                        "\nLa longitud de la frase es " + textoConsola.length() +
                        "\nCantidad de vocales:" +
                        "\nA = " + a +
                        "\nE = " + e +
                        "\nI = " + i +
                        "\nO = " + o +
                        "\nU = " + u);
    }

    public static int contarAparicionVocal(String texto, String vocal) {
        cantidadApariciones = 0;
        int longitudCadena = texto.length();
        texto = texto.toUpperCase();
        vocal = vocal.toUpperCase();

        for (int x = 0; x < longitudCadena; x++) {
            Main.sumarUnidad(texto.charAt(x), vocal);
        }
        return cantidadApariciones;
    }

    public static void sumarUnidad(char caracter, String vocal) {
        if (String.valueOf(caracter).equals(vocal)) {
            cantidadApariciones = cantidadApariciones + 1;
        }
    }
}
