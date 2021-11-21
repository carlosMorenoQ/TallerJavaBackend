package ejercicio16;

import java.util.Random;

public class Persona {
    private static final char SEXO_POR_DEFECTO = 'H';
    private static final char SEXO_HOMBRE = 'H';
    private static final char SEXO_MUJER = 'M';
    private static final byte DEBAJO_PESO_IDEAL = 0;
    private static final byte PESO_IDEAL = -1;
    private static final byte SOBREPESO = 1;

    private String nombre;
    private final String dni;
    private int edad;
    private double peso, altura;
    private char sexo;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.sexo = SEXO_POR_DEFECTO;
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0.0;
        this.altura = 0.0;
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, double peso, double altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
    }

    public byte calularIMC() {
        byte retorno = DEBAJO_PESO_IDEAL;
        double imc = formulaIMC();
        if (imc < 20) {
            retorno = PESO_IDEAL;
        } else if (imc > 25) {
            retorno = SOBREPESO;
        }
        return retorno;
    }

    private double formulaIMC() {
        return this.peso / (Math.pow(this.altura, 2));
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    private char comprobarSexo(char sexo){
        char retorno = SEXO_POR_DEFECTO;
        sexo = Character.toUpperCase(sexo);
        if(sexo==SEXO_HOMBRE || sexo==SEXO_MUJER) {
            retorno = sexo;
        }
        return retorno;
    }

    private String generarDNI(){
        int numeroDNI = (int) (Math.random()*100000000);
        char letraDNI = calcularLetra(numeroDNI);
        return "" + numeroDNI + letraDNI;
    }

    private char calcularLetra(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + dni + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }
}
