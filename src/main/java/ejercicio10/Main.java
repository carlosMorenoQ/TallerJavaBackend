package ejercicio10;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String textoConsola = JOptionPane.showInputDialog("Ingresa un texto");
        String textoSinEspacios = textoConsola.replace(" ","");

        JOptionPane.showMessageDialog(null,
                "Texto original:" +
                        "\n" + textoConsola +
                        "\n\nTexto sin espacios:" +
                        "\n" + textoSinEspacios
                        + "\n\n\n");
    }

}
