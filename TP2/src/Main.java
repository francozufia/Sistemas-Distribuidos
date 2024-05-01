public class Main {
    public static void main(String[] args) {
        WheaterData wheater = new WheaterData();
        wheater.registerObserver(new ForecastDisplay());
        wheater.registerObserver(new CurrentConditionDisplay());
        wheater.registerObserver(new ThirdPartyDisplay());
        wheater.registerObserver(new StaticsDisplay());
        wheater.setHumidity(30.5f);
        wheater.setPressure(1000);
        wheater.setTemperature(30);
        wheater.notifyObserver();
    }
}
