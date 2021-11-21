package ejercicio7;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double numero;

        do {
            numero = Main.numero();
        } while (Main.comparacion(numero));
        JOptionPane.showMessageDialog(null,
                "El numero es: " + numero);
    }

    public static double numero() {
        return Double.parseDouble(
                JOptionPane.showInputDialog("Ingresa un numero")
        );
    }

    public static boolean comparacion(double numero) {
        return numero < 0;
    }
}
