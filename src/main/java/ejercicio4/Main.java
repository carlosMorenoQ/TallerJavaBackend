package ejercicio4;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        final double IVA = 0.21;

        double precio = Double.parseDouble(
                JOptionPane.showInputDialog("Ingresa el precio del producto")
        );

        double precioIva = Math.round((precio * (IVA + 1) * 100.0) / 100.0);

        JOptionPane.showMessageDialog(null,
                "\nPrecio sin IVA= " + precio +
                        "\nPrecio con IVA= " + precioIva +
                        "\nIVA= " + IVA * 100 + "%"
        );


    }

}
