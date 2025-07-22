package org.example.designpattternscode.Adapter;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAdapter implements WeatherProvider{

    @Override
    public WeatherData getWeather(double latitude, double longitude) {
        try {
            String urlStr = String.format(
                    "https://api.open-meteo.com/v1/forecast?latitude=%.2f&longitude=%.2f&current=temperature_2m,wind_speed_10m",
                    latitude, longitude
            );

            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) response.append(line);
            reader.close();

            JSONObject json = new JSONObject(response.toString());
            JSONObject current = json.getJSONObject("current");

            double temp = current.getDouble("temperature_2m");
            double wind = current.getDouble("wind_speed_10m");

            return new WeatherData(temp, wind);

        } catch (Exception e) {
            System.err.println("Error fetching weather: " + e.getMessage());
            return null;
        }
    }
}
