public class ForecastDisplay implements DisplayElement,Observer{
    @Override
    public void update(float temperature, float humidity, float preassure) {
        this.display();
        System.out.println("Temperatura: " + temperature);
        System.out.println("Humedad: " + humidity);
        System.out.println("Presion: " + preassure);

    }

    public void display(){
        System.out.println("-----Pronostico-----");
    }
}
