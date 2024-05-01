
package practicoobservador;

public class Biblioteca {
    public void devuelveLibro(Libro libro){
       if (libro.getEstado().equals("MALO")){
        AlarmaLibro alarmalibro = new AlarmaLibro();
        alarmalibro.notifyObservers();
    }
    }
}
