package practicoobservador;


public class Stock implements ILibroMalEstado {
    @Override
    public void update(){
        System.out.println("Stock, le doy de baja al libro solicitado");
    }
}
