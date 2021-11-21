package ejercicio16;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        final String m1 = "Datos de la persona:\n";
        final String m2 = "\nResultado IMC= ";
        final String m3 = "\nMayoria de edad= ";
        int edad;
        char sexo;
        double peso, altura;
        String estadoPesoP1, estadoPesoP2, estadoPesoP3;
        String esMayorEdadP1, esMayorEdadP2, esMayorEdadP3;


        //Creacion persona1
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre persona1");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad persona1"));
        sexo = JOptionPane.showInputDialog("Ingresa el sexo (M=mujer, H=hombre) persona1").charAt(0);
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el peso persona1"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la altura persona1"));
        Persona p1 = new Persona(nombre, edad, peso, altura, sexo);

        //Creacion persona2
        nombre = JOptionPane.showInputDialog("Ingresa el nombre persona2");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad persona2"));
        sexo = JOptionPane.showInputDialog("Ingresa el sexo (M=mujer, H=hombre) persona2").charAt(0);
        Persona p2 = new Persona(nombre, edad, sexo);

        //Creacion Persona3
        Persona p3 = new Persona();
        p3.setNombre("Carlos");
        p3.setEdad(29);
        p3.setAltura(1.75);
        p3.setPeso(80);
        p3.setSexo('H');

        //Texto para el estado de la persona
        estadoPesoP1 = comprobarPeso(p1.calularIMC());
        estadoPesoP2 = comprobarPeso(p2.calularIMC());
        estadoPesoP3 = comprobarPeso(p3.calularIMC());

        //Texto para la mayoria de edad
        esMayorEdadP1 = esMayorEdad(p1.esMayorDeEdad());
        esMayorEdadP2 = esMayorEdad(p2.esMayorDeEdad());
        esMayorEdadP3 = esMayorEdad(p3.esMayorDeEdad());

        //Mostramos en pantalla la informacion
        //Persona1
        JOptionPane.showMessageDialog(null,
                m1 + p1.toString() + m2 + estadoPesoP1 + m3 + esMayorEdadP1);

        //Persona2
        JOptionPane.showMessageDialog(null,
                m1 + p2.toString() + m2 + estadoPesoP2 + m3 + esMayorEdadP2);

        //Persona3
        JOptionPane.showMessageDialog(null,
                m1 + p3.toString() + m2 + estadoPesoP3 + m3 + esMayorEdadP3);
    }

    public static String comprobarPeso(byte estadoPeso) {
        return switch (estadoPeso) {
            case -1 -> "estas en un peso ideal";
            case 0 -> "estas por debajo del peso ideal";
            case 1 -> "tienes sobrepeso";
            default -> "";
        };

    }

    public static String esMayorEdad(boolean verificacion){
        return (verificacion)?"eres mayor de edad":"eres menor de edad";
    }

}
