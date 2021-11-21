package ejercicio17.codigo;

public class Television extends Electrodomestico {
    private static final double DEFAULT_RESOLUCION = 20;
    private static final boolean DEFAULT_SINTONIZADOR_TDT = false;
    private double resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this.resolucion = DEFAULT_RESOLUCION;
        this.sintonizadorTDT = DEFAULT_SINTONIZADOR_TDT;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = DEFAULT_RESOLUCION;
        this.sintonizadorTDT = DEFAULT_SINTONIZADOR_TDT;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        return super.precioFinal() +
                (incrementoPorResolucion() * this.precioBase) +
                incrementoPorSintonizadorTDT();
    }

    private double incrementoPorResolucion() {
        return (this.resolucion > 40) ? 0.3 : 0;
    }

    private double incrementoPorSintonizadorTDT() {
        return (this.sintonizadorTDT) ? 50 : 0;
    }

}
