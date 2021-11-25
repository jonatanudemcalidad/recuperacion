package co.edu.udem.devops.taller1.taller1.ws.service;

import co.edu.udem.devops.taller1.taller1.ws.rest.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);
    private final static String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";
    private final static String API_KEY = "f0fb067e70c52d369f83c331b6926632";

    public Weather getWeatherBy(String zip, String country) {
        RestTemplate restTemplate = new RestTemplate();
        String urlRestWS = String.format("%s?zip=%s,%s&APPID=%s",
                WEATHER_URL,
                zip,
                country,
                API_KEY);
        Weather weatherRoot = restTemplate.getForObject(urlRestWS, Weather.class);
        log.info(weatherRoot.toString());

        return weatherRoot;
    }
}
