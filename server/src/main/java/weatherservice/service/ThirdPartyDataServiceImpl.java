package weatherservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.client.RestTemplate;

import weatherservice.model.WeatherForecast;

/**
 * @author Todd Kofford
 *
 */
public class ThirdPartyDataServiceImpl implements ThirdPartyDataService {
	private static final String WEATHER_SERVICE_URL = "https://j9l4zglte4.execute-api.us-east-1.amazonaws.com/api/ctl/weather";
    private static final Logger log = LoggerFactory.getLogger(ThirdPartyDataServiceImpl.class);

    @Cacheable("location")
    @Override
	public WeatherForecast getWeatherForecast(String location) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherForecast weatherForecast = restTemplate.getForObject(WEATHER_SERVICE_URL, WeatherForecast.class);

        log.info(String.format("Non-cached location: '%s' calling getWeatherForecast() data = %s", location, weatherForecast.toString()));

		return weatherForecast;
    }
}
