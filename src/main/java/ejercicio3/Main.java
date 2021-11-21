package ejercicio3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double radio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingresa el radio del circulo")
        );

        Double area = Math.round(Math.PI * Math.pow(radio, 2) * 100.0) / 100.0;

        JOptionPane.showMessageDialog(null,
                "El area del circulo es: " + area);
    }
}
