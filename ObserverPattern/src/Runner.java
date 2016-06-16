import impl.CurrentConditionsDisplay;
import impl.HeatIndexDisplay;
import impl.WeatherData;

public class Runner {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay heatIndex = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
