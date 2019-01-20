package weatherservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import weatherservice.model.WeatherForecast;
import weatherservice.service.ThirdPartyDataService;

/**
 * @author Todd Kofford
 *
 */

@RestController
public class WeatherServiceController {
	private static final Logger audit = LoggerFactory.getLogger("audit-log");
    private static final Logger log = LoggerFactory.getLogger(WeatherServiceController.class);

	@Autowired
	private ThirdPartyDataService weatherService;

	@CrossOrigin
    @RequestMapping(value = "/api/weather", method = RequestMethod.GET)
    public WeatherForecast getWeatherForcast(@RequestParam(value="location", defaultValue="") String location) {
    	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

    	WeatherForecast forecast = weatherService.getWeatherForecast(location);

    	log.info("Location: {}", location);
    	audit.info(String.format("\"User IP = %s\",\"Location = %s, %s\"", getClientIp(request), forecast.getToday().getCity(), forecast.getToday().getState()));

        return forecast;
    }

    /**
     * Retrieve the IP Address of the user making the request, if possible
     *
     * @param request
     * @return
     */
    private static String getClientIp(HttpServletRequest request) {
        String remoteAddr = "";

        if (request != null) {
            remoteAddr = request.getHeader("X-FORWARDED-FOR");
            if (remoteAddr == null || "".equals(remoteAddr)) {
                remoteAddr = request.getRemoteAddr();
            }
        }

        return remoteAddr;
    }
}
