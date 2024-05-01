package practicoobservador;

public class Administracion implements ILibroMalEstado {
    @Override
    public void update(){
        System.out.println("Administracion, envio una queja formal");
    }
}
