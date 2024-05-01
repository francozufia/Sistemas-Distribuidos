
package practicoobservador;

public class Main {


    public static void main (String [] args ){
        AlarmaLibro alarma = new AlarmaLibro();
        alarma.attach(new Compras());
        alarma.attach(new Administracion());
        alarma.attach(new Stock());

        Libro libro = new Libro();
        libro.setEstado("MALO");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.devuelveLibro(libro);


    }


    
}
