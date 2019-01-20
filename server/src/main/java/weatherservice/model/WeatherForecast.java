package weatherservice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Todd Kofford
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecast {

	private Today today;
	private List<Daily> daily = null;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public WeatherForecast() {
	}

	public Today getToday() {
		return today;
	}

	public void setToday(Today today) {
		this.today = today;
	}

	public List<Daily> getDaily() {
		return daily;
	}

	public void setDaily(List<Daily> daily) {
		this.daily = daily;
	}

	@Override
	public String toString() {
		return "WeatherForcast [today=" + today + ", daily=" + daily + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daily == null) ? 0 : daily.hashCode());
		result = prime * result + ((today == null) ? 0 : today.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		WeatherForecast other = (WeatherForecast) obj;
		if (daily == null) {
			if (other.daily != null) {
				return false;
			}
		} else if (!daily.equals(other.daily)) {
			return false;
		}
		if (today == null) {
			if (other.today != null) {
				return false;
			}
		} else if (!today.equals(other.today)) {
			return false;
		}
		return true;
	}


}