package ejercicio18.codigo;

public class Videojuego implements Entregable, Comparable {

    private static final double DEFAULT_HORAS_ESTIMADAS = 10;
    private static final boolean DEFAULT_ENTREGADO = false;
    private static final boolean DEFAULT_PRESTADO = false;
    private static final String DEFAULT_TITULO = "titulo general";
    private static final String DEFAULT_GENERO = "genero general";
    private static final String DEFAULT_COMPANNIA = "compañia general";
    private String titulo;
    private String genero;
    private String compania;
    private double horasEstimadas;
    private boolean entregado;
    private boolean prestado;


    public Videojuego() {
        this.titulo = DEFAULT_TITULO;
        this.horasEstimadas = DEFAULT_HORAS_ESTIMADAS;
        this.genero = DEFAULT_GENERO;
        this.compania = DEFAULT_COMPANNIA;
        this.prestado = DEFAULT_PRESTADO;
        this.entregado = DEFAULT_ENTREGADO;
    }

    public Videojuego(String titulo, double horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = DEFAULT_GENERO;
        this.compania = DEFAULT_COMPANNIA;
        this.prestado = DEFAULT_PRESTADO;
        this.entregado = DEFAULT_ENTREGADO;
    }

    public Videojuego(String titulo, String genero, String compania, double horasEstimadas, boolean prestado) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
        this.prestado = prestado;
        this.entregado = DEFAULT_ENTREGADO;
    }
    @Override
    public void entregar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.prestado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuego videojuego = (Videojuego) a;
        return Double.valueOf(videojuego.horasEstimadas).compareTo(this.horasEstimadas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", prestado=" + prestado +
                '}';
    }
}
