package ejercicio8;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa un numero de la semana comprendido entre 1 y 7")
        );

        if (Main.analizarDiaLaboral(dia)){
            JOptionPane.showMessageDialog(null,
                    "Es un dia laboral");
        }else{
            JOptionPane.showMessageDialog(null,
                    "No es un dia laboral");
        }
    }

    public static boolean analizarDiaLaboral(int dia){

        switch (dia){
            case 6,7:
                return true;
            default:
                return false;
        }
    }

}
