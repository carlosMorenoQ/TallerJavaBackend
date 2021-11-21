package ejercicio12;



import org.apache.commons.lang3.StringUtils;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String textoConsola1 = JOptionPane.showInputDialog("Ingresa la primer palabra");
        String textoConsola2 = JOptionPane.showInputDialog("Ingresa la segunda palabra");

        if ( textoConsola1.equals(textoConsola2)){
            JOptionPane.showMessageDialog(null,
                    "Las palabras son iguales");
        }else{
            JOptionPane.showMessageDialog(null,
                    "Las palabras no son iguales, sus diferencias son: \n" +
                            Main.retornarDiferencias(textoConsola1,textoConsola2));
        }
    }

    public static String retornarDiferencias(String texto1, String texto2){
        int longitudTexto1= texto1.length();
        int longitudTexto2 = texto2.length();
        String retorno;

        if(longitudTexto1>longitudTexto2){
            retorno =  StringUtils.difference(texto2,texto1);
        }else{
            retorno= StringUtils.difference(texto1,texto2);
        }
        return retorno;
    }
}
