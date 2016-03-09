package observer;

/**
 * Created by denis on 3/9/16.
 */
public interface Subject {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObservers();
}
