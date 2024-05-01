import java.util.ArrayList;

public class WheaterData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private static ArrayList<Observer> observers = new ArrayList<Observer>();

    public static ArrayList<Observer> getObservers() {
        return observers;
    }

    public static void setObservers(ArrayList<Observer> observers) {
        WheaterData.observers = observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observador) {
        observers.add(observador);
    }

    @Override
    public void removeObserver(Observer observerador) {
        observers.remove(observerador);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            System.out.println("Se notifico ");
            observer.update(getTemperature(), getHumidity(), getPressure());
        }
    }
}

