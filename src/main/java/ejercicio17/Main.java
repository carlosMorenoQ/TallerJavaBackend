package ejercicio17;

import ejercicio17.codigo.Electrodomestico;
import ejercicio17.codigo.Lavadora;
import ejercicio17.codigo.Television;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora(130, "negro", 'D', 32, 7.2);
        electrodomesticos[1] = new Lavadora(80, "azul", 'B', 60, 12);
        electrodomesticos[2] = new Lavadora(160, 46);
        electrodomesticos[3] = new Lavadora(300, 80);
        electrodomesticos[4] = new Lavadora();
        electrodomesticos[5] = new Television();
        electrodomesticos[6] = new Television();
        electrodomesticos[7] = new Television(420, 30);
        electrodomesticos[8] = new Television(340, 12);
        electrodomesticos[9] = new Television(340, "verde", 'C', 55, 60, true);

        for (Electrodomestico elec : electrodomesticos) {
            System.out.println(elec.precioFinal());
            if (elec instanceof Lavadora) {
                sumaLavadoras += elec.precioFinal();
            } else {
                sumaTelevisores += elec.precioFinal();
            }
        }

        JOptionPane.showMessageDialog(null,
                "Precio clase Lavadores: " + sumaLavadoras + "\n" +
                        "Precio clase Televisores: " + sumaTelevisores + "\n" +
                        "Precio electrodomesticos: " + (sumaLavadoras + sumaTelevisores));
    }
}
