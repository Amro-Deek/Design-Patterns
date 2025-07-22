package org.example.designpattternscode.Adapter;

public class Main {
    public static void main(String[] args) {
        WeatherProvider provider = new WeatherAdapter();
        WeatherData data = provider.getWeather(31.5018, 	34.4666); // Gaza

        if (data != null) {
            System.out.println(data);
        }
    }
}
