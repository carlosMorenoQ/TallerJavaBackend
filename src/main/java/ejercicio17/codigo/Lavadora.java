package ejercicio17.codigo;

public class Lavadora extends Electrodomestico{
    private static final double DEFAULT_CARGA = 5;
    private double carga;

    public Lavadora(){
        this.carga = DEFAULT_CARGA;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = DEFAULT_CARGA;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        return (this.carga>30)?super.precioFinal()+50:super.precioFinal();
    }

}
