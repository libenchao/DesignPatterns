package org.tridiots.dp.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.removeIf(o::equals);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> 
                observer.update(this.temp, this.humidity, this.pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
