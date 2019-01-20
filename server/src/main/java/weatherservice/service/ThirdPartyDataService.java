package weatherservice.service;

import weatherservice.model.WeatherForecast;

/**
 * @author Todd Kofford
 *
 */

public interface ThirdPartyDataService {

	WeatherForecast getWeatherForecast(String locationId);
}
