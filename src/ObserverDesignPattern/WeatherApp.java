package ObserverDesignPattern;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        weatherStation.addObserver(phoneDisplay);
        weatherStation.setWeather("Sunny");
    }
}
