package org.tridiots.dp.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
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
        System.out.println("This is CurrentConditionsDisplay, and temprature is "
                + this.temp + ", and humidity is " + this.humidity
                + ", and pressure is " + this.pressure);
    }
}
