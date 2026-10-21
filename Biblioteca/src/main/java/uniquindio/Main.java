package uniquindio;

import uniquindio.model.Biblioteca;
import uniquindio.model.Libro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            //Se crea la biblioteca y los libros
            Biblioteca biblioteca = new Biblioteca("U-Qindio");
            Libro libro1 = new Libro("100 Años de soledad", true);
            Libro libro2 = new Libro("Las itermitencias de la muerte", false);
            Libro libro3 = new Libro("Programacion II", true);
            Libro libro4 = new Libro("Don quijote", true);
            Libro libro5 = new Libro("Harry Potter", false);



        biblioteca.agregarLibro(new Libro("48 leyes del poder", true));
            //se agregan los libros a la biblioteca
            biblioteca.agregarLibro(libro1);
            biblioteca.agregarLibro(libro2);
            biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);





        Iterator<Libro> iterador = biblioteca.iterator();

        while (iterador.hasNext()) {
            Libro libro = iterador.next();
            System.out.println(libro.getTitulo());
        }
    }
}