package uniquindio.model;
import java.util.*;

public class Biblioteca implements Iterable<Libro> {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public Iterator<Libro> iterator() {
        return new Iterator<Libro>() {
            private int indice = 0;
            private Libro siguiente = buscarSiguiente();

            private Libro buscarSiguiente() {
                while (indice < libros.size()) {
                    Libro libro = libros.get(indice);
                    indice++;

                    if (libro.isDisponible() || !libro.isDisponible()) {
                        return libro;
                    }
                }
                return null;
            }

            @Override
            public boolean hasNext() {
                return siguiente != null;
            }

            @Override
            public Libro next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                Libro actual = siguiente;
                siguiente = buscarSiguiente();
                return actual;
            }
        };
    }
}

