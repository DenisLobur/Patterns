package observer;

/**
 * Created by denis on 3/9/16.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temp;
    private float humid;
    private float press;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + "\n"
                + "temperature: " + temp + "\n"
                + "humidity: " + humid + "\n"
                + "pressure: " + press + "\n");
    }

    @Override
    public void update(float temp, float humid, float press) {
        this.temp = temp;
        this.humid = humid;
        this.press = press;
        display();
    }
}
