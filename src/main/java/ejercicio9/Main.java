package ejercicio9;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String texto = "La sonrrisa sera la mejor arma contra la tristeza";
        String textoConsola = JOptionPane.showInputDialog("Ingresa un texto que quieras concatenar");

        JOptionPane.showMessageDialog(null,
                reemplazarLetra(texto, "a", "e") + " " + textoConsola);
    }

    public static String reemplazarLetra(String texto, String caracterAntiguo, String caracterNuevo) {
        return texto.replace(caracterAntiguo, caracterNuevo);
    }
}
