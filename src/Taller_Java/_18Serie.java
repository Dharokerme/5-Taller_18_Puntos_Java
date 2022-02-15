package Taller_Java;

public class _18Serie implements _18Entregable{
    String titulo;
    int numeroDeTemporadas;
    boolean entregado;
    String genero;
    String creador;

    private static final int numeroDeTemporadasDefault = 3;
    private static final boolean entregadoDefault = false;

    public _18Serie(){
        this.titulo = "";
        this.genero = "";
        this.creador = "";
        this.numeroDeTemporadas = numeroDeTemporadasDefault;
        this.entregado = entregadoDefault;
    }

    public _18Serie(String titulo, String creador){
        this.titulo = titulo;
        this.genero = "";
        this.creador = creador;
        this.numeroDeTemporadas = numeroDeTemporadasDefault;
        this.entregado = entregadoDefault;
    }

    public _18Serie(String titulo, String creador, String genero, int numeroDeTemporadas){
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.entregado = entregadoDefault;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
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

    @Override
    public String toString(){
        return "Titulo: " + getTitulo() + "\n" +
                "Numero de temporadas: " + getNumeroDeTemporadas() + "\n" +
                "Genero: " + getGenero() + "\n" +
                "Creador: " + getCreador() + "";
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        _18Serie serie2 = (_18Serie) a;
        if (serie2.getNumeroDeTemporadas() >= getNumeroDeTemporadas()){
            return serie2.getNumeroDeTemporadas();
        }
        return getNumeroDeTemporadas();
    }
}