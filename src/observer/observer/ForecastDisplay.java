package observer.observer;

import observer.DisplayElement;
import observer.subject.Subject;

/**
 * Created by denis on 3/9/16.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private String tempForecast;
    private String humidForecast;
    private String pressForecast;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast for today: " + "\n"
        + "temperature forecast: " + tempForecast + "\n"
        + "humidity forecast: " + humidForecast + "\n"
        + "pressureForecast: " + pressForecast);
    }

    @Override
    public void update(float temp, float humid, float press) {
        if (temp > 10) {
            tempForecast = "warm";
        } else {
            tempForecast = "cold";
        }

        if (humid > 50) {
            humidForecast = "moisturising";
        } else {
            humidForecast = "dry";
        }

        if (press > 760) {
            pressForecast = "normal";
        } else {
            pressForecast = "tough";
        }

        display();
    }
}
