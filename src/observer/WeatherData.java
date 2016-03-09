package observer;

import java.util.ArrayList;

/**
 * Created by denis on 3/9/16.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temp;
    private float humid;
    private float press;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer o) {
        if (o != null) {
            observers.add(o);
        }
    }

    @Override
    public void deleteObserver(Observer o) {
        int index = observers.indexOf(o);
        for (int i = 0; i < observers.size(); i++) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temp, humid, press);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float press) {
        this.temp = temp;
        this.humid = humid;
        this.press = press;
        measurementChanged();
    }
}
