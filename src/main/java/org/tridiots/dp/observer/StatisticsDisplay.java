package org.tridiots.dp.observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("This is StatisticsDisplay, and temprature is "
                + this.temp + ", and humidity is " + this.humidity
                + ", and pressure is " + this.pressure);
    }
}
