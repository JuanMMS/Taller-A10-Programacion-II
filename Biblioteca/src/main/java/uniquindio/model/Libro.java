package uniquindio.model;

public class Libro {
    private String titulo;
    private boolean disponible;

    public Libro(String titulo, boolean disponible) {
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Libro" +
                "titulo='" + titulo + " | " +
                "disponible=" + disponible ;
    }
}