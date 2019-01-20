# Software Engineer Case Study by Todd Kofford

This is an example demo project for a simple weather service API that returns specific weather data and records analytic information on users that are using the service. The project includes both the REST web service/API as well as a simple landing page, demonstrating the use of the API.

## Description:
The web service gets data from a 3rd party weather API, by submitting a GET request to [https://j9l4zglte4.execute-api.us-east-1.amazonaws.com/api/ctl/weather]. This information is cached on the server side, and only makes new calls to the 3rd party weather API when the location changes. Each new call to the 3rd party weather API are logged. The web service parses out the resulting JSON to return the following information, which is displayed on the Landing Page:
* Location - City, State
* Current weather conditions for "today"
* High and low temperatures for "today"
* Weather forecast, high & low temperatures for the next 3 days

## Logs:
* The web service generates 2 logs in the <root>logs directory of where the service is running:
** Application log - "weather-forecast_log.log". Typical application log.
** Analytics/Audit log - "weather-forecast_audit.log". Contains date/time, IP Address, and location for each user request. This log can be used for analytical purposes, for example, to track how many users from a specific location requested weather on this service the past 7 days.

## Architecture/Languages:
The web service is a spring-boot RESTful web service, and the landing page is a very minimal HTML page implementing Vue.js [https://vuejs.org/] as the JavaScript framework.

## Requirements for running the application
**_Web Service:_**
* The web service project is located in the <project root>/server directory.
* The web service can be started by running the mvnw (shell script for Linux) or the mvnw.cmd (batch script for windows).
* It is required to have a JAVA_HOME environment variable defined for java 8 or above.
* Alternately, there is also a precompiled, runnable weatherservice.api-0.0.1.jar file provided that can be run via "java -jar weatherservice.api-0.0.1.jar".

**_Landing Page:_**
* The landing page for the web service is located in the <project root>/client directory.
* The landing page can be initialed by opening the file "index.html" file in your web browser.
* The web service MUST be running prior to loading the "Index.html" file.

**_Caveats & Limitations:_**
* Although the "location" is passed into the web service call as a request parameter, the 3rd party weather service doesn't seem to use it, and instead return weather information for the user's current location.
* The 3rd party weather service "might" be able to use a specific location, but not enough information was given to utilize that functionality.
* The analytics/audit log tries to identify the user making the request via the IP Address of the request. However, running locally this may not be a good identifiable/unique attribute for a user.
