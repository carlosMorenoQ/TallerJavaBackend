package ejercicio17.codigo;

public class Electrodomestico {

    protected static final String DEFAULT_COLOR = "blanco";
    protected static final char DEFAULT_CONSUMO_ENERGETICO = 'F';
    protected static final double DEFAULT_PRECIO_BASE = 100.0;
    protected static final double DEFAULT_PESO = 5.0;
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precioBase = DEFAULT_PRECIO_BASE;
        this.color = DEFAULT_COLOR;
        this.consumoEnergetico = DEFAULT_CONSUMO_ENERGETICO;
        this.peso = DEFAULT_PESO;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = DEFAULT_COLOR;
        this.consumoEnergetico = DEFAULT_CONSUMO_ENERGETICO;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double precioFinal() {
        return  this.precioBase + incrementoLetra() + incrementoTamanno();
    }

    private char comprobarConsumoEnergetico(char letra) {
        return switch (Character.toUpperCase(letra)) {
            case 'A', 'B', 'C', 'D', 'E' -> Character.toUpperCase(letra);
            default -> 'F';
        };
    }

    private String comprobarColor(String color) {
        return switch (color.toLowerCase()) {
            case DEFAULT_COLOR, "negro", "rojo", "azul", "gris" -> color.toLowerCase();
            default -> DEFAULT_COLOR;
        };
    }

    private double incrementoLetra() {
        return switch (consumoEnergetico) {
            case 'A' -> 100;
            case 'B' -> 80;
            case 'C' -> 60;
            case 'D' -> 50;
            case 'E' -> 30;
            default -> 10;
        };
    }

    private double incrementoTamanno(){
        double retorno = 0.0;
        if(estaDentroRango(0,19, this.peso)){
            retorno = 10;
        }else if(estaDentroRango(20,49, this.peso)){
            retorno = 50;
        }else if(estaDentroRango(50,79, this.peso)){
            retorno = 80;
        }else if(estaDentroRango(80,100000, this.peso)){
            retorno = 100;
        }
        return retorno;
    }

    private boolean estaDentroRango(int limiteInferiorInclusive, int limiteSuperiorInclusive, double valor){
        return  valor >= limiteInferiorInclusive && valor <= limiteSuperiorInclusive;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
