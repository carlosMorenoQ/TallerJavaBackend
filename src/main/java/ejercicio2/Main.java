package ejercicio2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        double numero1;
        double numero2;

            numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero1"));
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero2"));

            if (numero1 == numero2) {
                JOptionPane.showMessageDialog(
                        null,
                        "Numero1= " + numero1 +
                                "\nNumero2= " + numero2 +
                                "\n\nLos numeros son iguales\n");
            } else if (numero1 > numero2) {
                JOptionPane.showMessageDialog(
                        null,
                        "Numero1= " + numero1 +
                                "\nNumero2= " + numero2 +
                                "\n\nEl Numero1 Es mayor\n");
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Numero1= " + numero1 +
                                "\nNumero2= " + numero2 +
                                "\n\nEl Numero2 Es mayor\n");
            }

    }
}
