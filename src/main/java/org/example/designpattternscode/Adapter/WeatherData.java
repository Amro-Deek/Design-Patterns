package org.example.designpattternscode.Adapter;

public class WeatherData {
    public double temperature;
    public double windSpeed;

    public WeatherData(double temperature, double windSpeed) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "°C, Wind: " + windSpeed + " km/h";
    }
}

