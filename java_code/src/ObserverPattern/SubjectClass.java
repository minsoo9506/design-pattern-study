package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectClass implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public SubjectClass() {
        observers = new ArrayList<Observer>();
    };

    public void registerObserver(Observer o) {
        observers.add(o);
    };

    public void removeObserver(Observer o) {
        observers.remove(o);
    };

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    };

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    };

    public float getTemperature() {
        return this.temperature;
    };

    public float getHumidity() {
        return this.humidity;
    };

    public float getPressure() {
        return this.pressure;
    };
}
