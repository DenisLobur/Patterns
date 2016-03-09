package observer;

import observer.observer.CurrentConditionDisplay;
import observer.observer.ForecastDisplay;
import observer.subject.WeatherData;

/**
 * Created by denis on 3/9/16.
 */
public class WeatherStation {
    public static void main(String [] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(10, 20, 30);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(5, 40, 800);
        weatherData.setMeasurements(50, 400, 700);
    }
}
