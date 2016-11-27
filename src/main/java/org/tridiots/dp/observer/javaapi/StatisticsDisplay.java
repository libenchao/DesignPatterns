package org.tridiots.dp.observer.javaapi;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object args) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("This is StatisticsDisplay, and temprature is "
                + this.temp + ", and humidity is " + this.humidity
                + ", and pressure is " + this.pressure);
    }
}
