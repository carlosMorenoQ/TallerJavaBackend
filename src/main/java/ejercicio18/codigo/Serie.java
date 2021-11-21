package ejercicio18.codigo;

public class Serie implements Entregable, Comparable{

    private static final int DEFAULT_NUMERO_TEMPORADAS = 3;
    private static final boolean DEFAULT_ENTREGADO = false;
    private static final boolean DEFAULT_PRESTADO = false;
    private static final String DEFAULT_TITULO = "titulo general";
    private static final String DEFAULT_GENERO = "genero general";
    private static final String DEFAULT_CREADOR = "creador general";

    private String titulo;
    private String genero;
    private String creador;
    private int numeroTemporadas;
    private boolean entregado;
    private boolean prestado;

    public Serie() {
        this.titulo = DEFAULT_TITULO;
        this.genero = DEFAULT_GENERO;
        this.creador = DEFAULT_CREADOR;
        this.numeroTemporadas = DEFAULT_NUMERO_TEMPORADAS;
        this.entregado = DEFAULT_ENTREGADO;
        this.prestado = DEFAULT_PRESTADO;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = DEFAULT_GENERO;
        this.numeroTemporadas = DEFAULT_NUMERO_TEMPORADAS;
        this.entregado = DEFAULT_ENTREGADO;
        this.prestado = DEFAULT_PRESTADO;
    }

    public Serie(String titulo, String genero, String creador, int numeroTemporadas, boolean prestado) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroTemporadas = numeroTemporadas;
        this.prestado = prestado;
        this.entregado = DEFAULT_ENTREGADO;
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
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
        Serie serie = (Serie)a;
        return Integer.valueOf(serie.getNumeroTemporadas()).compareTo(this.numeroTemporadas);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", prestado=" + prestado +
                '}';
    }
}
