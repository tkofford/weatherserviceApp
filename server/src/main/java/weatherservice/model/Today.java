package weatherservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Todd Kofford
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Today {

	private String description;
	private String highTemperature;
	private String lowTemperature;
	private String state;
	private String city;
	private String utcTime;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Today() {
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHighTemperature() {
		return highTemperature;
	}

	public void setHighTemperature(String highTemperature) {
		this.highTemperature = highTemperature;
	}

	public String getLowTemperature() {
		return lowTemperature;
	}

	public void setLowTemperature(String lowTemperature) {
		this.lowTemperature = lowTemperature;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUtcTime() {
		return utcTime;
	}

	public void setUtcTime(String utcTime) {
		this.utcTime = utcTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((highTemperature == null) ? 0 : highTemperature.hashCode());
		result = prime * result + ((lowTemperature == null) ? 0 : lowTemperature.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((utcTime == null) ? 0 : utcTime.hashCode());
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
		Today other = (Today) obj;
		if (city == null) {
			if (other.city != null) {
				return false;
			}
		} else if (!city.equals(other.city)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (highTemperature == null) {
			if (other.highTemperature != null) {
				return false;
			}
		} else if (!highTemperature.equals(other.highTemperature)) {
			return false;
		}
		if (lowTemperature == null) {
			if (other.lowTemperature != null) {
				return false;
			}
		} else if (!lowTemperature.equals(other.lowTemperature)) {
			return false;
		}
		if (state == null) {
			if (other.state != null) {
				return false;
			}
		} else if (!state.equals(other.state)) {
			return false;
		}
		if (utcTime == null) {
			if (other.utcTime != null) {
				return false;
			}
		} else if (!utcTime.equals(other.utcTime)) {
			return false;
		}
		return true;
	}

}