package observer;

/**
 * Created by denis on 3/9/16.
 */
public class WeatherStation {
    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(10, 20, 30);
        weatherData.setMeasurements(20, 210, 40);
    }
}
