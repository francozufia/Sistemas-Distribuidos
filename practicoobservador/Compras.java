package practicoobservador;

public class Compras implements ILibroMalEstado {
    @Override
    public void update(){
        System.out.println("Compras, solicito nueva cotizacion");
    }
}
