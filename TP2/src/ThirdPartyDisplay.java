public class ThirdPartyDisplay implements Observer, DisplayElement{
    @Override
    public void display() {
        System.out.println("-----Informacion de Terceros-----");
    }

    @Override
    public void update(float temperature, float humidity, float preassure) {
        this.display();
        System.out.println("Temperatura: " + temperature);
        System.out.println("Humedad: " + humidity);
        System.out.println("Presion: " + preassure);

    }
}
