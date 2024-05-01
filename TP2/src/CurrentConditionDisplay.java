public class CurrentConditionDisplay implements Observer, DisplayElement{
    @Override
    public void display() {
        System.out.println("-----Condiciones Actuales-----");
    }

    public void update(float temperature, float humidity, float preassure) {
        this.display();
        System.out.println("Temperatura: " + temperature);
        System.out.println("Humedad: " + humidity);
        System.out.println("Presion: " + preassure);

    }
}
