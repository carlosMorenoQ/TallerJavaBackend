package ejercicio1;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        int numero1;
        int numero2;

        for (int i = 0; i < 10; i++) {

            numero1 = (int) Math.floor(Math.random() * 10);
            numero2 = (int) Math.floor(Math.random() * 10);

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
}
