package impl;

import itf.DisplayElement;
import itf.Observer;
import itf.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private float temeperature;
	private float humidity;
	private float pressure;
	
	private Subject weatherData;
	
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}

	
	public void update(float temperature, float humidity, float pressure) {
		this.temeperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temeperature + "F degrees and " + humidity + "% humidity");
		
	}

}
